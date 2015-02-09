package com.actitime.businessLib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.genericLib.Driver;
import com.actitime.genericLib.WebDriverCommomLib;
import com.actitime.pageObjrepository.ActiveProjectAndCust;
import com.actitime.pageObjrepository.AddNewCustomer;
import com.actitime.pageObjrepository.CommomPage;
import com.actitime.pageObjrepository.Login;
import com.actitime.pageObjrepository.OpenTasks;



public class ProjectAndCustomerLib extends WebDriverCommomLib{
	
	Login loginPage = PageFactory.initElements(Driver.driver, Login.class);
	OpenTasks openTaskPage = PageFactory.initElements(Driver.driver, OpenTasks.class);
	ActiveProjectAndCust  actProAndCustPage = PageFactory.initElements(Driver.driver, ActiveProjectAndCust.class);
	AddNewCustomer addnewCustPage= PageFactory.initElements(Driver.driver, AddNewCustomer.class);
	CommomPage comonPage = PageFactory.initElements(Driver.driver, CommomPage.class);
					
	public void loginToAPP(String username , String password){
		Driver.driver.get("http://susanta-pc/login.do");
		loginPage.getUserNameEdt().sendKeys(username);
		loginPage.getPasswordEdt().sendKeys(password);
		loginPage.getLoginBtn().click();
		waitForPageToLoad();	
	}
	
	public void navigateToProAndCustPage(){
		openTaskPage.getProAndCustLnk().click();
		waitForPageToLoad();
	}
	
	public void createCustomer(String customerName){
		actProAndCustPage.getAddNewCustBtn().click();
		waitForPageToLoad();
		addnewCustPage.getCustNameEdt().sendKeys(customerName);
		addnewCustPage.getCreateCustomerBtn().click();
		waitForPageToLoad();
		
	}
	
	
	public void navigateCustomerDetailsPage(String customerName){
		
		select(actProAndCustPage.getSelectAllCustLst(), "100");
		waitForwbLinkTextPresent(customerName);
		Driver.driver.findElement(By.linkText(customerName)).click();
		waitForPageToLoad();
	}
	
	
	
	public void logout(){
		comonPage.getLogOutImg().click();
		waitForPageToLoad();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
