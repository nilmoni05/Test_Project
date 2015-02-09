package com.actitime.projectandcustomertest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.genericLib.Driver;
import com.actitime.genericLib.ReportLib;


public class SampleTestForSh {
	
	@BeforeMethod
	public void configBeforeMeth(){
		System.out.println("Login");
	}

	@Test
	public void createCust() throws IOException{
		Driver.driver.get("http://susanta-pc/login.do");
		System.out.println("before createCustTest fail ");
		System.out.println("After createCustTest fail");
	}
	
	@Test
	public void modifyCust() throws IOException{

		System.out.println("execute  modifyCust");
	}
	
	@AfterMethod
	public void configAfterMeth(ITestResult t) throws IOException{
	
		if(!t.isSuccess()){
			ReportLib r = new ReportLib();
			r.getScreenShot(t.getMethod().getMethodName());
		}
		System.out.println("Logout");
	}
	
	
	
	
	
	
	
	

}
