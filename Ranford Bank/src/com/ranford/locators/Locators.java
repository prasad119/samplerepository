package com.ranford.locators;

import org.openqa.selenium.By;

public class Locators {

   // Ranfordhomepage locator
	public static class Ranfordhomepage
	{
		//home 
		public static By imgHome=By.xpath(".//*[@id='Table_07']/tbody/tr/td[2]/a/img");
		//personal banking 
		public static By imgPersonalBanking=By.xpath(".//*[@id='IMG3']");
		//Corporate Banking
		public static By imgCorporateBanking=By.xpath(".//*[@id='Table_07']/tbody/tr/td[4]/a/img");
		//International BAnking
		public static By imgInternationalBanking=By.xpath(".//*[@id='Table_07']/tbody/tr/td[5]/a/img");
		//About Us
		public static By imgAboutUs=By.xpath(".//*[@id='Table_07']/tbody/tr/td[6]/a/img");
		//Personal Banking
		public static By imgPersonal=By.id("personal");
		//corporate
		public static By imgCorporate=By.id("corporate");
		//International
		public static By imgInternational=By.id("NRI");
		//Select Branch
		public static By lstBranchName=By.id("drlist");
		//UserName
		public static By txtUserName=By.id("txtuId");
		//Password
		public static By txtPassword=By.id("txtPword");
		//Login
		public static By imgLogin=By.id("login");
		//Customer Service
		public static By lnkCustomerService=By.linkText("Customer Service");
		//Internet Banking FAQ's
		public static By lnkInternetBankingFAQ=By.linkText("nternet Banking FAQ's");
		//Privacy
		public static By lnkPrivacy=By.linkText("Privacy");
		//Terms And Condition
		public static By lnkTermsAndConditions=By.linkText("Terms and Conditions");
		//Disclaimer
		public static By lnkDisclaimer=By.linkText("Disclaimer");
		//Site Map
		public static By lnkSiteMap=By.linkText("Site Map");	
	}
	//Global Locators
	public static class Global{
		//Home
		public static By imgHome=By.xpath("//img[@src='images/admin_but_01.jpg']");
		//Branches
		public static By imgBranches=By.xpath("//img[@src='images/Branches_but.jpg']");
		//Roles
		public static By imgRoles=By.xpath("//img[@src='images/Roles_but.jpg']");
		//Users
		public static By imgUsers=By.xpath("//img[@src='images/Users_but.jpg']");
		//Employee
		public static By imgEmployee=By.xpath("//img[@src='images/emp_btn.jpg']");
		//Search
		public static By imgSearch=By.xpath("//input[@id='btn_search']");
		//Clear
		public static By imgClear=By.xpath("//input[@id='btn_clsearch'or @id='btn_clear']");
		//Submit
		public static By imgSubmit=By.xpath("//input[@id='btn_insert' or @id='btninsert' or @id='BtnSubmit']");
		//Reset
		public static By imgReset=By.xpath("//input[@id='Btn_Reset'or @id='btnreset']");
		//Cancel
		public static By imgCancel=By.xpath("//input[@id='Btn_cancel'or @id='btnCancel']");
		//LogOut
		public static By imgLogout=By.xpath("//img[@src='images/admin_but_03.jpg']");
		}
	//Branches
	public static class Branches {
		//Country
		public static By lstCountry=By.id("lst_countryS");
		//State
		public static By lstState=By.id("lst_stateS");
		//City
		public static  By lstCity=By.id("lst_cityS");	
		//Clear
		public static By imgClear=By.id("btn_clsearch");
		//New Branch
		public static By imgNewBranch=By.id("BtnNewBR");
		}
	
	//New Branch
	public static class NewBranch{
		//BranchName
		public static By txtBranchName=By.id("txtbName");
		//Address1
		public static By txtAddress1=By.id("txtAdd1");
		//Address2
		public static By txtAddress2=By.id("Txtadd2");
		//Address3
		public static By txtAddress3=By.id("txtadd3");
		//Area
		public static By txtArea=By.id("txtArea");
		//Zip Code
		public static By txtZipcode=By.id("txtZip");
		//Country
		public static By lstCountry=By.id("lst_counrtyU");
		//state
		public static By lstState=By.id("lst_stateI");
		//city
		public static By lstCity=By.id("lst_cityI");
		
	}
		
	//Roles
		public static class Roles{
			//New roles
			public static By imgNewRole=By.id("btnRoles");
		}
		//New Roles Creation
	public static class NewRole{
		//Role Name
		public static By txtRoleName=By.id("txtRname");
		//Role Desc
		public static By txtRoleDesc=By.id("txtRDesc");
		//Role type
		public static By lstRoleType=By.id("lstRtypeN");
		}
		
	// Users	
	public static class Users{
		//Branches
		public static By lstBranches=By.id("lst_branchS");
		//Roles
		public static By lstRoles=By.id("lst_rolesS");
		//NewUser
		public static By imgNewUser=By.id("Btnuser");
	}
	
		// New Users
		public static class NewUser{
			//Role
			public static By lstRole=By.id("lst_Roles");
			//Branch
			public static By lstBranch=By.id("lst_Branch");
			//CustomerID
			public static By lstCustomerId=By.id("DrCName");
			//User Name
			public static By txtsUserName=By.id("txtUname");
			//Login Password
			public static By txtLoginpassword=By.id("txtLpwd");
			//Transaction password
			public static By txtTranctionPassword=By.id("txtTpwd");
			}
		//Employee
		public static class Employee{
			//New Employee
			public static By imgNewEmployee=By.id("BtnNew");
		}
	   // New Employee Creation
			public static class NewEmployee{
				//Employer Name
				public static By txtEmployerNmae=By.id("txtUname");
				//Login Password
				public static By txtLoginPassword=By.id("txtLpwd");
				//Role
				public static By lstRole=By.id("lst_Roles");
				//Branch 
				public static By lstBranch=By.id("lst_Branch");
			}
			
		
	}
	
