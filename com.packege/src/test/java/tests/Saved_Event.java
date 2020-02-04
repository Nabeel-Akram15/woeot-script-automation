package tests;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import javax.swing.Scrollable;

import org.apache.tools.ant.taskdefs.Touch;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Saved_Event {
	static AppiumDriver<MobileElement> driver;

	@BeforeMethod
	public void Verification() {

		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

			cap.setCapability(MobileCapabilityType.UDID, "004659a656174315");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S7 edge");

			// This is App related information
			// cap.setCapability(MobileCapabilityType.APP,"/Internal
			// storage/Download/Weoto-1-(1.0).apk");
			cap.setCapability("appPackage", "com.weoto");
			cap.setCapability("appActivity", ".activities.SplashActivity");

			URL url = new URL(" http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);

			System.out.println("Application started...");
			Thread.sleep(2000);

		} catch (Exception exp) {
			System.out.println("Exception cause is" + exp.getCause());
			System.out.println("Exception message  is" + exp.getMessage());
			exp.getStackTrace();
		}

	}
	public enum DIRECTION {
	    DOWN, UP, LEFT, RIGHT;
	}
	
	public static void swipe(MobileDriver driver, DIRECTION direction, long duration) {
	    Dimension size = driver.manage().window().getSize();
	    System.out.println(size);

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (direction) {
	        case RIGHT:
	            startY = (int) (size.height / 6);
	            System.out.println(startY);
	            startX = (int) (size.width * 0.90);
	            System.out.println(startX);
	            endX = (int) (size.width * 0.05);
	            System.out.println(endX);
	            new TouchAction(driver)
	            .longPress(PointOption.point(startX,startY))
	      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
	                    .moveTo(PointOption.point(endX,startY))
	                    .release()
	                    .perform();
	            break;

	        case LEFT:
	            startY = (int) (size.height / 4);
	            System.out.println(startY);
	            startX = (int) (size.width * 0.10);
	            System.out.println(startX);
	            endX = (int) (size.width * 0.95);
	            System.out.println(endX);
	            new TouchAction(driver)
	            .longPress(PointOption.point(endX,startY))
	      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
	                    .moveTo(PointOption.point(startX,startY))
	                    .release()
	                    .perform();

	            break;

	        case UP:
	            endY = (int) (size.height * 0.50);
	            System.out.println(endY);
	            startY = (int) (size.height * 0.20);
	            System.out.println(startY);
	            startX = (size.width / 2);
	            System.out.println(startX);
	            new TouchAction(driver)
	            .longPress(PointOption.point(startX,startY))
	      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
	                    .moveTo(PointOption.point(startX,endY))
	                    .release()
	                    .perform();
	            break;


	        case DOWN:
	            startY = (int) (size.height * 0.70);
	            System.out.println(startY);
	            endY = (int) (size.height * 0.30);
	            System.out.println(endY);
	            startX = (size.width / 2);
	            System.out.println(startX);
	            new TouchAction(driver)
	            .longPress(PointOption.point(startX,startY))
	      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
	                    .moveTo(PointOption.point(startX,endY))
	                    .release()
	                    .perform();

	            break;

	    }
	}

	@Test
	public void valid() throws Exception { 
		Thread.sleep(2000);
		
		 System.out.println("You are in Saved Event function");
//		 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

				Thread.sleep(2000);
				System.out.println("Your are in Login Negative Value function");
				System.out.println("Allowing Permission");
		  	   
		  	  
		        Thread.sleep(2000);
		        System.out.println("Moving to Login Screen");
		  	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
		  	    Thread.sleep(3000);
		  	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
		  	    Thread.sleep(3000); 
		  	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
		  	    Thread.sleep(3000);
		  	    driver.findElement(By.className("android.widget.Button")).click();
		  	    Thread.sleep(2000);
		   	    System.out.println("Its Complete");
		   	  Thread.sleep(4000);
		   	//driver.findElement(By.xpath("//*[@id='view' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='on my mind']]]]]")).click();

		   	    //driver.findElement(By.id("com.weoto:id/savedView")).get(1).click();
//		       Point d= driver.findElement(By.id("com.weoto:id/savedView")).
//		    		   findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).getLocation();
////		   	   //System.out.println(d);
//		   	   int startScroll= (int) (d.getHeight()*.30);
//		   	   System.out.println(startScroll);
//		   	   int endScroll=(int) (d.getHeight()*0.70);
//		   	   System.out.println(endScroll);
//		   	   int Width =(int) (d.getWidth()/2);
//		   	System.out.println(Width);
//		   	   
		   	  for(int i=0;i<4;i++) {
		   		  
		   		  if(i<2)
		   		  {
		   	   Dimension d =driver.manage().window().getSize();
		   	System.out.println("Size "+ d );  
		   	   int startPoint= (int) (d.getHeight()*0.70);
		   	System.out.println("StartPoint "+ startPoint );
		   	int endPoint= (int) (d.getHeight()*0.50);
		   	System.out.println("EndPoint "+ endPoint );
		   	int width= (int)(d.getWidth()*0.50);
		   	System.out.println("Width "+ startPoint );
		   	
		   	TouchAction action=new TouchAction(driver);
            action.press(PointOption.point(width,startPoint))
      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                    .moveTo(PointOption.point(width,(int)(endPoint)))
                    .release()
                    .perform();
              System.out.println("For loop running "+ i +" Times");
              Thread.sleep(2000);
            }
		   		  else
		   		  {
		   			Dimension d =driver.manage().window().getSize();
		   			System.out.println("Size "+ d );  
				   	   int startPoint= (int) (d.getHeight()*0.70);
				   	System.out.println("StartPoint "+ startPoint );
				   	int endPoint= (int) (d.getHeight()*0.50);
				   	System.out.println("EndPoint "+ endPoint );
				   	int width= (int)(d.getWidth()*0.50);
				   	System.out.println("Width "+ startPoint );
				   	
				   	TouchAction action=new TouchAction(driver);
		            action.press(PointOption.point(width,startPoint))
		      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		                    .moveTo(PointOption.point(width,(int)(endPoint)))
		                    .release()
		                    .perform();
		            System.out.println("For loop running "+ i +" Times");
		            Thread.sleep(2000);
		   		  }
		   	  }
//            }
//		   	TouchAction action=new TouchAction(driver);
//            action.press(PointOption.point(712,1525))
//      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
//                    .moveTo(PointOption.point(800,865))
//                    .release()
//                    .perform();
//            
		   	   
		   	   
		   	    
////		   	   Point p2= driver.findElement(By.id("com.weoto:id/sevedEventTextView")).getLocation();
////		   	    System.out.println(p2);
////		   	    p2.getY();
//		   	    
		     	Point p1= driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).getLocation();
////		    Dimension d=  	  driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).getSize();
////		    Point p3= driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).getLocation();
////		    Dimension d1=  	  driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).getSize();
//	       System.out.println(p1.getX());
//           System.out.println(p1.getY());
////		       
////		     	  d.getHeight();
////		     	  d.getWidth();
////		     	  Thread.sleep(2000);
//		     	  
//		     	 
//		            new TouchAction(driver)
//		            .longPress(PointOption.point(p1.getX()+500,p1.getY()-700))
//		      	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
//		                    .moveTo(PointOption.point(p1.getX()+500,p1.getY()-700))
//		                    .release()
//		                    .perform();
//		            
////		     	  
////		     TouchAction action =new TouchAction(driver);
////		     action.longPress(PointOption.point(p3.getX(),p3.getY())
////		     .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
////		     .moveTo(PointOption.point(p1.getX(),p1.getY()))
////		     .release().perform();
		   				
	}
		    		    	   
	}  


