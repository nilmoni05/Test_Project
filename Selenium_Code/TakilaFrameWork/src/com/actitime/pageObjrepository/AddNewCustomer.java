package com.actitime.pageObjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer {
	
	@FindBy(name="name")
	private WebElement custNameEdt;
	
	@FindBy(name="description")
	private WebElement custDescpEdt;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement createCustomerBtn;

	public WebElement getCustNameEdt() {
		return custNameEdt;
	}

	public WebElement getCustDescpEdt() {
		return custDescpEdt;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	

}
