package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Edit_Profile {
	static AppiumDriver<MobileElement> driver;	
	@BeforeMethod 
	public void Verification() {
		
		try {
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0.0");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			
	        cap.setCapability(MobileCapabilityType.UDID , "192.168.1.109:5555");
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S7 edge");
	        
	        //This is App related information
	        //cap.setCapability(MobileCapabilityType.APP,"/Internal storage/Download/Weoto-1-(1.0).apk");
	        cap.setCapability("appPackage", "com.weoto");
	        cap.setCapability("appActivity",".activities.SplashActivity");
	        
	        URL url=new URL(" http://127.0.0.1:4725/wd/hub");
	        driver= new AppiumDriver<MobileElement>(url,cap);
	        
			System.out.println("Application started...");
			Thread.sleep(2000);

		}catch (Exception exp)
			{
			System.out.println("Exception cause is"  + exp.getCause());
			System.out.println("Exception message  is"  + exp.getMessage());
			exp.getStackTrace();
			}
		
		
		}
	//(dataProvider="SignUp FullName Negative Values Check", dataProviderClass=ParameterByDataprovider.class)
	@Test 
	public void Edit_Name() throws Exception
	{
	  WebDriverWait wait = new WebDriverWait(driver,5);
	 	   // Allowing  FOr SignUp
	  
	  System.out.println("You are in FullName Negative Values Function");			
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  //Login Now
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnLogin"))).click();  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys("dev.aomata@gmail.com");
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys("123456");
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
  	  //Dashboard
  	  
  	  System.out.print("You are in Edit Profile and in Edit Name Function");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/menuItemTitle"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/editNameImg"))).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("com.weoto:id/lblFriendlyName")).clear();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputFriendlyName"))).clear();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputFriendlyName"))).sendKeys("Nabeel");
	  driver.closeApp();
	  System.out.println("This FUnction is completed sucessfully");
	}
//	@Test(dataProvider="Edit Password Values", dataProviderClass=ParameterByDataprovider.class)
//	public void Edit_PAssword(String Old_Password, String New_Password) throws Exception
//	{
//		Thread.sleep(2000);
//		System.out.println("Allowing Permissions");
//			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//        Thread.sleep(500);
//  	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
//  	    Thread.sleep(3000);
//  	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
//  	    Thread.sleep(3000);
//  	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
//  	    Thread.sleep(3000);
//  	    driver.findElement(By.className("android.widget.Button")).click();
//  	    Thread.sleep(2000);
//  	    driver.findElement(By.className("android.widget.ImageButton")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
//		Thread.sleep(2000);
//		System.out.println("You Are In Password change function");
//		driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
//		Thread.sleep(2000);
//		System.out.println("Entering old Password");
//		driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys(Old_Password);
//		Thread.sleep(2000);
//		System.out.println("Old Password Eye Button is Enabling");
//		driver.findElement(By.id("com.weoto:id/btnShowNewPassword")).click();
//		Thread.sleep(2000);
//		System.out.println("Old Password Eye Button is Disabling");
//		driver.findElement(By.id("com.weoto:id/btnShowNewPassword")).click();
//		Thread.sleep(2000);
//		System.out.println("Entering new Password");
//		driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys(New_Password);
//		Thread.sleep(2000);
//		System.out.println("New Password Eye button enabling");
//		driver.findElement(By.id("com.weoto:id/btnShowConfirmPassword")).click();
//		Thread.sleep(2000);
//		System.out.println("New Password Eye button Disabling");
//		driver.findElement(By.id("com.weoto:id/btnShowConfirmPassword")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("android.widget.Button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.weoto:id/leftSideButton")).click();
//		Thread.sleep(2000);
//		driver.closeApp();
//		System.out.println("Password Eye buttons and Password change are comppletd");
//		
//	}
	
	
}
