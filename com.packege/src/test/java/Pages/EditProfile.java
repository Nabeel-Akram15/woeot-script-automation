package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditProfile {

	AndroidDriver<AndroidElement> driver2;
	// Constructor
	public EditProfile(AndroidDriver<AndroidElement> driver) {
		this.driver2=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver),EventDetailPage.class);

		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy (id = "com.weoto:id/btnBack")
	public MobileElement dashboard_EditProfile_BackButton;
	
	@AndroidFindBy (id = "com.weoto:id/lblTitle")
	public MobileElement dashboard_EditProfile_title;
	
	@AndroidFindBy (xpath  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/"
			+ "android.widget.RelativeLayout/android.widget.TextView")
	public MobileElement dashboard_Menue_EditProfileButton;

	
	@AndroidFindBy (id = "com.weoto:id/userProfileIm")
	public MobileElement dashboard_EditProfile_Picture;
	
	@AndroidFindBy (id = "com.weoto:id/lblUserName")
	public MobileElement dashboard_EditProfile_UserName;
	
	@AndroidFindBy (id = "com.weoto:id/lblUserEmailAddress")
	public MobileElement dashboard_EditProfile_Email;
	
	@AndroidFindBy (id = "com.weoto:id/tltFriendlyName")
	public MobileElement dashboard_EditProfile_NameDescription;
	
	@AndroidFindBy (id = "com.weoto:id/editNameImg")
	public MobileElement dashboard_EditProfile_NameEditButton;
	
	@AndroidFindBy (id = "com.weoto:id/lblFriendlyName")
	public MobileElement dashboard_EditProfile_Name;
	
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/"
			+ "android.widget.LinearLayout[2]/android.widget.TextView")
	public MobileElement dashboard_EditProfile_PasswordDescription;
	
	@AndroidFindBy (id = "com.weoto:id/editPasswordImg")
	public MobileElement dashboard_EditProfile_PasswordEditButton;
	
	@AndroidFindBy (id = "com.weoto:id/lblPassword")
	public MobileElement dashboard_EditProfile_Password;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/"
			+ "android.widget.LinearLayout[3]/android.widget.TextView")
	public MobileElement dashboard_EditProfile_NumberDescription;
	
	@AndroidFindBy (id = "com.weoto:id/editPhoneNumberImg")
	public MobileElement dashboard_EditProfile_NumberEditButton;
	
	@AndroidFindBy (id = "com.weoto:id/lblPhoneNumber")
	public MobileElement dashboard_EditProfile_Number;
	

	//Password Edit Screen Locator
	
	@AndroidFindBy (id = "com.weoto:id/viewCharacterResetPassword")
	public MobileElement dashboard_EditProfile_Password_DefaultPicture;
	
	@AndroidFindBy (id = "com.weoto:id/lblPassword")
	public MobileElement dashboard_EditProfile_Password_CurrentDescription;
	
	@AndroidFindBy (id = "com.weoto:id/txtPassword")
	public MobileElement dashboard_EditProfile_Password_Password;
	
	@AndroidFindBy (id = "com.weoto:id/btnShowNewPassword")
	public MobileElement dashboard_EditProfile_Password_CurrentPasswordEye;
	
	@AndroidFindBy (id = "com.weoto:id/lblPasswordConfirm")
	public MobileElement dashboard_EditProfile_Password_NewPasswordDescription;
	
	@AndroidFindBy (id = "com.weoto:id/txtConfirmPassword")
	public MobileElement dashboard_EditProfile_Password_NewPassword;
	
	@AndroidFindBy (id = "com.weoto:id/btnShowConfirmPassword")
	public MobileElement dashboard_EditProfile_Password_NewPasswordEyeButton;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button")
	public MobileElement dashboard_EditProfile_Password_LetsGoButton;
	
		
}

