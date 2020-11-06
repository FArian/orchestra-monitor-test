package homeelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Base;
import enums.ADMINISTRATION;
import enums.LANGUAGE;

public class Administration extends Base{


	private WebDriver driver = null;
	private LANGUAGE language= null;


//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.BASE.getXpath())).click();
//	getDriver().findElement(By.xpath(ADMINISTRATION.LANDSCAPE.getXpath())).click();
//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.BUSINESSCALENDAR.getXpath())).click();
//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.LANDSCAPE.getXpath())).click();
//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.SCENARIO.getXpath())).click();
//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.LOOKUPTABLE.getXpath())).click();
//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.USERMANAGEMENT.getXpath())).click();
//	Thread.sleep(2000);
//	getDriver().findElement(By.xpath(ADMINISTRATION.TIMER.getXpath())).click();
	
	public Administration(WebDriver driver, LANGUAGE language) {
		super(driver, language);
		// TODO Auto-generated constructor stub
	}

	
	public void clickOnAllElements() throws InterruptedException {
		getDriver().findElement(By.xpath(ADMINISTRATION.LANDSCAPE.getXpath(getLanguage()))).click();
		getDriver().findElement(By.xpath(ADMINISTRATION.SCENARIO.getXpath(getLanguage()))).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath(ADMINISTRATION.USERMANAGEMENT.getXpath(getLanguage()))).click();
		getDriver().findElement(By.xpath(ADMINISTRATION.BUSINESSCALENDAR.getXpath(getLanguage()))).click();
		getDriver().findElement(By.xpath(ADMINISTRATION.LOOKUPTABLE.getXpath(getLanguage()))).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath(ADMINISTRATION.BASE.getXpath(getLanguage()))).click();
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
