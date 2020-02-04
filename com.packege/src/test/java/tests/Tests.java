package tests;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import bsh.ParseException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;


     public class Tests {
	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		
	}
           public static void setup() {
		

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
           @Test
 	      public void EyeButtonEnableDiable() throws Exception
 	      {
 	    	  
 	 		 Thread.sleep(2000);
 	 	     System.out.println("You are in Eye-Butto Enable or Diable Function");
 	 	     Thread.sleep(3000);
 	 	     driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	 	     driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	 	     driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	 	     driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	 	     driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	 	     Thread.sleep(500);
 	 	     driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	 	     Thread.sleep(3000);
 	 	     driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	 	     Thread.sleep(3000);
 	 	     driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345");
 	 	     Thread.sleep(3000);
 	 	     System.out.println("I am Enabling Eye Button");
 	 	     driver.findElement(By.id("com.weoto:id/btnShowPassword")).click();
 	 	     Thread.sleep(2000);
 	 	     System.out.println("I am Disabling Eye Button");
 	 	     driver.findElement(By.id("com.weoto:id/btnShowPassword")).click();
 	 	     Thread.sleep(2000);
 	 	     driver.closeApp();
 	 	     System.out.println("Its Complete");
 	 		 
 	      }
 	      @Test
 	      public void ForgotPassword()
 	      {
 	    	  
 	      }
 	      
 	     @Test (priority=3 ,dataProvider="Name Negative Values Check", dataProviderClass=ParameterByDataprovider.class)
 	 	public void BlankFUllName(String FullName) throws Exception
 	 	{Thread.sleep(5000);
 		   // Allowing  FOr SignUp
 				System.out.println("You are in FullName Exceeding length function");
 				driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 			     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 			      
 		   		driver.findElement(By.xpath("//*[@text='Sign up']")).click();
 		   		Thread.sleep(2000);
 		   		// Entering Information for Sign up
 		   		
 		   		driver.findElement(By.id("com.weoto:id/txtName")).sendKeys(FullName);
 		   		driver.findElement(By.className("android.widget.Button")).click();
 		   		Thread.sleep(2000);
 		 	   	driver.findElement(By.id("com.weoto:id/leftSideButton")).click();
 		   		driver.closeApp();
 		   		 System.out.println("Test for FullName Maximum length is Pass");
 	 	}
 	    @Test 
 		public void LessPasswordLength() throws Exception
 		{
 			Thread.sleep(5000);
 			System.out.println("You are in Less Password Length Function");
 			//Its Allowing Permission for different things
 			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 		     driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
 		      // Allowing  FOr SignUp
 		      
 	   // Allowing  FOr SignUp
 	      
 		      driver.findElement(By.xpath("//*[@text='Sign up']")).click();
 		   		Thread.sleep(2000);
 		   		// Entering Information for Sign up
 		   		
 		   		driver.findElement(By.id("com.weoto:id/txtName")).sendKeys("Nabeel");
 		   		driver.findElement(By.className("android.widget.Button")).click();
 		   		Thread.sleep(2000);
 		   		driver.findElement(By.id("com.weoto:id/txtEmail")).sendKeys("jhijfrihjd@yahoo.com");
 		   		driver.findElement(By.className("android.widget.Button")).click();
 		   		Thread.sleep(2000);
 		   		driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("he");
 		   		Thread.sleep(2000);
 		   		driver.findElement(By.className("android.widget.Button")).click();
 		   		Thread.sleep(2000);
 		 	   	driver.findElement(By.id("com.weoto:id/leftSideButton")).click();
 		   		Thread.sleep(2000);
 		   		driver.closeApp();
 		   		System.out.println("LessPasswordLength function is completed");
 		   		
 		}
 	   @Test 
 		public void Edit_PAssword() throws Exception
 		{
 			Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	        Thread.sleep(500);
 	  	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.className("android.widget.Button")).click();
 	  	    Thread.sleep(2000);
 	  	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering old Password");
 			driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345");
 			Thread.sleep(2000);
 			System.out.println("Old Password Eye Button is Enabling");
 			driver.findElement(By.id("com.weoto:id/btnShowNewPassword")).click();
 			Thread.sleep(2000);
 			System.out.println("Old Password Eye Button is Disabling");
 			driver.findElement(By.id("com.weoto:id/btnShowNewPassword")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering new Password");
 			driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys("NabeelAkram");
 			Thread.sleep(2000);
 			System.out.println("New Password Eye button enabling");
 			driver.findElement(By.id("com.weoto:id/btnShowConfirmPassword")).click();
 			Thread.sleep(2000);
 			System.out.println("New Password Eye button Disabling");
 			driver.findElement(By.id("com.weoto:id/btnShowConfirmPassword")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			driver.closeApp();
 			System.out.println("Password Eye buttons and Password change are comppletd");
 			
 		}
 		@Test
 		public void NoValueChangePassword() throws Exception
 		{
 			System.out.println("Your are in No Value Enter in Password edit function");
 			Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	        Thread.sleep(500);
 	  	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.className("android.widget.Button")).click();
 	  	    Thread.sleep(2000);
 	  	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			//Here New PopUp element will be placed. 
 			driver.closeApp();
 			System.out.println("No value enter function is completed");
 			
 		}
 		@Test
 		public void InvalidOldPassword() throws Exception {
 			
 			Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	        driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	        Thread.sleep(500);
 	  	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	  	    Thread.sleep(3000);
 	  	    driver.findElement(By.className("android.widget.Button")).click();
 	  	    Thread.sleep(2000);
 	  	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering old Password");
 			driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("abcdef");
 			Thread.sleep(2000);
 			System.out.println("Entering new Password");
 			driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys("NabeelAkram");
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			driver.closeApp();
 			System.out.println("Password Eye buttons and Password change are comppletd");
 			
 		}
 		@Test
 		 public void InavalidNewPassword() throws Exception
 		 {
 			Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	       Thread.sleep(500);
 	 	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.className("android.widget.Button")).click();
 	 	    Thread.sleep(2000);
 	 	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering old Password");
 			driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345");
 			Thread.sleep(2000);
 			System.out.println("Entering new Blank Password");
 			driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys("  ");
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			driver.closeApp();
 			System.out.println("Password Eye buttons and Password change are comppletd");
 			
 			
 		 }
 		@Test
 		public void BothOldNewWrong() throws Exception
 		{
 			Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	       Thread.sleep(500);
 	 	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.className("android.widget.Button")).click();
 	 	    Thread.sleep(2000);
 	 	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering old Password");
 			driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("abcdef");
 			Thread.sleep(2000);
 			System.out.println("Entering new Blank Password");
 			driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys("  ");
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			driver.closeApp();
 			System.out.println("Password Eye buttons and Password change are comppletd");
 			
 			
 		}
 		@Test
 	    public void BothEyeButtonEnable() throws Exception
 	    {
 	   	Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	       Thread.sleep(500);
 	 	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.className("android.widget.Button")).click();
 	 	    Thread.sleep(2000);
 	 	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering old Password");
 			driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345");
 			Thread.sleep(2000);
 			System.out.println("Old Password Eye Button is Enabling");
 			driver.findElement(By.id("com.weoto:id/btnShowNewPassword")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering new Password");
 			driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys("NabeelAkram");
 			Thread.sleep(2000);
 			System.out.println("New Password Eye button enabling");
 			driver.findElement(By.id("com.weoto:id/btnShowConfirmPassword")).click();
 			Thread.sleep(2000);
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			driver.closeApp();
 			System.out.println("Password Eye buttons and Password change are comppletd");
 		   
 	    }
 		@Test
 	    public void OneEyeButtonEnable() throws Exception
 	    {
 	   	Thread.sleep(2000);
 			System.out.println("You are in Positive Login Test Case");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
 	       driver.findElement(By.xpath("//*[@text='ALLOW' ]")).click();
 	       Thread.sleep(500);
 	 	    driver.findElement(By.id("com.weoto:id/loginBtn")).click();
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtUserName")).sendKeys("abubakarhussain517@gmail.com");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345678");
 	 	    Thread.sleep(3000);
 	 	    driver.findElement(By.className("android.widget.Button")).click();
 	 	    Thread.sleep(2000);
 	 	    driver.findElement(By.className("android.widget.ImageButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.id("com.weoto:id/menuItemTitle")).click();
 			Thread.sleep(2000);
 			System.out.println("You Are In Password change function");
 			driver.findElement(By.id("com.weoto:id/editPasswordImg")).click();
 			Thread.sleep(2000);
 			System.out.println("Entering old Password");
 			driver.findElement(By.id("com.weoto:id/txtPassword")).sendKeys("12345");
 			Thread.sleep(2000);
 			System.out.println("Entering new Password");
 			driver.findElement(By.id("com.weoto:id/txtConfirmPassword")).sendKeys("NabeelAkram");
 			Thread.sleep(2000);
 			System.out.println("New Password Eye button enabling");
 			driver.findElement(By.id("com.weoto:id/btnShowConfirmPassword")).click();
 			Thread.sleep(2000);
 			Thread.sleep(2000);
 			driver.findElement(By.className("android.widget.Button")).click();
 			Thread.sleep(2000);
 			driver.closeApp();
 			System.out.println("Password Eye buttons and Password change are comppletd");
 		   
 	    }
 		List <MobileElement> SavedEvents = driver.findElements(By.className("android.widget.RelativeLayout"));
	       
	       for (int i1= 0; i1 < SavedEvents.size(); i1++) {
	    	   System.out.println(SavedEvents.get(i1).getAttribute("name"));
	    	   System.out.println("Total Events are");
	    	   
	    	   //SavedEvents.get(i1).getAttribute("name");

 		
         
	    	   public void selectCustomer(String customer) {
	    		    Dimension size = driver.manage().window().getSize();
	    		    int startX = size.width / 2;
	    		    int startY = (int) (size.height * .8);
	    		    int endY = (int) (size.height * .2);

	    		    if (platform.equalsIgnoreCase("ios")) {
	    		        while(!driver.findElementById(customer).isDisplayed()) {
	    		            driver.swipe(startX, startY, startX, endY, 100);
	    		        }
	    		        driver.findElementById(customer).click();
	    		    }
	    		}
	    	   https://discuss.appium.io/t/i-want-to-know-a-genric-method-for-scrolling-in-appium-java/23823/8
         
	    		   public static void scrollTo(String direction, int times) throws InterruptedException {
	    			Thread.sleep(1000);
	    			if (direction.equals(“down”)) {
	    			Dimension dim = driver.manage().window().getSize();
	    			int width = dim.getWidth() / 2;
	    			for (int i = 0; i < times; i++) {
	    			int startY = (int) (dim.getHeight() * 0.7);
	    			int endY = (int) (dim.getHeight() * 0.5);
	    			new TouchAction(driver).press(point(width, startY)).waitAction(waitOptions(Duration.ofSeconds(1)))
	    			.moveTo(point(width, endY)).release().perform();

	    			Dimension dim = driver.manage().window().getSize();
	    			int width = dim.getWidth() / 2;
	    			for (int i = 0; i < 5; i++) {
	    			int startY = (int) (dim.getHeight() * 0.7);
	    			int endY = (int) (dim.getHeight() * 0.5);
	    			TouchAction touchAction = new TouchAction(driver);
	    			touchAction.tap(PointOption.point(1280, 1013)).perform();
	    			action.
	    			action.moveTo(10, 100);
	    			action.release();
	    			action.perform();
	    					}

	    				}
	    		}
	    			String datecheckcmp(String fromDateFormat, String toDateFormat,
	    					String fromdate, String todate)throws ParseException, java.text.ParseException
	    					   {
	    					      String CheckFormat = "dd-MMM-yyyy";
	    					      String dateStringFrom;
	    					      String dateStringTo;
	    					      Date DF = new Date();
	    					      Date DT = new Date();
	    					      int flagtodate=0;
	    					      int flagfromdate=0;
	    					      try
	    					      {
	    					         //DateFormatdf = DateFormat.getDateInstance(DateFormat.SHORT);
	    					         DateFormat FromDF = new SimpleDateFormat(fromDateFormat);
	    					         FromDF.setLenient(false);  // this is important!
	    					         Date FromDate = FromDF.parse(fromdate);
	    					         dateStringFrom = new SimpleDateFormat(CheckFormat).format(FromDate);
	    					         DateFormat FromDF1 = new SimpleDateFormat(CheckFormat);
	    					         DF=FromDF1.parse(dateStringFrom);
	    					         System.out.println("Date is ok = " + dateStringFrom);
	    					      }
	    					      catch (IllegalArgumentException e)
	    					      {
	    					         flagfromdate = 1;
	    					      }
	    					      try
	    					      {
	    					         //DateFormatdf = DateFormat.getDateInstance(DateFormat.SHORT);
	    					         DateFormat ToDF = new SimpleDateFormat(toDateFormat);
	    					         ToDF.setLenient(false); // this is important!
	    					         Date ToDate = ToDF.parse(todate);
	    					         dateStringTo = new SimpleDateFormat(CheckFormat).format(ToDate);
	    					         DateFormat ToDF1 = new SimpleDateFormat(CheckFormat);
	    					         DT=ToDF1.parse(dateStringTo);
	    					         System.out.println("Date is ok = " + dateStringTo); 
	    					      }
	    					      catch (IllegalArgumentException e)
	    					      {
	    					         flagtodate=1;
	    					      }
	    					      if(flagfromdate == 0 &&flagtodate==0)
	    					      {
	    					         if(DF.equals(DT))
	    					         {
	    					    	    // if the date is same
	    					            return "FromDate and ToDate are same"; 
	    					         }
	    					         else if(DF.before(DT))
	    					         {
	    					    	    //if the from date is before the to date
	    					            return "FromDate is less than ToDate"; 
	    					         }
	    					         else
	    					         {
	    					            // if the date from is after the to date
	    					           return "FromDate is greater than the ToDate"; 
	    					         }
	    					      }
	    					   return "Error";
	    					   }
         
         { "nabeelakram15@yahoo.com", "123456789"},
         { "na405762@gmail.com", "123456789"},
}