package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
//import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Excel;
//import com.utils.Utilites;

public class BP_TS8_validateBranchesEntryReset {

    boolean bStatus;
	WebDriver driver;
	  @BeforeMethod
	  public void preConditin()
	  {
		//set excel conenction
		  Excel.setExcelConnection("Branch_Entry_TestData.xls");
		  //set sheet
		  Excel.selectSheet("branchesEntry");
		  //Writable excel
		  Excel.setWritableWorkbook("Branch_Entry_TestData.xls");
		  //writable sheet
		  Excel.selectWritableSheet("branchEntry2");
		 driver=AppFunctions.launchApplication();
	  }
		
	  @Test
	  public void testCase() {
		  AppFunctions.adminLogin(driver);
		  AppFunctions.clickBranches(driver);

			 //new branch clicking
		  AppFunctions.clickNewBranches(driver);
		  for(int iRowCounter=1;iRowCounter<Excel.getRowCount();iRowCounter++)//datadriven starting
			 {

				 
			    String   sBranchName=Excel.getCellData(0,iRowCounter);
			    String   sAddress1=Excel.getCellData(1,iRowCounter);
			    String   sZipCode=Excel.getCellData(2,iRowCounter);
			    String   sCountry=Excel.getCellData(3,iRowCounter);
			    String   sState=Excel.getCellData(4,iRowCounter);
			    String   sCity=Excel.getCellData(5,iRowCounter);
			  
		   bStatus=AppFunctions.BranchEntry(driver, sBranchName, sAddress1, sZipCode, sCountry, sState, sCity);
		  if(bStatus)
		   {
			   Excel.writeTocell(0,iRowCounter,"pass");
		   }
		   else
		   {
			   Excel.writeTocell(0,iRowCounter,"fail");
		   }
		  AppFunctions.clickReset(driver);

			 }
		  
	  }
	  
	  @AfterMethod
	  public void postCondition() throws InterruptedException
	  {
		//save the workbook
		  Excel.saveWorkbook();
		  Thread.sleep(2000);
		  AppFunctions.closeBrowser(driver);
	  }
}
