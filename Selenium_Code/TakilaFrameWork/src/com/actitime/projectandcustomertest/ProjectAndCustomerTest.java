package com.actitime.projectandcustomertest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.businessLib.ProjectAndCustomerLib;
import com.actitime.genericLib.Driver;
import com.actitime.genericLib.ExcelLib;
import com.actitime.genericLib.WebDriverCommomLib;
import com.actitime.pageObjrepository.EditCustomerInfo;


public class ProjectAndCustomerTest {
	//object declaration 
	ExcelLib eLib;
	WebDriverCommomLib wLib;
	ProjectAndCustomerLib bLib;
	EditCustomerInfo editCusInfoPage;

	@BeforeClass
	public void configBeforeClass(){
		//object intailization 
		eLib = new ExcelLib();
		wLib = new WebDriverCommomLib();
		bLib  = new ProjectAndCustomerLib();
		editCusInfoPage = PageFactory.initElements(Driver.driver, EditCustomerInfo.class);
		
	}
	
	
	@BeforeMethod
	public void configBeforeMtd() throws InvalidFormatException, IOException{

		//get test data from excel
		String userName =eLib.getExcelData("Data", 1, 2);
		String password =eLib.getExcelData("Data", 1, 3);
		//step 1 : login to APP
		bLib.loginToAPP(userName, password);
		
		//step 2 : navigate to Proj And Cust Page
		bLib.navigateToProAndCustPage();
	}
	
	@Test
	public void createCustomerTest() throws InvalidFormatException, IOException, InterruptedException{
		
		String customerName = eLib.getExcelData("Data", 1, 4);
		
		//step3 : create customer
		bLib.createCustomer(customerName);
		
		//step 4 : navigate to cust details page
		bLib.navigateCustomerDetailsPage(customerName);
		
		//step 5: verify customer Details
		String actCustomerName = editCusInfoPage.getCustNameInfo().getText();
		Assert.assertEquals(actCustomerName, customerName,"not verified" );	
	}
	
	
	@Test
	public void verifyCustomerDetailsInWebTableTest() throws InvalidFormatException, IOException{
		String customerName = eLib.getExcelData("Data", 2, 4);
		
		
		//step3 : create customer
		bLib.createCustomer(customerName);
		
		
	}

	
	
	@AfterMethod
	public void configAfterMtd(){
			
		bLib.logout();
		
	
	}
	
	
	@AfterClass
	public void configAfterClass(){
		//Driver.driver.quit();
	}
	
	
	
	

	

}
