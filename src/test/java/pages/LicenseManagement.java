package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Config;
import enums.LANGUAGE;
import enums.SETTINGS;
import homeelements.Settings;
import io.cucumber.java.en.*;

public class LicenseManagement extends Settings{
	private By btn_LicenseMgmt;
	
	public LicenseManagement(WebDriver driver, LANGUAGE language) {
		super(driver, language);
		this.setCustomerName("N/A");
		this.setCustomerIdentifier("N/A");
		this.setDescription("N/A");
		this.setLicenseVerification("Hardware based verification");
		this.setNodeName("N/A");
		this.setLatestActivationDate("unlimited");
		this.setValidTo("unlimited");
		this.setState("Remaining time for activation");
		this.setBtn_LicenseMgmt(By.xpath(SETTINGS.LICENSEMANAGEMENT.getXpath(getLanguage())));
	}

	private Config myBaseConfig = null;
	private String customerName,customerIdentifier,description,licenseVerification,nodeName,latestActivationDate,validTo,state;
	
	
	

	public Config getMyBaseConfig() {
		return myBaseConfig;
	}
	public void closeOpenLicenseManagement() {
		getDriver().findElement(getBtn_LicenseMgmt()).click();
		getDriver().findElement(getBtn_LicenseMgmt()).click();
	}
	public void openLicenseManagement() {
		getDriver().findElement(getBtn_LicenseMgmt()).click();
	}
	public void closeLicenseManagement() {
		getDriver().findElement(getBtn_LicenseMgmt()).click();
	}
	

	public void setMyBaseConfig(Config myBaseConfig) {
		this.myBaseConfig = myBaseConfig;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerIdentifier() {
		return customerIdentifier;
	}

	public void setCustomerIdentifier(String customerIdentifier) {
		this.customerIdentifier = customerIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLicenseVerification() {
		return licenseVerification;
	}

	public void setLicenseVerification(String licenseVerification) {
		this.licenseVerification = licenseVerification;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getLatestActivationDate() {
		return latestActivationDate;
	}

	public void setLatestActivationDate(String latestActivationDate) {
		this.latestActivationDate = latestActivationDate;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public By getBtn_LicenseMgmt() {
		return btn_LicenseMgmt;
	}
	public void setBtn_LicenseMgmt(By btn_LicenseMgmt) {
		this.btn_LicenseMgmt = btn_LicenseMgmt;
	}
}
