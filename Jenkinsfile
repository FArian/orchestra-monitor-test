node() {

    def repoURL = 'https://github.com/FArian/orchestra-monitor-test.git'

    stage("Prepare Workspace") {
        cleanWs()
        env.WORKSPACE_LOCAL = sh(returnStdout: true, script: 'pwd').trim()
        env.BUILD_TIME = sh(returnStdout: true, script: 'date +%F-%T').trim()
        echo "Workspace set to:" + env.WORKSPACE_LOCAL
        echo "Build time:" + env.BUILD_TIME
    }
    stage('Checkout Self') {
        git branch: 'master', credentialsId: '', url: repoURL
    }
    stage('Cucumber Tests') {
     
	  echo Cucumber Tests
    }
    stage('Expose report') {
        archive "**/cucumber.json"
        cucumber '**/cucumber.json'
    }
	stage('Import results to Xray') {

		def description = "[BUILD_URL|${env.BUILD_URL}]"
		def labels = '["regression","automated_regression"]'
		def environment = "Windows"
		def testExecutionFieldId = 10302
		def testEnvironmentFieldName = "customfield_10725"
		def projectKey = "OTE"
		def xrayConnectorId = '3ecdab2a-9ccb-4b99-99cb-2312e9135dc5'
		def info = '''{
				"fields": {
					"project": {
					"key": "''' + projectKey + '''"
				},
				"labels":''' + labels + ''',
				"description":"''' + description + '''",
				"summary": "Specific Test Execution for Release 4.8.2.4-RC-1 @ ''' + env.BUILD_TIME + ' ' + environment + ''' " ,
				"issuetype": {
				"id": "''' + testExecutionFieldId + '''"
				},
				"''' + testEnvironmentFieldName + '''" : [
				"''' + environment + '''"
				]
				}
				}'''

			echo info

			step([$class: 'XrayImportFeatureBuilder', endpointName: '/cucumber/multipart', importFilePath: 'target/cucumber.json', inputInfoSwitcher: 'fileContent', serverInstance: xrayConnectorId])
		}
}
