package com.selenium.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage {
 
	
@FindBy(css = "#ap_customer_name")
WebElement NewUsername;

@FindBy(id="ap_phone_number")
WebElement Newmobilenumber;

@FindBy(id="ap_email")
WebElement NewEmail;

@FindBy(id="ap_password")
WebElement Newpassword;

@FindBy(css = "#continue")
WebElement clickContinueSignup;

public void setNewuser (String NewUser)
{
	NewUsername.sendKeys(NewUser);
}

public void setMobilenumber ( String NewMobile)
{
	Newmobilenumber.sendKeys(NewMobile);
}

public void setEmail (String Newemail)
{
	NewEmail.sendKeys(Newemail);
}
public void SetPasswrd (String Newpass)
{
Newpassword.sendKeys(Newpass);
}

public void ClickSignup()
{
	clickContinueSignup.click();
}
}