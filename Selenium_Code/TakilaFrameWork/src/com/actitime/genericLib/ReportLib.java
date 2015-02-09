package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ReportLib {
	
	public void getScreenShot(String fileName) throws IOException{		
       EventFiringWebDriver eDriver = new EventFiringWebDriver(Driver.driver);		
    	File srcFile = eDriver.getScreenshotAs(OutputType.FILE);		
		File dstFile = new File("C:\\Users\\DEEPU\\workspace_OCM_22\\TakilaFrameWork\\ScreenShot\\"+fileName+".png");
		FileUtils.copyFile(srcFile,dstFile);
	
	}

	
	
	
	
	
	
	
	
	
	
}
