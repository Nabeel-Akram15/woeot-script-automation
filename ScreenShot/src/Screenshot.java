import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
 
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		 System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		 
		 driver=new FirefoxDriver();
		 
		 driver.get("https://www.google.com");
		 
		 ScreenShot(driver,"c://test.png");
		 
	}

	private static void ScreenShot(WebDriver driver, String Filepath) {
		// TODO Auto-generated method stub
		TakesScreenshot screen=((TakesScreenshot)driver);
		
		File SrcFile=screen.getScreenshotAs(OutputType.FILE);

		//Move image to new destination
		File DestFile=new File(Filepath);

		//Copy file at destination location
		//FileUtils.copyFile(SrcFile, DestFile);
		
	}

}
