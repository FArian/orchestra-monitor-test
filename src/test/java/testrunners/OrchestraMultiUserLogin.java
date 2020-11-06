package testrunners;
//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//import main.MyBaseConfig;
//import model.enums.BROWSER;
//import model.enums.CHANGEPASSWORD;
//import model.enums.ERRORS;
//import model.enums.LANGUAGE;
//import model.enums.RUNTIMETYPE;
//import model.pages.HomePage;
//
//public class OrchestraMultiUserLogin {
//	private WebDriver driver = null;
//	private HomePage home = null;
//	private MyBaseConfig myBaseConfig =null;
//	private LANGUAGE Language=null;
//
//	
//	public void browserSetup() {
//		this.setMyBaseConfig(new MyBaseConfig(RUNTIMETYPE.ORCHESTRA, BROWSER.CHROME, LANGUAGE.GERMAN));
//		this.setDriver(myBaseConfig.getDriver());
//		this.setLanguage(myBaseConfig.getLanguage());
//		System.out.println("-------Start Browser-------");
//	}
//	
//	
//	public void browserDown() {
//		//this.getMyBaseConfig().browserDown();
//		home.clickLogoutIsDisplayed();
//		System.out.println("-------Browser will be Closed-------");
//	}
//	// =============[implement steps with Gherkin below]===============
//
//	@Given("^browser is opened agian$")
//	public void browser_is_open() {
//		browserSetup();
//		System.out.println(getDriver().getTitle());
//	}
//
//	@And("user is on orchestra login page agian")
//	public void user_is_on_orchestra_login_page() {
//		this.home=new HomePage(getLanguage(),getDriver());
//		System.out.println("ORCHESTRA URL : "+getDriver().getCurrentUrl());
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) {
//		this.home.toString();
//		this.home.enterUsername(username);
//		this.home.enterPassword(password);
//	}
//
//	@And("clicks on submit button for login")
//	public void clicks_on_submit_button() {
//		home.clickLogin();
//	}
//
//	@Then("a user navigated to the orchestra Monitor page")
//	public void user_navigated_to_the_orchestra_monitor_page() throws InterruptedException {
//		if(getDriver().getPageSource().contains("Error")) {
//			getDriver().findElement(By.xpath(ERRORS.OK.getXpath())).click();
//		}
//		
//		System.out.println(CHANGEPASSWORD.WARNING.getMessage(getLanguage()));
//		Thread.sleep(8000);
//		browserDown();
//	}
//
//	
//	
//	// =====================[Getter and Setter]=====================
//
//	public WebDriver getDriver() {
//		return driver;
//	}
//
//	public void setDriver(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	public MyBaseConfig getMyBaseConfig() {
//		return myBaseConfig;
//	}
//
//	public void setMyBaseConfig(MyBaseConfig myBaseConfig) {
//		this.myBaseConfig = myBaseConfig;
//	}
//
//	public HomePage getHomePage() {
//		return home;
//	}
//
//	public void setHomePage(HomePage homePage) {
//		this.home = homePage;
//	}
//
//	public LANGUAGE getLanguage() {
//		return Language;
//	}
//
//	public void setLanguage(LANGUAGE language) {
//		Language = language;
//	}
// ========================================================
//@Before
//public void browserSetup() {
//	this.setMyBaseConfig(new MyBaseConfig(RUNTIMETYPE.ORCHESTRA, BROWSER.CHROME, LANGUAGE.ENGLISH));
//	this.setDriver(myBaseConfig.getDriver());
//	this.setLanguage(myBaseConfig.getLanguage());
//	System.out.println("-------Start Browser-------");
//}
//@After
//public void browserDown() {
//	// this.getMyBaseConfig().browserDown();
//	home.clickLogoutIsDisplayed();
//	System.out.println("-------Browser will be Closed-------");
//}
//
//}
