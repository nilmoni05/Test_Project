package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommomLib {
	
	boolean flag = false;
	
	public void waitForPageToLoad(){
	
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void waitForwbLinkTextPresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                           (By.linkText(linkName)));
			
	}
	
	
	public void waitForwbXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                              (By.xpath(wbXpath)));
			
	}	
	
	
	public boolean verifyText(String wbXpath , String expectedText){
		flag = false;
		String actext = Driver.driver.findElement(By.xpath(wbXpath)).getText();
		if(expectedText.equals(actext)){
			flag = true;
			System.out.println(expectedText + " text is verified");
		}else{
			System.out.println(expectedText + " text is not verified");

		}
		return flag;
	}
	
public boolean verifyTextPresent(String expectedText){
	flag=false;
	String entireHtmlPageSrc = Driver.driver.getPageSource();
	
	if(entireHtmlPageSrc.contains(expectedText)){
		System.out.println(expectedText + "is Present in UI");
		flag = true;
	}else{
		System.out.println(expectedText + "is not Present in UI");
	}
	return flag;
}
	
	
public void select(String wbXptah , String value){
	Select sel = new Select(Driver.driver.findElement(By.xpath(wbXptah)));
	sel.selectByVisibleText(value);
	
}
		

public void select(String wbXptah , int index){
Select sel = new Select(Driver.driver.findElement(By.xpath(wbXptah)));
sel.selectByIndex(index);

}

public void select(WebElement selWb , String value){
	Select sel = new Select(selWb);
	sel.selectByVisibleText(value);
	
}


public void acceptAlert(){
	Alert alt = Driver.driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
}

public void dismissAlert(){
	Alert alt = Driver.driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.dismiss();
}




	
	
	
	
	

}
