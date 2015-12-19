package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Excel;
import com.utils.Utilites;


public class BP_TS7_validateBranchesEntrySubmit {
   
	boolean bStatus;
	WebDriver driver;
	  @BeforeMethod
	  public void preConditin()
	  {
		  //configuration
		  //set excel conenction
		  Excel.setExcelConnection("Branch_Entry_TestData.xls");
		  //set sheet
		  Excel.selectSheet("branchesEntry");
		  //writable Excel
		   Excel.setWritableWorkbook("Branch_Entry_TestData.xls");
	      //writable sheet
		   Excel.selectWritableSheet("branchesEntry");
		  
		 driver=AppFunctions.launchApplication();
	  }
		
	  @Test
	  public void testCase() {
		  AppFunctions.adminLogin(driver); 
		  AppFunctions.clickBranches(driver);
		  

		 for(int iRowCounter=1;iRowCounter<Excel.getRowCount();iRowCounter++)//datadriven starting
		 {
			 //new branch clicking
			  AppFunctions.clickNewBranches(driver);
			 
		    String   sBranchName=Excel.getCellData(0,iRowCounter);
		    String   sAddress1=Excel.getCellData(1,iRowCounter);
		    String   sZipCode=Excel.getCellData(2,iRowCounter);
		    String   sCountry=Excel.getCellData(3,iRowCounter);
		    String   sState=Excel.getCellData(4,iRowCounter);
		    String   sCity=Excel.getCellData(5,iRowCounter);
		  
		   bStatus=AppFunctions.BranchEntry(driver, sBranchName, sAddress1, sZipCode, sCountry, sState, sCity);
		  
		   if(bStatus)
		   {
			   Excel.writeTocell(6,iRowCounter,"pass");
		   }
		   else
		   {
			   Excel.writeTocell(6,iRowCounter,"fail");
		   }
		  
		  AppFunctions.clickSubmit(driver);
		  
		  if(Utilites.isAlertPresent(driver))
		  {
			String alertText=Utilites.getAlertText(driver);
			Reporter.log(alertText,true);
			Utilites.handleAlert(driver);
		  }
		  
		  
		  
		 }//data driven over 
		  
	  }
	  
	  @AfterMethod
	  public void postCondition() throws InterruptedException
	  {
		  Excel.saveWorkbook();//save the workbook
		  Thread.sleep(2000);
		  AppFunctions.closeBrowser(driver);
	  }
}
