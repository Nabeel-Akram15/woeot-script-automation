package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDrivenFramework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		Cell cell;
		
		System.setProperty("webdriver.gecko.driver",
				
  "C:\\Users\\dell\\Downloads\\Compressed\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		
	    driver=new FirefoxDriver();  
	    
       driver.get("https://www.facebook.com/");

		String path = "D:\\Book1.xlsx";
		  
		FileInputStream file= new FileInputStream(path);
		
		  Workbook workbook = new XSSFWorkbook(file);
		  
		  Sheet sheet =workbook.getSheetAt(0);
		  
		  int Rownumber=sheet.getLastRowNum();
		  
		  System.out.println("Total Rows "+ Rownumber);
		  
		  for(int i=1; i<=Rownumber;i++)
		  {
			 
		  cell= sheet.getRow(i).getCell(1);
		  
       driver.findElement(By.name("email")).sendKeys(cell.getStringCellValue());
   
		cell=sheet.getRow(i).getCell(2);
		
       driver.findElement(By.name("pass")).sendKeys(cell.getStringCellValue());
       
       cell=sheet.getRow(i).getCell(3);
       
       driver.findElement(By.name("firstname")).sendKeys(cell.getStringCellValue());
       
       cell=sheet.getRow(i).getCell(4);
       
       driver.findElement(By.name("lastname")).sendKeys(cell.getStringCellValue());
       
       cell=sheet.getRow(i).getCell(5);
       
       driver.findElement(By.name("reg_email__")).sendKeys(cell.getStringCellValue());
       
       cell=sheet.getRow(i).getCell(6);
       
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys(cell.getStringCellValue());
       
       cell=sheet.getRow(i).getCell(7);
       
       driver.findElement(By.name("reg_passwd__")).sendKeys(cell.getStringCellValue());
       
       if(i>1 && i<Rownumber)
       {
    	   driver.findElement(By.name("email")).clear();
    	   
       }
       }
       
       
			  }
			  
	
}



			       