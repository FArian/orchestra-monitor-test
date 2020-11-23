pipeline {
    agent any
    stages {
        stage('Checkout Self') {
            steps {
                echo 'Checkouting Self...'
            }
        }
         stage('Build Clean') {
            steps {
                echo 'Cleaning...'

            }
        }
        stage('Build Install') {
            steps {
                echo 'Installing...'

            }
        }
        stage('Import cucumber test results to Xray') {
        steps {
            echo 'Importing  results to Xray....'
            step([$class: 'XrayImportBuilder', endpointName: '/cucumber', importFilePath: 'target/cucumber.json',description = "[BUILD_URL|${env.BUILD_URL}]" ,serverInstance: '6c495579-0bb5-49e1-9831-2c9c86e61301'])
            echo 'Importing  results to Xray finished'
        }
    }
   }
}
