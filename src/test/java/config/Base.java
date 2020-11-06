package config;

import org.openqa.selenium.WebDriver;

import enums.LANGUAGE;

public class Base {
	private WebDriver driver;
	private LANGUAGE language;
	
	
	public Base(WebDriver driver,LANGUAGE language) {
		this.setDriver(driver);
		this.setLanguage(language);
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
}
