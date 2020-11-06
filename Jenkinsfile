node() {

    def repoURL = 'https://github.com/gabrielstar/cucumber.git'
	stage('Import results to Xray') {

		def description = "[BUILD_URL|${env.BUILD_URL}]"
		def labels = ''
		def environment = ""
		def testExecutionFieldId = 10302
		def testEnvironmentFieldName = "customfield_10725"
		def projectKey = "OTE"
		def xrayConnectorId = '6c495579-0bb5-49e1-9831-2c9c86e61301'
		def info = '''{
				"fields": {
					"project": {
					"key": "''' + projectKey + '''"
				},
				"labels":''' + labels + ''',
				"description":"''' + description + '''",
				"summary": "Automated Regression Execution @ ''' + env.BUILD_TIME + ' ' + environment + ''' " ,
				"issuetype": {
				"id": "''' + testExecutionFieldId + '''"
				},
				"''' + testEnvironmentFieldName + '''" : [
				"''' + environment + '''"
				]
				}
				}'''

			echo info

			step([$class: 'XrayExportBuilder', credentialId: '', filePath: '/features', filter: 'OTP-530', issues: 'OTE-21', serverInstance: 'SERVER-6c495579-0bb5-49e1-9831-2c9c86e61301'])
		}
}
