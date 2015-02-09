package com.actitime.pageObjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommomPage {

	
	@FindBy(xpath="//img[@alt='Logout']")
	private WebElement logOutImg;

	public WebElement getLogOutImg() {
		return logOutImg;
	}
	
	
	
	
}
