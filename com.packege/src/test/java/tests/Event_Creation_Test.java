package tests;

import static org.testng.Assert.assertEquals;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Event_Creation_Test {
	static AppiumDriver<MobileElement> driver;	
	
	  
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

	public void swipe() throws Exception {
		
		Dimension size = driver.manage().window().getSize();
	  	  int startY = (int) (size.height / 2);
          System.out.println(startY);
          int startX = (int) (size.width * 0.90);
          System.out.println(startX);
          int endX = (int) (size.width * 0.05);
          System.out.println(endX);
          Thread.sleep(1000);
          
          new TouchAction(driver)
          .longPress(PointOption.point(startX,startY))
    	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                  .moveTo(PointOption.point(endX,startY))
                  .release()
                  .perform();
		
	}
	
   public void swipe_back() throws Exception {
		
		Dimension size = driver.manage().window().getSize();
	  	  int startY = (int) (size.height / 4);
          System.out.println(startY);
          int startX = (int) (size.width * 0.90);
          System.out.println(startX);
          int endX = (int) (size.width * 0.05);
          System.out.println(endX);
          Thread.sleep(1000);
          
          new TouchAction(driver)
          .longPress(PointOption.point(endX,startY))
    	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                  .moveTo(PointOption.point(startX,startY))
                  .release()
                  .perform();
		
	}

	@Test(invocationCount = 1)
	public void Positive_Event_Create() throws Exception
	{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
      System.out.println("You are in Event Creation");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
		
				System.out.println("You will Login Now");
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnLogin"))).click();
				 
//				 MobileElement loginpage=driver.findElement(By.className("android.widget.Button"));
//				 
//				 Assert.assertEquals(loginpage.getText(), "Login", "You are not in Login Page");
//				 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys("dev.aomata@gmail.com");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys("123456");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
  
	MobileElement Dashboard=(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));
    Assert.assertEquals(Dashboard.getText(), "Events","You are not in the Event Selection Screen");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/fab"))).click();
	MobileElement element=(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/lblPopupTitle")));
	Assert.assertEquals(element.getText(), "Select Event Type:","Your are in Wrong Page");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnParty"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventTitleName"))).sendKeys("Testing first");
	swipe();
	
	//Enter Description
	
	//MobileElement description =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventDescription")));
               
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventDescription"))).sendKeys("This event will be used for Testing");
		  	//Thread.sleep(2000);
		  	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnDate"))).click();
		  	//Thread.sleep(3000);
		  	   
		  	    //driver.findElement(By.xpath("//*[@text='Wed, Dec 4']")).click();

		  	  //driver.findElement(By.xpath("//*[@text='SET']")).click();
    Thread.sleep(3000);
    swipe();
    WebDriverWait wait1 = new WebDriverWait(driver,320);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/rl_main"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inviteBtn"))).click();
    MobileElement Dashboard1=(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));
    Assert.assertEquals(Dashboard1.getText(), "Events","Your Event is not created Kindly see it");
    
	}
	@Test(dataProvider="New Event Negative Values", dataProviderClass=ParameterByDataprovider.class)
	public void Set_Up_new_Event(String EventName) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		  System.out.println("Set Up New Event Negative Value Check");
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/loginBtn"))).click();
		  
		  wait.until(ExpectedConditions.
		  visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys("abubakarhussain517@gmail.com");
		  
		  wait.until(ExpectedConditions
		  .visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys("12345678");
		  
		  wait.until(ExpectedConditions
		  .visibilityOfElementLocated(By.className("android.widget.Button"))).click();
		  
		  MobileElement Dashboard=(MobileElement) wait.until(ExpectedConditions.
		  visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));
		  
		  Assert.assertEquals(Dashboard.getText(), "Events","You are not in the Event Selection Screen");
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/fab"))).click();
		 
		 MobileElement element =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/lblPopupTitle")));
		 
		 Assert.assertEquals(element.getText(), "Select Event Type:","Your are in Wrong Page"); 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnParty"))).click();
		 
		 MobileElement New_Event =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventTitleName")));
		 
		 Assert.assertEquals(New_Event.getText(), "Set up a New Weoto Party", "You are not in New Event Creation Screen");
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventTitleName"))).sendKeys(EventName);
		 
		 swipe();
		 
		 MobileElement description =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventDescription")));

		 
		 //Assert.assertEquals(description.getText(), "Event title here.","Your are in Wrong Page");
		 
		 Assert.assertNotEquals(description.getText(), "Event title here.", "You are in Wrong page. This testcase is failed");
		 
		Thread.sleep(3000);
		
		driver.closeApp();
	}
	
	@Test(dataProvider="New Event_Description Negative Values", dataProviderClass=ParameterByDataprovider.class)
	   public void Description_new_Event(String Description) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		  System.out.println("Set Up New Event Negative Value Check");
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/loginBtn"))).click();
		  
		  wait.until(ExpectedConditions.
		  visibilityOfElementLocated(By.id("com.weoto:id/txtUserName"))).sendKeys("abubakarhussain517@gmail.com");
		  
		  wait.until(ExpectedConditions
		  .visibilityOfElementLocated(By.id("com.weoto:id/txtPassword"))).sendKeys("12345678");
		  
		  wait.until(ExpectedConditions
		  .visibilityOfElementLocated(By.className("android.widget.Button"))).click();
		  
		  MobileElement Dashboard=(MobileElement) wait.until(ExpectedConditions.
		  visibilityOfElementLocated(By.id("com.weoto:id/toolbar_title")));
		  
		  Assert.assertEquals(Dashboard.getText(), "Events","You are not in the Event Selection Screen");
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/fab"))).click();
		 
		 MobileElement element =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/lblPopupTitle")));
		 
		 Assert.assertEquals(element.getText(), "Select Event Type:","Your are in Wrong Page"); 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnParty"))).click();
		 
		 MobileElement New_Event =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventTitleName")));
		 
		 Assert.assertEquals(New_Event.getText(), "Set up a New Weoto Party", "You are not in New Event Creation Screen");
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventTitleName"))).sendKeys("Aomata Testing");
		 
		 swipe();
		 
		 MobileElement description =(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventDescription")));

		 
		 //Assert.assertEquals(description.getText(), "Event title here.","Your are in Wrong Page");
		 
		 Assert.assertEquals(description.getText(), "Event title here.", "You are in Wrong page. This testcase is failed");
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/inputEventDescription"))).sendKeys(Description);
		 
		 driver.findElement(By.xpath("//*[@text='Time']")).click();
	        new TouchAction(driver).press(229, 720).waitAction(Duration.ofMillis(1089)).moveTo(245, 579).release().perform();
	        new TouchAction(driver).press(520, 708).waitAction(Duration.ofMillis(623)).moveTo(541, 600).release().perform();
	        new TouchAction(driver).press(375, 820).waitAction(Duration.ofMillis(888)).moveTo(362, 1127).release().perform();
	        driver.findElement(By.xpath("//*[@text='Set']")).click();

		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.weoto:id/btnTime"))).click();
		 
		 driver.findElement(By.xpath("//*[@text='4']")).click();

		 driver.FindElementByAccessibilityId(dateToPick.ToString("dd MMMM yyyy")).Click();

		//Here Negative Values for Data and Time Will be set
		
		
	}
	

	



