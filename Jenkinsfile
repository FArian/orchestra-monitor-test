pipeline {
    agent any
    stages {
        stage('Checkout Self') {
            steps {
                echo 'Checkouting Self..'
            }
        }
        stage('Expose report') {
            steps {
                echo 'Testing..'

            }
        }
        stage('Import results to Xray') {
            def info = '''{ {
                "fields": {
                    "project": {
                        "key": "OTE"
                    },
                    "summary": "Specific Test Execution for Release 4.8.2.4-RC-1 (Generated by job: ${BUILD_TAG})",
                    "issuetype": {
                        "id": "10302"
                    }
                }
            }
        }'''
        steps {
            echo 'Importing  results to Xray....'
            step([$class: 'XrayImportBuilder',
                endpointName: '/cucumber/multipart',
                importFilePath: 'target/cucumber.json',
                importInParallel: 'false',
                importInfo: info,
                inputInfoSwitcher: 'fileContent',
                serverInstance: 'SERVER-6c495579-0bb5-49e1-9831-2c9c86e61301'
            ])
            echo 'Importing  results to Xray finished'
        }
    }
}
}
