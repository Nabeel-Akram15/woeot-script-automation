package tests;

import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestConfigurationBase {
	


	public static AndroidDriver<AndroidElement> driver;
	public static String Language;

	@BeforeSuite
	public void Verification() {
		
		
		System.out.println("Enter the Langauge---");
		Scanner myObj = new Scanner(System.in); 
		Language = myObj.nextLine();
		System.out.println("You are Testing in This language: " + Language);
		
		try {
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0.0");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

			cap.setCapability(MobileCapabilityType.UDID , "192.168.100.39:5555");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S7 edge");

			//This is App related information
			//cap.setCapability(MobileCapabilityType.APP,"/Internal storage/Download/Weoto-1-(1.0).apk");
			cap.setCapability("appPackage", "com.weoto");
			cap.setCapability("appActivity",".activities.SplashActivity");

			URL url=new URL(" http://127.0.0.1:4725/wd/hub");
			if(driver==null) {
		      driver= new AndroidDriver<AndroidElement> (url,cap);
			

			System.out.println("Application started...");
			Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, 30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
			System.out.println("Moving to Login Screen");

		
      		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnLogin"))).click();
      		
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys("dev.aomata@gmail.com");
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys("123456");      
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
//
//			MobileElement Dashboardtitle= (MobileElement) wait.
//					until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));
//			String title2= Dashboardtitle.getText();
//			Assert.assertEquals(title2, "Events", "You are in wrong page");
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView"))).click();
			}
		}
		
		catch (Exception exp)
		{
			System.out.println("Exception cause is"  + exp.getCause());
			System.out.println("Exception message  is"  + exp.getMessage());
			exp.getStackTrace();
		}

		
	}
	
	@AfterSuite
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.closeApp();
	}

}
