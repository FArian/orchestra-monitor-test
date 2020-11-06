package featuresTests;

import org.openqa.selenium.WebDriver;
import config.Config;
import enums.BROWSER;
import enums.LANGUAGE;
import enums.RUNTIMETYPE;
import enums.WARNINGS;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import pages.Home;
import pages.LicenseManagement;
import pages.Login;

public class ORC4260OTP517 {
	private Config config;
	private WebDriver driver;
	private LANGUAGE language;
	private Home home;
	private Login login;
	private LicenseManagement licenseManagement;
	
	//===================Before and After Steps ==========================//
	@Before
	public void browserSetup() {
		this.setConfig(new Config(RUNTIMETYPE.ORCHESTRA, BROWSER.CHROME, LANGUAGE.ENGLISH));
		this.setDriver(getConfig().getDriver());
		this.setLanguage(getConfig().getLanguage());
		
		this.setLogin(getConfig().getLogin());
		System.out.println("-------Start Browser-------");
	}
	@After
	public void browserDown() throws InterruptedException {
		// this.getMyBaseConfig().browserDown();
		getHome().clickLogoutIsDisplayed();
		System.out.println("-------Browser will be Closed-------");
	}
	
//	@BeforeStep
//	public void stepsHook() {
//		System.out.println("----------BeforeStep-----");
//	}
	
	//=================== Verifications steps ==========================//
	
	@Given("The login page is opening")
	public boolean the_login_page_is_opening() throws InterruptedException {
		
		this.home=config.getHome();
		
		String warning=WARNINGS.LICENSEWARNING.getMessage(getLanguage());
		boolean isValid=getDriver().getPageSource().contains(warning);
		if(isValid){
			getHome().CloseQuitBrowser();
			throw new IllegalStateException ("Message displayed : "+ warning);	
		}
		return !isValid;
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		getLogin().enterUsername("admin");
		getLogin().enterPassword("admin");
	}

	@When("clicks on submit button")
	public void clicks_on_submit_button() {
		getLogin().clickLogin();
	}

	@Then("user navigated to the orchestra Monitor")
	public void user_navigated_to_the_orchestra_monitor() {
		getHome().closeOpenDashboard();
	}

	@Given("orchestra already using ip-licenses")
	public void orchestra_already_using_ip_licenses() {
		// init object
		this.setLicenseManagement(new LicenseManagement(getDriver(), getLanguage()));
		
		this.getLicenseManagement().setLicenseVerification("Network based verification");
		this.licenseManagement.setState("Orchestra license and node activation is valid");
		
	}

	@When("user click on License Management button")
	public void user_click_on_license_management_button() {
		this.licenseManagement.closeLicenseManagement();
	}

	@Then("user navigated to License Management page")
	public void user_navigated_to_license_management_page() {
		this.licenseManagement.openLicenseManagement();
	}

	@Then("^all (.*) are (.*) available$")
	public boolean all_license_verification_are_network_based_verification_available(String content,String present) {
		if(!(driver.getPageSource().contains(content) && driver.getPageSource().contains(present))) {
			throw new IllegalStateException ("Please activate Orchestra");
		}
	
		return driver.getPageSource().contains(content) && driver.getPageSource().contains(present);
		
	}
	
	
	
	//===================Getter and Setter ==========================//

	public Config getConfig() {
		return config;
	}
	public void setConfig(Config config) {
		this.config = config;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public LANGUAGE getLanguage() {
		return language;
	}
	public void setLanguage(LANGUAGE language) {
		this.language = language;
	}
	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		this.home = home;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public LicenseManagement getLicenseManagement() {
		return licenseManagement;
	}
	public void setLicenseManagement(LicenseManagement licenseManagement) {
		this.licenseManagement = licenseManagement;
	}
}
