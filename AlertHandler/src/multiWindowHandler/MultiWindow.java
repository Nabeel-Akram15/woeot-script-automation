package multiWindowHandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver;
       System.setProperty("webdriver.gecko.driver",
  "C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
       
       driver= new FirefoxDriver();
      
       driver.get("http://seleniumpractise.blogspot.com/");
       
       String ParentWindow=driver.getWindowHandle();
       
       System.out.println("Parent widnow ID"+ParentWindow);
       
       WebElement ClickLinkNewTab=driver.findElement(By.name("link1"));
       
       ClickLinkNewTab.click();
       
       Set<String> AllWindowID=driver.getWindowHandles();
       
       int count=AllWindowID.size();
       
       System.out.println("Total Windows are "+count);
       
       for(String child:AllWindowID )
       {
    	   if(!ParentWindow.equalsIgnoreCase(child))
    	   {
    		   driver.switchTo().window(child);
    		 WebElement SearchEngine= driver.findElement(By.name("q"));
    		 SearchEngine.sendKeys("Selenium Driver");
    		   Thread.sleep(5000);
    		   driver.quit();
    	   }
    	   driver.switchTo().window("ParentWindow");
    	   System.out.println("This is parent window Title "+driver.getTitle());
    	   
    	   
       }
       
	}

}
