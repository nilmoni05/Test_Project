package com.actitime.pageObjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerInfo {
	
	@FindBy(xpath="//td[contains(text(),'d customer:')]/following-sibling::td/span")
	private WebElement custNameInfo;

	public WebElement getCustNameInfo() {
		return custNameInfo;
	}
	
	

}
