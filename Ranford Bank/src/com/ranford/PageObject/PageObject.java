package com.ranford.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ranford.locators.Locators;

public class PageObject {
//Page Object Ranford home page
	public static class RanfordHome{
		//Home pageobject
		public static WebElement imgHome(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgHome);
		}
		//Personal Banking
		public static WebElement imgPersonalBanking(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgPersonalBanking);
		}
		//Corporate Banking
		public static WebElement imgCorporateBanking(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgCorporateBanking);
		}
		//International Banking PageObject
		public static WebElement imgInternationalBanking(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgInternationalBanking);
		}
		//AboutUs PageObject
		public static WebElement imgAboutUs(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgAboutUs);
		}
		//Personal PageObject
		public static WebElement imgPersonal(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgPersonal);
		}
		//Corporate PageObject
		public static WebElement imgCorporate(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgCorporate);
		}
		//International PageObject
		public static WebElement imgInternational(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgInternational);
		}
		//Branch Name PageObject
		public static Select lstBranchName(WebDriver driver){
			return new Select(driver.findElement(Locators.Ranfordhomepage.lstBranchName));
		}
		//UserName PageObject
		public static WebElement txtUserName(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.txtUserName);
		}
		//Password PageObject
		public static WebElement txtPassword(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.txtPassword);
		}
		//Login PageObject
		public static WebElement imgLogin(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.imgLogin);
		}
		//Customer Service PageObject
		public static WebElement lnkCustomerService(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.lnkCustomerService);
		}
		//International Banking FAQ's
		public static WebElement lnkInternetBankingFAQ(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.lnkInternetBankingFAQ);
		}
		//Privacy PageObject
		public static WebElement lnkPrivacy(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.lnkPrivacy);
		}
		//Terms And Condition PageObject
		public static WebElement lnkTermsAndConditions(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.lnkTermsAndConditions);
		}
		//Disclaimer PAgeObject
		public static WebElement lnkDisclaimer(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.lnkDisclaimer);
		}
		//SiteMape PageObject
		public static WebElement lnkSiteMap(WebDriver driver){
			return driver.findElement(Locators.Ranfordhomepage.lnkSiteMap);
		}
		
		
	}	
	
	
//PageObject For BranchPAge
		public static class BranchPage{
			//Country pageobject
			public static Select lstCountry(WebDriver driver){
				return new Select(driver.findElement(Locators.Branches.lstCountry));
		}
			//State PageObject
			public static Select lstState(WebDriver driver){
				return new Select(driver.findElement(Locators.Branches.lstState));
			}
			//City PageObject
			public static Select lstCity(WebDriver driver){
				return new Select(driver.findElement(Locators.Branches.lstCity));
}
			//NewBranch PageObject
			public static WebElement imgNewBranch(WebDriver driver){
				return driver.findElement(Locators.Branches.imgNewBranch);
         }

		}	
		
		
//New Branch PageObject
			public static class NewBranch{
				//Branch Name PageObject
				public static WebElement txtBranchName(WebDriver driver){
				return driver.findElement(Locators.NewBranch.txtBranchName);
			}
			//Address1 PageObject
				public static WebElement txtAddress1(WebDriver driver){
					return driver.findElement(Locators.NewBranch.txtAddress1);
				}
			//Address2 PageObject
				public static WebElement txtAddress2(WebDriver driver){
					return driver.findElement(Locators.NewBranch.txtAddress2);
				}
			//Address3 PageObject
				public static WebElement txtAddress3(WebDriver driver){
					return driver.findElement(Locators.NewBranch.txtAddress3);
				}
			//Area PageObject
				public static WebElement txtArea(WebDriver driver){
					return driver.findElement(Locators.NewBranch.txtArea);
				}
			//ZipCode
				public static WebElement txtZipCode(WebDriver driver){
					return driver.findElement(Locators.NewBranch.txtZipcode);
				}
			//Country
				public static Select lstCountry(WebDriver driver){
					return new Select(driver.findElement(Locators.NewBranch.lstCountry));
                }
			//State PageObject
				public static Select lstState(WebDriver driver){
					return new Select(driver.findElement(Locators.NewBranch.lstState));
               }
			//City PageObject
				public static Select lstCity(WebDriver driver){
					return new Select(driver.findElement(Locators.NewBranch.lstCity));
               }
			}	
			
			
			
//PageObject for Role
				public static class Role{
					//New Role PageObject
					public static WebElement imgNewRoles(WebDriver driver){
						return driver.findElement(Locators.Roles.imgNewRole);
					}
				}
				
				
//NewRoles PageObject
              public static class NewRole{
            	  //RoleName PageObject
            	  public static WebElement txtRoleName(WebDriver driver){
            		  return driver.findElement(Locators.NewRole.txtRoleName);
            	  }
            	  //RoleDesc PageObject
            	  public static WebElement txtRoleDesc(WebDriver driver){
            		  return  driver.findElement(Locators.NewRole.txtRoleDesc);
            	  }
            	  //Role Type PageObject
            	  public static Select lstRoleType(WebDriver driver){
            		  return new Select(driver.findElement(Locators.NewRole.lstRoleType));
            	  }
              } 
              
              
//PageObject For Users 
            	 public static class Users{
            		 //Branch PageObject
            		 public static WebElement lstBranch(WebDriver driver){
            			 return driver.findElement(Locators.Users.lstBranches);
            		 }
            		 //Roles PageObject
            		 public static WebElement lstRoles(WebDriver driver){
            			 return driver.findElement(Locators.Users.lstRoles);
            			}
            		 //NewUsers PageObject 
            		 public static WebElement imgNewUser(WebDriver driver){
            			 return driver.findElement(Locators.Users.imgNewUser);
            		 }
             }
            	 
            	 
            	 
// Page For New Users
            		 public static class NewUser{
            			 //Role PageObject
            			 public static Select lstRole(WebDriver driver){
            				 return new Select ( driver.findElement(Locators.NewUser.lstRole));
            			 }
            			 //Branch PageObject
            			 public static Select lstBranch(WebDriver driver){
            				 return new Select(driver.findElement(Locators.NewUser.lstBranch));
            			 }

            			 //CustomerId PageObject
            			 public static Select lstCustomerId(WebDriver driver){
            				 return new Select(driver.findElement(Locators.NewUser.lstCustomerId));
            			 }

            			 //UserNmae PageObject
            			 public static WebElement txtUserName(WebDriver driver){
            				 return driver.findElement(Locators.NewUser.txtsUserName);
            			 }

            			 //LoginPAssword PageObject
            			 public static WebElement txtLoginPassword(WebDriver driver){
            				 return driver.findElement(Locators.NewUser.txtLoginpassword);
            			 }

            			 //Transaction PageObject
            			 public static WebElement txtTansactionPassword(WebDriver driver){
            				 return driver.findElement(Locators.NewUser.txtTranctionPassword);
            			 }	  
            		 }
            		 
     		 
//PageObject For Employee
            		 public static class Employee{
            			 //NewEmployee
            			 public static WebElement imgNewEmpployee(WebDriver driver){
            				 return driver.findElement(Locators.Employee.imgNewEmployee);
            			 }
            		 }
            		 
            		 
//PageObject For Employee
            	public static class NewEmpoyee{
           		 //Employee Nmae 
  				public static WebElement txtEmployeeName(WebDriver driver){
            		 return driver.findElement(Locators.NewEmployee.txtEmployerNmae);
            		}
            	 //Login Password 
            	 public static WebElement txtLoginPassword(WebDriver driver){
            		 return driver.findElement(Locators.NewEmployee.txtLoginPassword);
            		}
            	 //Role PageObject
            	 public static Select lstRole(WebDriver driver){
            		 return new Select(driver.findElement(Locators.NewEmployee.lstRole));
            	 }
            	 //Branch PageObject
            	 public static Select lstBranch (WebDriver driver){
            		 return new Select(driver.findElement(Locators.NewEmployee.lstBranch));
            	 }
            	}    
            	
            	
//Page for Global
            	 public static class  Global{
            		 //Branches
            		 public static WebElement imgBranches(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgBranches);
            		 }
            		 //Roles
            		 public static WebElement imgRoles(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgRoles);
            		 }
            		 //Users
            		 public static WebElement imgUsers(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgUsers);
            		 }
            		 //Employee
            		 public static WebElement imgEmployee(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgEmployee);
            		 }
            		 //Search
            		 public static WebElement imgSearch(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgSearch);
            		 }
            		 //Clear
            		 public static WebElement imgClear(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgClear);
            		 }
            		 //Submit
            		 public static WebElement imgSubmit(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgSubmit);
            		 }
            		 //Reset
            		 public static WebElement imgReset(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgReset);
            		 }
            		 //Cancle
            		 public static WebElement imgCancle(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgCancel);
            		 }
            		 //Home PageObject
            		 public static WebElement imgHome(WebDriver driver)
            		 {
            			 return driver.findElement(Locators.Global.imgHome);
            		 }
            		 //Logout 
            		 public static WebElement imgLogout(WebDriver driver){
            			 return driver.findElement(Locators.Global.imgLogout);
            		 }
            	 }
             }
  