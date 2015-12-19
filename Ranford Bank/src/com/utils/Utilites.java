package com.utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilites {
	public static boolean textPresent(WebDriver driver,String expectedText)
	{
		
	if(driver.getPageSource().contains(expectedText))
	  {
	     return true;
	     }
	 else{
		return false;	
	 }
	 }

	public static boolean isObjectPresent(WebDriver driver,By prop)
	{
	try{
		driver.findElement(prop).isDisplayed();
		return true;
	}catch(Exception e)
	 {
		return false;
	 }

	}

	
	public static void getScreenShot(WebDriver driver,String fileName)
	{
		
		String folderLocation="C:\\Documents and Settings\\manasa\\ranford_Automation_03042015\\screenshots\\";
	
		
		Date date=new Date();
		DateFormat formate=new SimpleDateFormat();
		String dat=  formate.format("DD:MM:YYYY");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File(folderLocation+fileName+dat+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}				
	}
	
	//verify text filed value
	
	public static boolean verifyTextFieldValue(WebDriver driver,By prop,String expectedText)
	{
	

		String value=driver.findElement(prop).getAttribute("value");

		if(value.contains(expectedText))
		{
			return true;
		}
		else{
			return false;
		}

		}
	

	//is alert present
	public static boolean isAlertPresent(WebDriver driver)
	{
              try{
            	  driver.switchTo().alert();
            	  return true;
              }catch(Exception e)
              {
            	  return false;
              }
              }

	//is alert present
	public static String getAlertText(WebDriver driver)
	{
              try{
            	  return  driver.switchTo().alert().getText();
            	
             }catch(Exception e)
              {
            	  return null;
              }
     }


	//is alert present
	public static boolean handleAlert(WebDriver driver)
	{
              try{
            	    driver.switchTo().alert().accept();
            	    return true;
            	
              }catch(Exception e)
              {
            	  return false;
              }
     }





}
