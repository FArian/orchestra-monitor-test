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
        steps {
            echo 'Importing  results to Xray....'
            step([$class: 'XrayImportBuilder',
                endpointName: '/cucumber/multipart',
                importFilePath: 'target/cucumber.json',
                importInParallel: 'false',
                importInfo: '''TestExecutionFieldId=10302 ProjectKey=OTE summary=Specific Test Execution for Release 4.8.2.4-RC-1''',,
                inputInfoSwitcher: 'fileContent',
                serverInstance: 'SERVER-6c495579-0bb5-49e1-9831-2c9c86e61301'
            ])
            echo 'Importing  results to Xray finished'
        }
    }
}
}
