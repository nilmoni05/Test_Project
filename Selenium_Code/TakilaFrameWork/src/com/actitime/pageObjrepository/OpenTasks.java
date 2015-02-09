package com.actitime.pageObjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {

	
	@FindBy(linkText="Projects & Customers")
	private WebElement proAndCustLnk;
		
	@FindBy(linkText="Reports")
	private WebElement reportLnk;
	
	@FindBy(linkText="Users")
	private WebElement userLnk;
	

	public WebElement getReportLnk() {
		return reportLnk;
	}


	public WebElement getUserLnk() {
		return userLnk;
	}


	public WebElement getProAndCustLnk() {
		return proAndCustLnk;
	}
	
	
}
