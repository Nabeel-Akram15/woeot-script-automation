import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Handling pop-Up or alert message using Selenium.
		
		WebDriver driver ;
		System.out.println("launching firefox browser"); 
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		  driver = new FirefoxDriver();
		 driver.get("http://demo.guru99.com/test/delete_customer.php ");
		 WebElement CustomerID=driver.findElement(By.name("cusid"));
		 CustomerID.sendKeys("53920");
		 WebElement Submit=driver.findElement(By.name("submit"));
		 Submit.submit();
		 Alert alert=driver.switchTo().alert();
		 String AlertMessage=driver.switchTo().alert().getText();
		 System.out.println(AlertMessage);
		 Thread.sleep(5000);
		 alert.accept();
		 
		 //Handling Multiple Window Using Selenium
		 
		 System.out.println("Handling Multiple window Using Alert");
		 driver.get("http://demo.guru99.com/popup.php");
		 WebElement ClickLink=driver.findElement(By.linkText("Click Here"));
		 Thread.sleep(4000, 100);
		 ClickLink.click();
		 Thread.sleep(4000, 555);
		 String MainWindow=driver.getWindowHandle();	
 		
	     // To handle all new opened window.				
	          Set<String> s1=driver.getWindowHandles();		
	          Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(By.name("emailid"))
	                    .sendKeys("gaurav.3n@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);		 
		 
		 // Thread.sleep(3000);
	}

}
