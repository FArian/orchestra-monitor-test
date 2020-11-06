package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import config.Base;
import enums.*;

public class Home extends Base {
	private 
	By 
	btn_logout,
	btn_changePassword,
	btn_serviceInfo,
	btn_runtime,
	btn_settings,
	btn_cloudEnvironment,
	btn_esb,
	btn_monitoring,
	btn_administration,
	btn_dashboard;

	public Home(WebDriver driver, LANGUAGE language) {
		super(driver, language);
		// PageFactory.initElements(driver, this);

		// check orchestra title to be --> Orchestra Monitor
		if (!getDriver().getTitle().equals(LOGIN.MONITORTITLE.getContent())) {
			throw new IllegalStateException("This is not Login page of Orchestra or Juno Runtime. "
					+ "\n The Current page is : " + getDriver().getCurrentUrl()
					+ "\n please go to : src/test/java/main/MyBaseConfig.java and check URL for hostname , port number  and application name");
		}
		// init xpath all elements
		this.initXpaths();
	}

	//init xpath all elements
	private void initXpaths() {
		this.setBtn_logout(By.xpath(LOGOUT.BASE.getXpath(getLanguage())));
		this.setBtn_changePassword(By.xpath(CHANGEPASSWORD.BASE.getXpath(getLanguage())));
		this.setBtn_serviceInfo(By.xpath(RUNTIME.BASE.getXpath(getLanguage())));
		this.setBtn_runtime(By.xpath(RUNTIME.BASE.getXpath(getLanguage())));
		this.setBtn_settings(By.xpath(SETTINGS.BASE.getXpath(getLanguage())));
		this.setBtn_cloudEnvironment(By.xpath(CLOUDENVIRONMENT.BASE.getXpath(getLanguage())));
		this.setBtn_esb(By.xpath(ESB.BASE.getXpath(getLanguage())));
		this.setBtn_monitoring(By.xpath(MONITORING.BASE.getXpath(getLanguage())));
		this.setBtn_administration(By.xpath(ADMINISTRATION.BASE.getXpath(getLanguage())));
		this.setBtn_dashboard(By.xpath(ADMINISTRATION.BASE.getXpath(getLanguage())));

	}

	public void closeOpenDashboard() {
		getDriver().findElement(getBtn_dashboard()).click();
		getDriver().findElement(getBtn_dashboard()).click();
	}

	public void clickOnAllElements() throws InterruptedException {
		getDriver().findElement(getBtn_dashboard()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_administration()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_monitoring()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_esb()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_cloudEnvironment()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_settings()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_runtime()).click();
		Thread.sleep(2000);
		getDriver().findElement(getBtn_serviceInfo()).click();
		Thread.sleep(2000);
	}

	public void clickLogoutIsDisplayed() throws InterruptedException {
		Thread.sleep(5000);
		getDriver().findElement(getBtn_logout()).isDisplayed();
		getDriver().close();
		getDriver().quit();
	}
	public void CloseQuitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		getDriver().close();
		getDriver().quit();
	}

	public By getBtn_logout() {
		return btn_logout;
	}

	public void setBtn_logout(By btn_logout) {
		this.btn_logout = btn_logout;
	}

	public By getBtn_changePassword() {
		return btn_changePassword;
	}

	public void setBtn_changePassword(By btn_changePassword) {
		this.btn_changePassword = btn_changePassword;
	}

	public By getBtn_serviceInfo() {
		return btn_serviceInfo;
	}

	public void setBtn_serviceInfo(By btn_serviceInfo) {
		this.btn_serviceInfo = btn_serviceInfo;
	}

	public By getBtn_runtime() {
		return btn_runtime;
	}

	public void setBtn_runtime(By btn_runtime) {
		this.btn_runtime = btn_runtime;
	}

	public By getBtn_settings() {
		return btn_settings;
	}

	public void setBtn_settings(By btn_settings) {
		this.btn_settings = btn_settings;
	}

	public By getBtn_cloudEnvironment() {
		return btn_cloudEnvironment;
	}

	public void setBtn_cloudEnvironment(By btn_cloudEnvironment) {
		this.btn_cloudEnvironment = btn_cloudEnvironment;
	}

	public By getBtn_esb() {
		return btn_esb;
	}

	public void setBtn_esb(By btn_sdb) {
		this.btn_esb = btn_sdb;
	}

	public By getBtn_monitoring() {
		return btn_monitoring;
	}

	public void setBtn_monitoring(By btn_monitoring) {
		this.btn_monitoring = btn_monitoring;
	}

	public By getBtn_administration() {
		return btn_administration;
	}

	public void setBtn_administration(By btn_administration) {
		this.btn_administration = btn_administration;
	}

	public By getBtn_dashboard() {
		return btn_dashboard;
	}

	public void setBtn_dashboard(By btn_dashboard) {
		this.btn_dashboard = btn_dashboard;
	}

}
