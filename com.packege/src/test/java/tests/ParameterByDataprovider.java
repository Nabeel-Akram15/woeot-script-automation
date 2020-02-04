package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParameterByDataprovider {
	static AppiumDriver<MobileElement> driver;
	
	
	
	//Login Positive
	
	
	@DataProvider(name="Positive Values Login Check")
    public Object[][] Positive_Vlues_Login(){
    return new Object[][] 
    	{
            { "dev.aomata4@gmail.com", "123456"},
//            { "nabeelakram15@yahoo.com", "123456789"},
//            { "na405762@gmail.com", "123456789"},
            
        };

    }

	//Login Negative
	@DataProvider(name="Negative Values Login Check Email")
    public Object[][] Negative_Values_Login(){
    return new Object[][] 
    	{
            { "abubakarhussain517gmail.com", "123456" },
            { "abubakarhussain517@.com", "123456" },
            { "abubakarhussain517@gmail.", "123456" },
            { "abubakarhussain517gmailcom", "123456" },
            { "abowejdheh3838517gmail.com", "123456" },
            { "abowejdheh3838517gmail.com", "123456" },
            
        };

    }
	
	@DataProvider(name="Negative Values Login Check Password")
    public Object[][] Negative_Values_Login_Password(){
    return new Object[][] 
    	{
            { "dev.aomata3@gmail.com", "12345680" },
            { "dev.aomata3@gmail.com", "3456" },
        };

    }
	//SignUp Positive
	
	//SignUp Negative
	@DataProvider(name="SignUp FullName Negative Values Check")
    public Object[][] Negative_Values_SignUp(){
    return new Object[][] 
    	{
            { ""},
            { "  "},
            
            
            
        };

    }
		
	
	@DataProvider(name="SignUp Email Negative Values")
    public Object[][] Negative_Values_SignUp_Email(){
    return new Object[][] 
    	{
    	  { "abubakarhussain517gmail.com"},
    	  { "abubakarhussain517@gmailcom"},
        };

    }
	@DataProvider(name="SignUp Password check Negative Values")
    public Object[][] Negative_Values_SignUp_Password(){
    return new Object[][] 
    	{
    	  { ""},
    	  { " "},
    	  { "12"},
    	  
        };

    }
	
	@DataProvider(name="Edit Password Values")
    public Object[][] Negative_Values_Edit_SignUp_(){
    return new Object[][] 
    	{
    	  { "123456789","4"},
    	  { "123456789",""},
        };

    }
	@DataProvider(name="SignUp Password check Negative Values")
    public Object[][] Negative_Values_SignUp_Passwords(){
    return new Object[][] 
    	{
    	  { ""},
    	  { "  "},
    	  { "12"},
    	  
        };

    }
	//Event Creation Positive
	
	//Event Creation Negative 
	@DataProvider (name="New Event Negative Values")
	public Object[][] New_Event_Negative_Values() {
		return new Object[][]
				{
			{"  "},
			
	};
    }
	@DataProvider (name="New Event_Description Negative Values")
	public Object[][] New_Event_Description_Negative_Values() {
		return new Object[][]
				{
			{""},
			
	};
    }
}

    
    
 