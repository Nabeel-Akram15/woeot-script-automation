package Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuDetail {

	AndroidDriver<AndroidElement> driver2;
	
	public MenuDetail(AndroidDriver<AndroidElement> driver) {
		this.driver2=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver),EventDetailPage.class);

		PageFactory.initElements(new AppiumFieldDecorator(driver2, Duration.ofSeconds(30)), this);
	}
	
	@AndroidFindBy (id = "com.weoto:id/navLblUserEmail")
	public MobileElement UserEmail;
}
