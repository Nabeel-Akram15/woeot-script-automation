package firstPackege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver= new FirefoxDriver();
//		String baseURl= "https://www.smartioapp.com/";
//		driver.get("baseURL");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
	}

}
