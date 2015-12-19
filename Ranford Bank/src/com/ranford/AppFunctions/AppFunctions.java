package com.ranford.AppFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.ranford.PageObject.PageObject;
import com.ranford.config.Config;
import com.ranford.testdata.TestData;
import com.utils.Utilites;

public class AppFunctions {

	/********************************************************************
	 * Method Name:Application Launching
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return wertyuio
	 *******************************************************************/

	public static WebDriver launchApplication()
	{
		WebDriver driver = null;
	
		//for selecting the browser we want work
		switch(Config.sBrowser)
		{
		case "Firefox":
		{
			driver=new FirefoxDriver();  //create instance for firefox
		    break;
		}		
		case "Chrome":  //create instance for chrome
		{
			System.setProperty("webdriver.chrome.driver","chromdriverpath");
			driver=new ChromeDriver();
			break;
		}		
		}
		driver.get(Config.sUrl2);//launching url
		driver.manage().window().maximize();//for maximizing browser
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS); //wait for 8 seconds before raising the exception
		return driver;//return browser instance		
	}
	
	/********************************************************************
	 * Method Name:AdminLogin
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean adminLogin(WebDriver driver)
	{
		try 
		{
			//UserName
			PageObject.RanfordHome.txtUserName(driver).sendKeys(TestData.RanfordHomePage.sUserName);
			//Password
			PageObject.RanfordHome.txtPassword(driver).sendKeys(TestData.RanfordHomePage.sPassword);
			//Login
			PageObject.RanfordHome.imgLogin(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/********************************************************************
	 * Method Name:clickBranches
	 * Method For:opening branch page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickBranches(WebDriver driver)
	{
		 try
		 {
			 //click Branch
			 PageObject.Global.imgBranches(driver).click();
			 return true;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 return false;
		 }
	}
	
	/********************************************************************
	 * Method Name:clickNewBranches
	 * Method For:opening New Branch Entry page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static  boolean clickNewBranches(WebDriver driver)
	{
		try
		{
			PageObject.BranchPage.imgNewBranch(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
			}
	}
	
	/********************************************************************
	 * Method Name:clickHome
	 * Method For:
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickHome(WebDriver driver){
		try 
		{
			PageObject.Global.imgHome(driver).click();
			return true;
			}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/********************************************************************
	 * Method Name:clickBranchLogout
	 * Method For:viewing 
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickBranchLogout(WebDriver driver){
		try
		{
			PageObject.Global.imgLogout(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	/********************************************************************
	 * Method Name:SelectBranch Details
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean selectBranchDetails(WebDriver driver)
	{
		try
		{
			PageObject.BranchPage.lstCountry(driver).selectByVisibleText(TestData.BranchPage.sCountry);
			PageObject.BranchPage.lstState(driver).selectByVisibleText(TestData.BranchPage.sCity);
			PageObject.BranchPage.lstCity(driver).selectByVisibleText(TestData.BranchPage.sCity);
			PageObject.Global.imgSearch(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	/********************************************************************
	 * Method Name:clickCancleButton
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickCancleButton(WebDriver driver)
	{
		try
		{
		PageObject.Global.imgClear(driver).click();
		return true;
	}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	/********************************************************************
	 * Method Name:NewBranchEntry
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * modified By:
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean BranchEntry(WebDriver driver,String sBranchName,String sAddress1,String sZipCode,String sCountry,String sState,String sCity)
	{
		try
		{
			PageObject.NewBranch.txtBranchName(driver).sendKeys(sBranchName);
			PageObject.NewBranch.txtAddress1(driver).sendKeys(sAddress1);
			PageObject.NewBranch.txtAddress2(driver).sendKeys(TestData.NewBranches.sAddress2);
			PageObject.NewBranch.txtAddress3(driver).sendKeys(TestData.NewBranches.sAddress3);
			PageObject.NewBranch.txtArea(driver).sendKeys(TestData.NewBranches.sArea);
			PageObject.NewBranch.txtZipCode(driver).sendKeys(sZipCode);
			PageObject.NewBranch.lstCountry(driver).selectByValue(sCountry);
			PageObject.NewBranch.lstState(driver).selectByValue(sState);
			PageObject.NewBranch.lstCity(driver).selectByValue(sCity);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/********************************************************************
	 * Method Name:clickSubmit
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickSubmit(WebDriver driver)
	{
		try
		{
			PageObject.Global.imgSubmit(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/********************************************************************
	 * Method Name:clickReset
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickReset(WebDriver driver)
	{
		try
		{
			PageObject.Global.imgReset(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	/********************************************************************
	 * Method Name:clickCancle
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean clickCancle(WebDriver driver)
	{
		try
		{
			PageObject.Global.imgCancle(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/********************************************************************
	 * Method Name:NewBranchHome
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean NewBranchHome(WebDriver driver)
	{
		try
		{
			PageObject.Global.imgHome(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/********************************************************************
	 * Method Name:NewBranchLogout
	 * Method For:login to admin home page
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean NewBranchLogout(WebDriver driver)
	{
		try
		{
			PageObject.Global.imgLogout(driver).click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	/********************************************************************
	 * Method Name:CloseBrowser
	 * Method For:closing browser
	 * Created On:09:11:2015
	 * Created  By:
	 * Reviewed By:
	 * @return 
	 * @return 
	 *******************************************************************/
	public static boolean closeBrowser(WebDriver driver)
	{
		try{
			driver.quit();
			return true;
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
	//
	public static boolean editWebTable(WebDriver driver,String expectedValue,String sZipCode)
	{
		
		//status
		 boolean bFlage=false;
		
		  String totalTableCount=driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody/tr[7]/td")).getText();
		    
	      String[] tableLinks=totalTableCount.split(" ");
	      
	      for(int iTableCount=1;iTableCount<tableLinks.length;iTableCount++)
	      {
	    	  
	    	  //make reference to table
	    	   WebElement objTable=driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody"));
	    	   
	    	   //target the rows
	    	    List<WebElement>   objRows=objTable.findElements(By.tagName("tr"));
	    	    
	    	    //loop through each row
	    	    
	    	      for(int iRowCount=1;iRowCount<objRows.size();iRowCount++)
	    	      {
	    	    	   List<WebElement> objColumns=objRows.get(iRowCount).findElements(By.tagName("td"));
	    	    	   
	    	    	   for(int iColCount=0;iColCount<objColumns.size();iColCount++)
	    	    	   {
	    	    		  String colText=objColumns.get(iColCount).getText();
	    	    		  System.out.println(colText);
	    	    		   if(colText.contains(expectedValue))
	    	    		   {
	    	    			   objColumns.get(6).findElement(By.tagName("a")).click();
	    	    			   driver.findElement(By.id("txtzipu")).sendKeys(sZipCode);
	    	    			   driver.findElement(By.id("btnupdate")).click();
	    	    			   if(Utilites.isAlertPresent(driver))
	    	    			   {
	    	    				   Reporter.log(Utilites.getAlertText(driver),true);
	    	    				   //handle the alert text
	    	    				   Utilites.handleAlert(driver);
	    	    			   }
	    	    			   
	    	    			   
	    	    			   bFlage=true;
	    	    			   break;
	    	    		   }
	    	    	   }//3rd for 
	    	    	  
	    	    	   if(bFlage==true)
	    	    	   {
	    	    		   break;
	    	    	   }
	    	    	   
	    	      }//2nd for 
	    	    
	    	   
	    	   if(bFlage==true)
	    	   {
	    		   break;
	    	   }
	    	   else
	    	   {
	    	  
	    	  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	  driver.findElement(By.linkText(tableLinks[iTableCount])).click();
	    	  
	    	   }
	      
	      
	      
	      
	      }//1 for 
   return true;
   
	}
	
	
}

