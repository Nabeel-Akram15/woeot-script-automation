package tests;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {
	static AppiumDriver<MobileElement> driver;
	//WebDriverWait wait= new WebDriverWait(driver, 40);
	
	@BeforeClass
    public void information()
    {
   	 System.out.println("Welcome In Automation");
    }
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
    }
	
   @Test(priority=0 ,dataProvider="Negative Values Login Check" , dataProviderClass=ParameterByDataprovider.class)
   public void LoginNegativeValues(String Email,String Password) throws Exception
   
    {
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	   
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   
	    System.out.println("Moving to Login Screen");
	    
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnLogin"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys("testaomata8@gmail.com");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys("123456");		        
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
	   
	   MobileElement Dashboard=(MobileElement) wait.until(ExpectedConditions. visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));		  
	   Assert.assertEquals(Dashboard.getText(), "Events","You are not in the Event Selection Screen");
	   System.out.println("Its Complete");
			
    }
     
	 @Test(priority=1 ,dataProvider="Positive Values Login Check" ,dataProviderClass = ParameterByDataprovider.class)
    public void LoginPositiveValue(String Email, String Password) throws Exception
    {
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
        System.out.println("Moving to Login Screen");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnLogin"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys(Email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys(Password);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
        MobileElement Dashboard=(MobileElement) wait.until(ExpectedConditions. visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));		  
       Assert.assertEquals(Dashboard.getText(), "Events","You are not in the Event Selection Screen");
   	    System.out.println("Its Complete");
    }
	      
}
