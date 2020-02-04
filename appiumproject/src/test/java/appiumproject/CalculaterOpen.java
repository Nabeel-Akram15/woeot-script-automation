package appiumproject;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculaterOpen {

static AppiumDriver<MobileElement> driver;
public static void main(String[] args) {
try{
openCalculator();
}
catch(Exception exp){
System.out.println(exp.getCause());
System.out.println(exp.getMessage());
exp.printStackTrace();
}


}

public static void openCalculator() throws Exception {

DesiredCapabilities cap=new DesiredCapabilities();
cap.setCapability("deviceName", "Samsung Galaxy S7 edge");
cap.setCapability("udid", "b274ce91");
cap.setCapability("platformName", "Android");
cap.setCapability("platformVersion", "8.0.0");

cap.setCapability("appPackage", "com.samsung.android.contacts");
cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

URL url=new URL(" http://127.0.0.1:4725/wd/hub");



driver= new AppiumDriver<MobileElement>(url,cap);

 MobileElement contact=driver.findElementById("Contacts Tab 2 of 3");
 MobileElement hassan=driver.findElementByXPath("	(//android.widget.TextView[@content-desc=\"Hassan Bhatti\"])[1]");
 
}

}