package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Utilites;

public class BP_TS3_ValidateBranchesHome {
	
    boolean bStatus;
	WebDriver driver;
	  @BeforeMethod
	  public void preConditin()
	  {
		 driver=AppFunctions.launchApplication();
	  }
		
	  @Test
	  public void testCase() {
		  AppFunctions.adminLogin(driver);
		  AppFunctions.clickBranches(driver);
		  AppFunctions.clickNewBranches(driver);
		  AppFunctions.clickHome(driver);
		  bStatus=Utilites.textPresent(driver, "Welcome");
		  if(bStatus)
			 { 
			  Reporter.log("Home page open successfully",true);
		  }
			 else
			 {
				 Reporter.log("Home page open unsuccessful",false);
			 }
	  }
	  
	  @AfterMethod
	  public void postCondition() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  AppFunctions.closeBrowser(driver);
	  }
	  
	}

