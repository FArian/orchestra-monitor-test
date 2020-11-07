package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.BROWSER;
import enums.LANGUAGE;
import enums.RUNTIMETYPE;
import pages.Home;
import pages.LicenseManagement;
import pages.Login;

public class Config {
	private WebDriver driver = null;
	private LANGUAGE language = null;
	private RUNTIMETYPE runtimetype = null;
	private String projectPath = null;
	private BROWSER browser=null;
	private Base base=null;
	private Home home=null;
	private Login login=null;
	private LicenseManagement licenseManagement=null;

	//Constructor 
	public Config(RUNTIMETYPE runtimetype, BROWSER browser, LANGUAGE language) {
		this.setProjectPath(System.getProperty("user.dir"));
		//browser type
		this.setBrowser(browser);
		// set runtime type
		this.setRuntimetype(runtimetype);
		// languages
		this.setLanguage(language);
		// init WebDrriver
		this.browserSetup();
		// init runtime url
		this.initRuntimeType();
		// pages init
		this.initElements();
		
	}
	
	private void initElements() {
		this.setBase(new Base(getDriver(), getLanguage()));
		this.setLogin(new Login(getDriver(), getLanguage()));
		this.setHome(new Home(getDriver(),getLanguage()));
		this.setLicenseManagement(new LicenseManagement(getDriver(),getLanguage()));
		
	}
	
	// ========================================================
	
	// init runtime type
	private void initRuntimeType() {
		if (getRuntimetype().equals(RUNTIMETYPE.ORCHESTRA)) {
			getDriver().navigate().to("http://farian:8080/orchestra");
		} else {
			getDriver().navigate().to("http://farian:9090/monitor");
		}
	}
	
	//setup base browser
	private void browserSetup() {
		if (browser.equals(BROWSER.CHROME)) {
			System.setProperty("webdriver.chrome.driver",
					getProjectPath() + "/src/test/resources/drivers/chromedriver.exe");
			this.setDriver(new ChromeDriver());
		} else {
			System.setProperty("webdriver.gecko.driver",
					getProjectPath() + "/src/test/resources/drivers/geckodriver.exe");
			this.setDriver(new FirefoxDriver());
		}

		getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();

	}
	
	public void browserDown() {
		getDriver().close();
		getDriver().quit();
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

	public String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

	public RUNTIMETYPE getRuntimetype() {
		return runtimetype;
	}

	public void setRuntimetype(RUNTIMETYPE runtimetype) {

		this.runtimetype = runtimetype;
	}
	
	public BROWSER getBrowser() {
		return browser;
	}

	public void setBrowser(BROWSER browser) {
		this.browser = browser;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
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

	@Override
	public String toString() {
		return "MyBaseConfig [driver=" + getDriver() + ", language=" + getLanguage() + ", runtimetype="
				+ getRuntimetype() + ", projectPath=" + getProjectPath() + "]";
	}

}
