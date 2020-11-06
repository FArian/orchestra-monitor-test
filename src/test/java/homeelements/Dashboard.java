package homeelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import enums.DASHBOARD;
import enums.LANGUAGE;
import enums.LOGIN;

public class Dashboard {
	private WebDriver driver = null;
	private LANGUAGE language= null;
	private DASHBOARD dashboard=null;
	private String processtimelineXPath,nodeXPath,systemresourcesXPath,systemeventmonitorXPath,signalmonitorXPath,serverinfoXPath,channelinvocationsXPath;
	private By btn_dashboard = null;
	
	public Dashboard(WebDriver driver,LANGUAGE language) {
		this.driver=driver;
		this.language=language;
		this.setProcesstimelineXPath(DASHBOARD.PROCESSTIMELINE.getXpath(getLanguage()));
		this.setNodeXPath(DASHBOARD.NODE.getXpath(getLanguage()));
		this.setSystemresourcesXPath(DASHBOARD.SYSTEMRESOURCES.getXpath(getLanguage()));
		this.setSystemeventmonitorXPath(DASHBOARD.SYSTEMEVENTMONITOR.getXpath(getLanguage()));
		this.setSignalmonitorXPath(DASHBOARD.SIGNALMONITOR.getXpath(getLanguage()));
		this.setServerinfoXPath(DASHBOARD.SERVERINFO.getXpath(getLanguage()));
		this.setChannelinvocationsXPath(DASHBOARD.CHANNELINVOCATIONS.getXpath(getLanguage()));
		this.setBtn_dashboard(By.xpath(DASHBOARD.BASE.getXpath(getLanguage())));
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

	public DASHBOARD getDashboard() {
		return dashboard;
	}

	public void setDashboard(DASHBOARD dashboard) {
		this.dashboard = dashboard;
	}

	public String getProcesstimelineXPath() {
		return processtimelineXPath;
	}

	public void setProcesstimelineXPath(String processtimelineXPath) {
		this.processtimelineXPath = processtimelineXPath;
	}

	public String getNodeXPath() {
		return nodeXPath;
	}

	public void setNodeXPath(String nodeXPath) {
		this.nodeXPath = nodeXPath;
	}

	public String getSystemresourcesXPath() {
		return systemresourcesXPath;
	}

	public void setSystemresourcesXPath(String systemresourcesXPath) {
		this.systemresourcesXPath = systemresourcesXPath;
	}

	public String getSystemeventmonitorXPath() {
		return systemeventmonitorXPath;
	}

	public void setSystemeventmonitorXPath(String systemeventmonitorXPath) {
		this.systemeventmonitorXPath = systemeventmonitorXPath;
	}

	public String getSignalmonitorXPath() {
		return signalmonitorXPath;
	}

	public void setSignalmonitorXPath(String signalmonitorXPath) {
		this.signalmonitorXPath = signalmonitorXPath;
	}

	public String getServerinfoXPath() {
		return serverinfoXPath;
	}

	public void setServerinfoXPath(String serverinfoXPath) {
		this.serverinfoXPath = serverinfoXPath;
	}

	public String getChannelinvocationsXPath() {
		return channelinvocationsXPath;
	}

	public void setChannelinvocationsXPath(String channelinvocationsXPath) {
		this.channelinvocationsXPath = channelinvocationsXPath;
	}
	public void clickOnDashboard() {
		getDriver().findElement(getBtn_dashboard()).click();
	}

	public By getBtn_dashboard() {
		return btn_dashboard;
	}

	public void setBtn_dashboard(By btn_dashboard) {
		this.btn_dashboard = btn_dashboard;
	}

}
