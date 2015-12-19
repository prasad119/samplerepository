package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Utilites;

public class BP_TS6_validateBrancheDetailsClear {
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
		  AppFunctions.selectBranchDetails(driver);
		  AppFunctions.clickCancleButton(driver);
		  bStatus=Utilites.textPresent(driver, "Country");
		  bStatus=Utilites.textPresent(driver, "State");
		  bStatus=Utilites.textPresent(driver, "State");
		  if(bStatus)
		  {
			  Reporter.log("cancle button successfully clicked",true);
		  }
		  else
		  {
			  Reporter.log("cancle button not clicked successfuly",false);
		  }
	  }
	  
	  @AfterMethod
	  public void postCondition() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  AppFunctions.closeBrowser(driver);
	  }
}
