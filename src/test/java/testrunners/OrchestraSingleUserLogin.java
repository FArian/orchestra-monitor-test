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
//public class OrchestraSingleUserLogin {
//	
//	
//	private WebDriver driver = null;
//	private HomePage home = null;
//	private MyBaseConfig myBaseConfig =null;
//	private LANGUAGE Language=null;
//	
//	
//	public void browserSetup() {
//		this.setMyBaseConfig(new MyBaseConfig(RUNTIMETYPE.ORCHESTRA, BROWSER.CHROME, LANGUAGE.ENGLISH));
//		this.setDriver(myBaseConfig.getDriver());
//		this.setLanguage(myBaseConfig.getLanguage());
//		System.out.println("-------Start Browser-------");
//	}
//	
//	public void browserDown() {
//		home.clickLogoutIsDisplayed();
//		//getMyBaseConfig().browserDown();
//		System.out.println("-------Browser will be Closed-------");
//		
//	}
//	//==================================
//	@Given("Orchestra is runing and browser is opened")
//	public void orchestra_is_runing_and_browser_is_opened() {
//		browserSetup();
//		System.out.println(getDriver().getTitle());
//	}
//
//	@And("user is on orchestra login page")
//	public void user_is_on_orchestra_login_page() {
//		this.home=new HomePage(getLanguage(),getDriver());
//		System.out.println("ORCHESTRA URL : "+getDriver().getCurrentUrl());
//	}
//
//	@When("a user enters username and password")
//	public void a_user_enters_username_and_password() {
//		this.home.toString();
//		this.home.enterUsername("admin");
//		this.home.enterPassword("admin");
//	}
//
//	@And("clicks on submit button")
//	public void clicks_on_submit_button() {
//		home.clickLogin();
//	}
//
//	@Then("user navigated to the orchestra Monitor page")
//	public void user_navigated_to_the_orchestra_monitor_page() throws InterruptedException {
//		if(getDriver().getPageSource().contains("Error")) {
//			getDriver().findElement(By.xpath(ERRORS.OK.getXpath())).click();
//		}
//		System.out.println("language "+getLanguage());
//		home.clickOnAllElements();
//		System.out.println(CHANGEPASSWORD.WARNING.getMessage(getLanguage()));
//		Thread.sleep(8000);
//		browserDown();
//		
//	}
//	//==================================
//	
//	public WebDriver getDriver() {
//		return driver;
//	}
//	public void setDriver(WebDriver driver) {
//		this.driver = driver;
//	}
//	public HomePage getHome() {
//		return home;
//	}
//	public void setHome(HomePage home) {
//		this.home = home;
//	}
//	public MyBaseConfig getMyBaseConfig() {
//		return myBaseConfig;
//	}
//	public void setMyBaseConfig(MyBaseConfig myBaseConfig) {
//		this.myBaseConfig = myBaseConfig;
//	}
//	public LANGUAGE getLanguage() {
//		return Language;
//	}
//	public void setLanguage(LANGUAGE language) {
//		Language = language;
//	}
//
//}
