package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ranford.AppFunctions.AppFunctions;
import com.utils.Utilites;

public class WebTable {
  WebDriver driver;
  boolean bFlage=false;
	@Test
  public void f() throws Exception {
	  
	 driver=AppFunctions.launchApplication();
	 
	      AppFunctions.adminLogin(driver);
	      AppFunctions.clickBranches(driver);
	      
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
	    	    		   if(colText.matches("100"))
	    	    		   {
	    	    			   objColumns.get(6).findElement(By.tagName("a")).click();
	    	    			   driver.findElement(By.id("txtzipu")).sendKeys("68968");
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
	    	  
	    	  Thread.sleep(2000);
	    	  driver.findElement(By.linkText(tableLinks[iTableCount])).click();
	    	  
	    	   }
	      
	      
	      
	      
	      }//1 for 
	      
	      
	        
	  
  }

}
