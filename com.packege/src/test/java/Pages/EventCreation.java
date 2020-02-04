package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventCreation {
	
	AndroidDriver<AndroidElement> driver2;
	// Constructor
	public EventCreation(AndroidDriver<AndroidElement> driver) {
		this.driver2=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver),EventDetailPage.class);

		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	//EventCreation 1 Page
	
	@AndroidFindBy (id= "com.weoto:id/lblPopupTitle")
	public MobileElement EventCreate_Description;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/"
			+ "android.widget.LinearLayout/android.view.ViewGroup/android.view.View")
	public MobileElement EventCreate_Underline;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
	public MobileElement EventCreate_1_DefaultPicture;
	
	@AndroidFindBy (id= "com.weoto:id/btnParty")
	public MobileElement EventCreate_1_PartyButton;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
	public MobileElement EventCreate_1_or;
	
	@AndroidFindBy (id= "com.weoto:id/btnMoment")
	public MobileElement EventCreate_1_MomentButton;
	
	//EventCreation->Party 1 Screen
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[2]/android.widget.TextView")
	public MobileElement EventCreate_2_Description;
	
	//EventCreation ->Party 2 Screen
	
	@AndroidFindBy (id= "com.weoto:id/view1")
	public MobileElement EventCreate_3_EventPicture;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	public MobileElement EventCreate_3_EventDescriptiontitle;
	
	@AndroidFindBy (id= "com.weoto:id/inputEventDescription")
	public MobileElement EventCreate_3_Eventitle;
	
	@AndroidFindBy (id= "com.weoto:id/lblDateTime")
	public MobileElement EventCreate_3_DateandTime;
	
	@AndroidFindBy (id= "com.weoto:id/btnDate")
	public MobileElement EventCreate_3_DateButton;
	
	@AndroidFindBy (id= "com.weoto:id/btnTime")
	public MobileElement EventCreate_3_TimeButton;
	
	//EventCreation ->Party 3 Screen
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public MobileElement EventCreate_4_Description;
	
	@AndroidFindBy (id= "com.weoto:id/search_src_text")
	public MobileElement EventCreate_4_SearchBox;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.GridView/"
			+ "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement EventCreate_4_FirstNumber;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.LinearLayout[2]/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement EventCreate_4_SecondNumber;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.LinearLayout[3]/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement EventCreate_4_ThirdNumber;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.GridView/"
			+ "android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement EventCreate_4_FourthNumber;
	
	@AndroidFindBy (id= "com.weoto:id/inviteBtn")
	public MobileElement EventCreate_4_InviteButton;
	
	
	

}
