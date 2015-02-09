package com.actitime.reporttest;

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



public class ReportTest {
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
		

	}
	
	@Test
	public void createReportTest() throws InvalidFormatException, IOException, InterruptedException{
		
		System.out.println("execute create report test");
		
	}
	
	
	@Test
	public void modifyReportTest() throws InvalidFormatException, IOException{
		
		System.out.println("execute modifyReport report test");
	}

	
	
	@AfterMethod
	public void configAfterMtd(){
			
		bLib.logout();
		
	
	}
	
	
	@AfterClass
	public void configAfterClass(){
		Driver.driver.quit();
	}
	
	
	
	

	

}
