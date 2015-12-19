package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Utilites;

public class BP_TS4_ValidateBranchesLogOut {
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
		  AppFunctions.clickBranchLogout(driver);
		  bStatus=Utilites.textPresent(driver, "Banker Login");
		  if(bStatus)
		  {
			  Reporter.log("Branchlogout Successful",true);
		  }
		  else
		  {
			  Reporter.log("Branchlogout unsuccessfull",false);
		  }
		  
	  }
	  
	  @AfterMethod
	  public void postCondition() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  AppFunctions.closeBrowser(driver);
	  }
}
