pipeline {
    agent any
    stages {
        stage('Checkout Self') {
            steps {
                echo 'Checkouting Self...'
            }
        }
         stage('Build') {
            steps {
                echo 'Cleaning...'

            }
        }
        stage('Build') {
            steps {
                echo 'Installing...'

            }
        }
        stage('Import cucumber test results to Xray') {
        steps {
            echo 'Importing  results to Xray....'
            step([$class: 'XrayImportBuilder', endpointName: '/cucumber', importFilePath: 'target/cucumber.json', serverInstance: '6c495579-0bb5-49e1-9831-2c9c86e61301'])
            echo 'Importing  results to Xray finished'
        }
    }
   }
}
