package com.selenium.framework.pages;

import org.openqa.selenium.By;
import com.selenium.framework.helper.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.selenium.framework.utility.Constants;

public class LoginPage {

	//public static final String Base_URL = "https://www.amazon.in/";
	
	// login
	
	//String Searchitems = Constants.SSEARCH_ITEMS;
	
	public static String loggedUsername = "#nav-link-accountList > span.nav-line-1";
	public static String findsearchbox = "twotabsearchtextbox";
	public static String Viewcartpage = "#sc-expanded-cart-localmarket > div.a-fixed-right-flipped-grid > div > div.a-fixed-right-grid-col.a-col-left > div:nth-child(3)";
	//public static String Addtocartpath = "#nav-cart > span.nav-cart-icon.nav-sprite";

	
	
	
	
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(id="continue-announce")
	WebElement submitButton;
	
	@FindBy(id="ap_password")
	WebElement passwordInput;
	
	@FindBy(id = "signInSubmit")
	WebElement submitpswd;
	
	@FindBy(css = "#twotabsearchtextbox")

	WebElement searchbox;
	
	@FindBy (css = "#nav-search > form > div.nav-right > div > input")
	WebElement HitSearchicon;
	
	@FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-28-of-32.sg-col-16-of-20.sg-col.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > span > div > div > span > a > div > img")
	
	WebElement selectImage;
	
	@FindBy(css = "#freshAddToCartButton > span > input")

	WebElement Addtocart;
	
	@FindBy(css = "#nav-cart > span.nav-cart-icon.nav-sprite")

	WebElement Gotocart;
	
	@FindBy(css = "#rcx-alm-ctnow-full-cart-link > span")
	WebElement Viewedititems;
	
//	@FindBy(css = "#nav-link-accountList > span.nav-line-1")
//	WebElement loggedusername;
//	
	
	//Login
	
	
	public void setUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void clickOnSubmitButton() {
		submitButton.click();
	}
		
	public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }
	
	public void clickOnPswdSubmit() {
		submitpswd.click();
	}
	
  public void loginValidation(){
	  
	  
	  Assert.assertEquals(GlobalDriver.getDriver().findElement(By.cssSelector(loggedUsername)).getText(), Constants.LOGGEDUSERNAME, "Invalid user logged-in");
  }
	

public  void searchbox (String searchitems)
{
	searchbox.sendKeys(searchitems);
	
}

public void searchResultPage()
{
	selectImage.click();
	
}

public  void AddToCart()
{
	Addtocart.click();
}

public void GotoCartItems()
{
	Gotocart.click();
}

public void ViewitemsinCart()
{
	Viewedititems.click();
}

public static void AddtocartValidation()
{
	Assert.assertTrue(Viewcartpage.contains("Onions"), "Search items and cart items are matched");
}
}
