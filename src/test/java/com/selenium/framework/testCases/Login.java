package com.selenium.framework.testCases;
import org.testng.annotations.Test;
import com.selenium.framework.pages.LoginPage;
import com.selenium.framework.utility.Constants;

import junit.framework.Assert;

public class Login extends BaseClass{
	static LoginPage loginpage = new LoginPage();

		
		@Test
		public static void login(String username) {	
			appLogs.info("website is opened");
		
			loginpage.setUserName(username);
			appLogs.info("Entered username");
			loginpage.clickOnSubmitButton();
			loginpage.setPassword(password);
			loginpage.clickOnPswdSubmit();
			
			
			
			
}
		@Test
		public static void loginValidation()
		{
			loginpage.loginValidation();
			
		}
				
}
