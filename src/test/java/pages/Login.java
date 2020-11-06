package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Base;
import enums.LANGUAGE;
import enums.LOGIN;
import enums.LOGOUT;

public class Login extends Base {
	private By userFinder = null;
	private By passFinder = null;
	private By btn_loginFinder = null;
	

	public Login(WebDriver driver, LANGUAGE language) {
		super(driver, language);
		this.setUserFinder(By.xpath(LOGIN.USERNAME.getXpath(getLanguage())));
		this.setPassFinder(By.xpath(LOGIN.PASSWORD.getXpath(getLanguage())));
		this.setBtn_loginFinder(By.xpath(LOGIN.SUBMIT.getXpath(getLanguage())));
	}

	public void clickLogin() {
		getDriver().findElement(getBtn_loginFinder()).click();
	}

	public void loginValidUser(String username, String password) {
		this.enterUsername(username);
		this.enterUsername(username);
		this.clickLogin();
	}
	public void enterUsername(String username) {
//		txt_username.sendKeys(username);
		getDriver().findElement(getUserFinder()).sendKeys(username);

	}

	public void enterPassword(String password) {
//		txt_password.sendKeys(password);
		getDriver().findElement(getPassFinder()).sendKeys(password);
	}

	public By getUserFinder() {
		return userFinder;
	}

	public void setUserFinder(By userFinder) {
		this.userFinder = userFinder;
	}

	public By getPassFinder() {
		return passFinder;
	}

	public void setPassFinder(By passFinder) {
		this.passFinder = passFinder;
	}

	public By getBtn_loginFinder() {
		return btn_loginFinder;
	}

	public void setBtn_loginFinder(By btn_loginFinder) {
		this.btn_loginFinder = btn_loginFinder;
	}


	

}
