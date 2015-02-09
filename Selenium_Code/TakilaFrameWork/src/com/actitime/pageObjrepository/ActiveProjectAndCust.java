package com.actitime.pageObjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCust {
	
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustBtn;
	
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjrBtn;
	
	@FindBy(xpath="//input[normalize-space(@value)='Show']")
	private WebElement showCustBtn;
	
	@FindBy(xpath="//select[@name='recordsPerPage']")
	private WebElement selectAllCustLst;
	
	public WebElement getSelectAllCustLst() {
		return selectAllCustLst;
	}

	public WebElement getAddNewCustBtn() {
		return addNewCustBtn;
	}

	public WebElement getAddNewProjrBtn() {
		return addNewProjrBtn;
	}

	public WebElement getShowCustBtn() {
		return showCustBtn;
	}
	
	
	
}
