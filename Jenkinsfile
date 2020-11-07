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
                importInfo: '''project = OTE fixVersion = "ORC 4.8.2.4" issuekey = OTE-21 ''', 
                inputInfoSwitcher: 'fileContent',
                serverInstance: 'SERVER-6c495579-0bb5-49e1-9831-2c9c86e61301'])
                echo 'Importing  results to Xray finished'
            }
        }
    }
}
