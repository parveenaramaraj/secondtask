package com.selenium.framework.testCases;

import com.selenium.framework.pages.UserRegistrationPage;

public class UserRegistration extends BaseClass {
	
	static UserRegistrationPage userregistration = new UserRegistrationPage();
	
	//@Test
	public static void user(String username, String NewMobile, String Newemail, String Newpass) {	
		appLogs.info("website is opened");
	
		userregistration.setNewuser(userName);
		appLogs.info("Entered new username");
		userregistration.setMobilenumber(NewMobile);
		appLogs.info("Entered new mobile number");
		userregistration.setEmail(Newemail);
		appLogs.info("Entered new email ID");
		userregistration.SetPasswrd(Newpass);
		appLogs.info("Entered new Password");
		userregistration.ClickSignup();
		

	}
}
