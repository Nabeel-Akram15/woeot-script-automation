import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
          WebDriver driver;
          
          System.setProperty("webdriver.gecko.driver",
     "C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
          
          driver= new FirefoxDriver();
          
          driver.get("http://demo.guru99.com/test/guru99home/");
          
          JavascriptExecutor js = (JavascriptExecutor) driver;

          driver.manage().window().maximize();
          
          js.executeScript("window.scrollBy(0,2000)");
          
          Thread.sleep(3000);
          
          driver.get("http://demo.guru99.com/test/guru99home/");
          
          WebElement Element = driver.findElement(By.linkText("Linux"));

          //This will scroll the page till the element is found		
          js.executeScript("arguments[0].scrollIntoView();", Element);
          
          Thread.sleep(3000);
          
          driver.get("http://demo.guru99.com/test/guru99home/");

          //This will scroll the web page till end.		
          js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
          
          Thread.sleep(3000);
          
          WebElement Element1 = driver.findElement(By.linkText("VBScript"));

          //This will scroll the page Horizontally till the element is found		
          js.executeScript("arguments[0].scrollIntoView();", Element1);
          
          
	}

}
