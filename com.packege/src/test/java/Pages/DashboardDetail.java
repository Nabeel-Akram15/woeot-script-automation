package Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DashboardDetail {

	AndroidDriver<AndroidElement> driver2;
	// Constructor
	public DashboardDetail(AndroidDriver<AndroidElement> driver) {
		this.driver2=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver),EventDetailPage.class);

		PageFactory.initElements(new AppiumFieldDecorator(driver2, Duration.ofSeconds(30)), this);
	}
	
	@AndroidFindBy (accessibility  = "Navigate up")
	public MobileElement dashboard_Menue_Button;

	@AndroidFindBy (id = "com.weoto:id/toolbar_title")
	public MobileElement Dashboardtile;

	@AndroidFindBy (id = "com.weoto:id/search_button")
	public MobileElement dashboardSearch;

	@AndroidFindBy (id = "	com.weoto:id/upcomingEventTextView")
	public MobileElement dashboard_UpcomingEvents;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/"
			+ "android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement dashboard_UpcomingfirstElement;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/"
			+ "android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement dashboard_UpcomingSecondElements;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/"
			+ "android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement dashboard_UpcomingthirdElement;

	@AndroidFindBy (id = "com.weoto:id/sevedEventTextView")
	public MobileElement dashboard_SavedEvents;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
			+ "android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
	public MobileElement dashboard_SavedEventFirstElement;


	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
			+ "android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
	public MobileElement dashboard_SavedEventSecondElement;

	@AndroidFindBy (id = "com.weoto:id/fab")
	public MobileElement dashboard_PlusButton;

	//User Action on Dashboard Screens

	public void clickMenu()
	{
		dashboard_Menue_Button.click();
	}

	public String dashboard_getTitle() {
		// TODO Auto-generated method stub
		return Dashboardtile.getText();
	}


	public void dashboard_SearchbuttonClick() {
		dashboardSearch.click();
	}


	public void dashboard_Upcomingfirstclick() {
		dashboard_UpcomingfirstElement.click();
	}


	public void dashboard_Upcomingthirdclick() {
		dashboard_UpcomingthirdElement.click();
	}


	public void dashboard_savedEventsfirstclick() {
		dashboard_SavedEventFirstElement.click();
	}


	public void dashboard_savedEventssecondclick() {
		dashboard_SavedEventSecondElement.click();
	}


	public void dashboard_plusButtonclick() {
		dashboard_PlusButton.click();
	}
	
}