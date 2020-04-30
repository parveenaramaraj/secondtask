package com.selenium.framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	  public ReadConfig() {
		  File src = new File(System.getProperty(Constants.ROOT_DIR)+ "//src//test//resources//PropertyFile//config.properties");
		  try {
			  FileInputStream fis = new FileInputStream(src);
			  prop = new Properties();
			  prop.load(fis);
		  } catch(Exception e) {
			  System.out.println("Exception e " + e.getMessage());
		  }
	  }
	  
	  public String getChromePath() {
		  String chromePath = "//Users//arunprasadradhakrishnan//Desktop//Parveena workdesk//SeleniumFramework//chromedriver";
				  //prop.getProperty("chromeDriverPath");
		  return chromePath;
	  }
	  
	  public String getFirefoxPath() {
		  String firefoxPath = "//src//test//resources//browser_binaries//geckodriver.exe";
				  //prop.getProperty("firefoxDriverPath");
		  return firefoxPath;
	  }
	  
	    
	  public String getApplicationURL() {
		  String url = "https://www.amazon.in/";
				  //prop.getProperty("baseURL");
		  return url;
	  }
	  public String getUserName() {
		  String userName = prop.getProperty("userName");
		  return userName;
	  }
	  public String getPassword() {
	      String password = prop.getProperty("password");
	      return password;
	  
		  
	  }
	  
	  public String getSignupURL() {
		  
		  String url = "https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		return null;
		  
	  }
	  
	  public String getYourname() {
		  String yourname = prop.getProperty("yourname");
		  return yourname;
	  }
	  
	  public String getMobileNumber() {
		  
		  String yourmobilenumber = prop.getProperty("yourmobilenumber");
		return yourmobilenumber;
		  
	  }
	  
	  public String getEmailOptional() {
		  String email = prop.getProperty("email");
		return email;
		 
	  }
	  
	  public String SetPassword()
	  {
		  String newpassword = prop.getProperty("newpassword");
		return newpassword;
		  
	  }
	  }

