node() {

    def repoURL = 'https://github.com/FArian/orchestra-monitor-test.git'
	stage('Import results to Xray') {

		def description = "[BUILD_URL|${env.BUILD_URL}]"
		def labels = ''
		def environment = ""
		def testExecutionFieldId = 10302
		def testEnvironmentFieldName = "customfield_10725"
		def projectKey = "OTE"
		def xrayConnectorId = '6c495579-0bb5-49e1-9831-2c9c86e61301'

		step([$class: 'XrayImportBuilder', endpointName: '/cucumber/multipart', importFilePath: 'target/cucumber.json', importInParallel: 'true', importInfo: '''project = "Orchestra Test Execution" 
        fixVersion = "ORC 4.8.2.4"
        Summary="Specific Test Execution for Release 4.8.2.4-RC-1"
        issuekey = OTE-21''', inputInfoSwitcher: 'fileContent', serverInstance: 'SERVER-6c495579-0bb5-49e1-9831-2c9c86e61301'])
		}
}
