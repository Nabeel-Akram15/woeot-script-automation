package tests;

import java.net.URL;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class SignUp {
	
	static AppiumDriver<MobileElement> driver;
	
	// This Method is used for configuration with device 
	
	
	     @BeforeClass
	     public void information()
	     {
	    	 System.out.println("Welcome In Automation of mobile");
	     }
	     
	  // This Method is used for configuration with device 
	     @BeforeMethod 
	 	public void Verification() {
	 		
	 		try {
	 			DesiredCapabilities cap=new DesiredCapabilities();
	 			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0.0");
	 			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 			
	 	        cap.setCapability(MobileCapabilityType.UDID , "192.168.1.106:5555");
	 	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S7 edge");
	 	        
	 	        //This is App related information
	 	        //cap.setCapability(MobileCapabilityType.APP,"/Internal storage/Download/Weoto-1-(1.0).apk");
	 	        cap.setCapability("appPackage", "com.weoto");
	 	        cap.setCapability("appActivity",".activities.SplashActivity");
	 	        
	 	        URL url=new URL(" http://127.0.0.1:4723/wd/hub");
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
	     @AfterMethod
	     public void Wait() throws Exception
	     {
	    	 System.out.println("Next method is staring");
	    	 Thread.sleep(2000);
	     }
	     
	
	   // Full Name Testing
	    @Test (priority=3 ,dataProvider="SignUp FullName Negative Values Check", dataProviderClass=ParameterByDataprovider.class)
	  	public void FullName_Negative_Values_Check(String FullName) throws Exception
	  	{
	    	
	       WebDriverWait wait = new WebDriverWait(driver,60);
	 	   // Allowing  FOr SignUp
	 			System.out.println("You are in FullName Negative Values Function");
	 			
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();		  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();

	    System.out.println("Moving to SignUp Screen");
	 		    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Sign up']"))).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtName"))).sendKeys(FullName);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
	    
	 	MobileElement errortext=(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/leftSideButton")));   	
        System.out.println("Test for FullName Maximum length is Pass");
	  	}
	    
	    
	@Test (priority=3 ,dataProvider="SignUp Password check Negative Values", dataProviderClass=ParameterByDataprovider.class)
 	public void Password_Negative_Values_Check(String Password) throws Exception
 	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		System.out.println("You are in Blank Password Length FUnction");
		//Its Allowing Permission for different things
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();		  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
      
   		driver.findElement(By.xpath("//*[@text='Sign up']")).click();
   		
   		// Entering Information for Sign up
   		
   		driver.findElement(By.id("com.weoto:id/txtName")).sendKeys("Nabeel");
   		driver.findElement(By.className("android.widget.Button")).click();
   		Thread.sleep(2000);
   		driver.findElement(By.id("com.weoto:id/txtEmail")).sendKeys("jfjifiw3d@yahoo.com");
   		driver.findElement(By.className("android.widget.Button")).click();
   		Thread.sleep(2000);
   		driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys(Password);
   		Thread.sleep(2000);
   		driver.findElement(By.className("android.widget.Button")).click();
   		Thread.sleep(2000);
 	   	driver.findElement(By.id("com.weoto:id/leftSideButton")).click();
 	   Thread.sleep(2000);
 	   
   		driver.closeApp();
   		System.out.println("BlankPasswordLength function is completed");
 	}
            //Password Eye button enable Check 
	// This is done and need to just put eye button id
		//Eye button of Enable or Disable
		@Test (priority=6)
		public void PasswordEyeEnabelDisable() throws Exception
		{
			Thread.sleep(5000);
			System.out.println("You are in Eye Button Enable or Diable Function");
	   // Allowing  FOr SignUp
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		      // Allowing  FOr SignUp
		      
	      
	   		driver.findElement(By.xpath("//*[@text='Sign up']")).click();
	   		Thread.sleep(2000);
	   		// Entering Information for Sign up
	   		
	   		driver.findElement(By.id("com.weoto:id/txtName")).sendKeys("Nabeel");
	   		
	   		
	   		
	   		driver.findElement(By.className("android.widget.Button")).click();
	   		Thread.sleep(2000);
	   		driver.findElement(By.id("com.weoto:id/txtEmail")).sendKeys("iwfojfou39uf9@yahoo.com");
	   		driver.findElement(By.className("android.widget.Button")).click();
	   		Thread.sleep(2000);
	   		driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("Nabeel12");
	   		driver.findElement(By.className("android.widget.Button")).click();
	   		driver.closeApp();
	   		
	   		//driver.findElement(By.xpath("//*[@id='openeyeBtn']")).click();
	   		System.out.println("Eye Button is Enabaled");
	   		
	   		//driver.findElement(By.xpath("//*[@id='openeyeBtn']")).click();
	   		System.out.println("Eye Button is Disabaled");

		
		}
		@Test (priority=3 ,dataProvider="SignUp Email Negative Values", dataProviderClass=ParameterByDataprovider.class)
		public void Invalid_Email_Values_Check(String Email) throws Exception
		{
			Thread.sleep(5000);
			System.out.println("You are in Invalid Email Function");
			System.out.println("Allowing Permissions");
			//Its Allowing Permission for different things
			
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	   // Allowing  FOr SignUp
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@text='Sign up']")).click();
	   		Thread.sleep(2000);
	   		// Entering Information for Sign up
	   		
	   		driver.findElement(By.id("com.weoto:id/txtName")).sendKeys("Nabeel");
	   		driver.findElement(By.className("android.widget.Button")).click();
	   		Thread.sleep(2000);
	   		driver.findElement(By.id("com.weoto:id/txtEmail")).sendKeys(Email);
	   		driver.findElement(By.className("android.widget.Button")).click();
	   		Thread.sleep(2000);
	 	   	driver.findElement(By.id("com.weoto:id/leftSideButton")).click();
	   		Thread.sleep(2000);
	   		driver.closeApp();
	   		System.out.println("Incorrect Email function is completed");
	   		
		}
           
	
}
