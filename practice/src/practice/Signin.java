package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver ;
		System.out.println("launching firefox browser"); 
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		  driver = new FirefoxDriver();
		 driver.get("https://www.smartioapp.com/free-signup.html");
		 // Thread.sleep(3000);
		
		 WebElement firstname= driver.findElement(By.id("f_s_firstname"));
		  firstname.sendKeys("Nabeel");
		  
		  WebElement lastname=driver.findElement(By.id("f_s_lastname"));
		  lastname.sendKeys("MuhammadAkram");
		  
		  WebElement CompanyName=driver.findElement(By.id("f_s_company_name"));
		 CompanyName.sendKeys("AomataLLC");
		 
		 WebElement CompanayEmail=driver.findElement(By.id("f_s_comp_email"));
		 CompanayEmail.sendKeys("nabeel.akram@aomatatech.com");
		 
		 //Select DropDown=driver.findElement(By.)
		 
	     //WebElement country =driver.findElement(By.className("flag-dropdown"));
	     //country.sendKeys("Pakistan (‫پاکستان‬‎): +92");
	     
		 WebElement CountryNumber= driver.findElement(By.id("f_s_Contact_number"));
		 CountryNumber.sendKeys("+92 3234425219");
		 
		 WebElement CompanyWebsite=driver.findElement(By.id("f_s_company_web"));
		 CompanyWebsite.sendKeys("https://www.smartioapp.com");
		 
		 WebElement Create=driver.findElement(By.id("buttonSubmit"));
		 Create.click();
		  //driver.quit();
	}

}
