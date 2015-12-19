package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Utilites;

public class BP_TS1_ValidateBranches {
  boolean bStatus;
  WebDriver driver;
  @BeforeMethod
  public void preConditin()
  {
	 driver=AppFunctions.launchApplication();
	 bStatus=Utilites.textPresent(driver,"Banker Login");
	 if(bStatus)
	 {
		 Reporter.log("Ranfod home page opend successfully",true);
	 }
	 else
	 {
		 Reporter.log("Ranfod home page not opend successfully",true);
	 }
  }
  
  @Test
  public void testCase() {
	  AppFunctions.adminLogin(driver);
	  bStatus=Utilites.textPresent(driver,"Welcome");
		 if(bStatus)
		 {
			 Reporter.log("Admin home page opend succeessfully",true);
		 }
		 else
		 {
			 Reporter.log("Admin home page not opend succeessfully",true);
		 }
	  
	  AppFunctions.clickBranches(driver);
	 bStatus=Utilites.textPresent(driver, "NewBranch");
	 if(bStatus)
	 { 
	  Reporter.log("Branch page open successfully",true);
  }
	 else
	 {
		 Reporter.log("Branch page open unsuccessful",false);
	 }
	 }
 @AfterMethod
  public void postCondition() 
  {
	  //close Browser
	 AppFunctions.closeBrowser(driver);
  }
}
