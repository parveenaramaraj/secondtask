package com.selenium.framework.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.selenium.framework.utility.Constants;
import com.selenium.framework.utility.ReadConfig;

public class BaseClass {

	
	public static WebDriver driver;
	static ReadConfig readconfig = new ReadConfig();

	public static final String baseURL = "https://www.amazon.in/";
	public static final String signupURL = "https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	public static final String userName = readconfig.getUserName();
    public static final String password = readconfig.getPassword();
    public static Logger appLogs = Logger.getLogger("Amazon");

    @Parameters("browser")
	@BeforeClass
public void setup(String browser) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty(Constants.ROOT_DIR) + readconfig.getChromePath());
		driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty(Constants.ROOT_DIR) +readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		driver.get(baseURL);		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	
	
}
}
