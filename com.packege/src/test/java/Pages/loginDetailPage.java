package Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginDetailPage {

	public AndroidDriver<AndroidElement> driver2=null;

	//Constructor 
	public loginDetailPage(AndroidDriver<AndroidElement> driver) {

		this.driver2=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver2, Duration.ofSeconds(30)), this);
		//PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}

	//LoginPage1 Email and password Set Screen

	@AndroidFindBy (id = "com.weoto:id/topViewImage")
	public MobileElement DefaultPicture;

	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout[2]"
			+ "/android.widget.TextView")
	public MobileElement Login_1_Description;

	@AndroidFindBy (id = "com.weoto:id/txtUserName")
	public MobileElement Login_1_Email;

	@AndroidFindBy (id = "com.weoto:id/txtPassword")
	public MobileElement Login_1_Password;

	@AndroidFindBy (id = "com.weoto:id/lblForgotPassword")
	public MobileElement Login_1_ForgotPassword;

	@AndroidFindBy (id = "com.weoto:id/btnShowPassword")
	public MobileElement Login_1_EyeButton;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Button")
	public MobileElement Login_1_LoginButton;

	@AndroidFindBy (id = "com.weoto:id/lblTermAndCondition")
	public MobileElement Login_1_TermsandCondition;

	@AndroidFindBy (id = "com.weoto:id/leftSideButton")
	public MobileElement Login_1_Error_CloseButton;

	@AndroidFindBy (id = "com.weoto:id/description")
	public MobileElement Login_1_Error_Description;

	//Login 1 Page User Actions
	
	public String Login_1_Description_text() {
		
		return Login_1_Description.getText();
	}
	public void Login_1_SetEmail(String Email) {

		Login_1_Email.sendKeys(Email);
	}

	public void Login_1_SetPassword(String Password) {

		Login_1_Password.sendKeys(Password);
	}
	public void Login_1_Eyebutton() {

		Login_1_EyeButton.click();
	}
	public void Login_1_ForgotPassword() {

		Login_1_ForgotPassword.click();
	}

	public void Login_1_click() {

		Login_1_LoginButton.click();
	}
	public void Login_1_TermandCondition(){

		Login_1_TermsandCondition.click();
	}

	//Login 2 Screen Reset Password

	@AndroidFindBy (id = "com.weoto:id/lblResetPassword")
	public MobileElement Login_2_ResetPasswordDescription;

	@AndroidFindBy (id = "com.weoto:id/lblEnterEmailAddress")
	public MobileElement Login_2_Description;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.ImageView")
	public MobileElement Login_2_DefaultPicture;

	@AndroidFindBy (id = "com.weoto:id/txtEmail")
	public MobileElement Login_2_Email;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button")
	public MobileElement Login_2_ContinueButton;

	@AndroidFindBy (id = "com.weoto:id/lblTermAndCondition")
	public MobileElement Login_2_TermsandCondition;

	//UserAction on Login 2 Page


	public void Login_2_SetEmail(String Email) {

		Login_2_Email.sendKeys(Email);
	}

	public void Login_2_Continue() {

		Login_2_ContinueButton.click();
	}

	public void Login_2_TermsandCondition() {

		Login_2_TermsandCondition.click();
	}


}
