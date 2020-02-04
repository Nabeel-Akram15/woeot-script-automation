package multiWindowHandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
	  System.setProperty("webdriver.gecko.driver",
      "C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
	       
	       driver= new FirefoxDriver();
	      
	       driver.get("http://seleniumpractise.blogspot.com/");
	       
	       String Parent=driver.getWindowHandle();
		      
		    System.out.print("Parent Window ID is " + Parent);
	       
		    
	       WebElement Link1=driver.findElement(By.name("link1"));
	       
	       Link1.click();
	       
	       Set<String> TotalWindow= driver.getWindowHandles();
	       
	       int count= TotalWindow.size();
	       
	       System.out.println("Total Open Windows are "+ count);
	       
	       for(String child:TotalWindow)
	       {
	    	   if(!child.equals(Parent));
	    	   {
	    		   driver.switchTo().window(child);
	    		   
	    		   Thread.sleep(1000);
	    		   
	    		   System.out.println("This is child window title" + driver.getTitle());
	    		   
	    		   driver.findElement(By.name("q")).sendKeys("Facebook login page");
	    		   
	    		   Thread.sleep(5000);
	    		   
	    		   driver.quit();
	    		   
	    	   }
	    	   driver.switchTo().window(Parent);
	    	   
	    	   System.out.println("This is Parent window title "+ driver.getTitle());
	       }
	       
	       

	}

}
