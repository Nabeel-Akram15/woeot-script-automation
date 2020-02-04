package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpDetail {

	AndroidDriver<AndroidElement> driver2;

	// Constructor
	public SignUpDetail(AndroidDriver<AndroidElement> driver) {

		this.driver2=driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	// SignUp Page 1 FullName Locators
	
	@AndroidFindBy (id = "com.weoto:id/btnSignUp")
	public MobileElement SignUp_1_SigUpButton;
	
	@AndroidFindBy (id = "com.weoto:id/asdf")
	public MobileElement SignUp_1_Description;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	public MobileElement SignUp_DefaultPicture;

	@AndroidFindBy (id = "com.weoto:id/txtName")
	public MobileElement SignUp_1_FullName;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[2]/android.widget.Button")
	public MobileElement SignUp_1_ContinueButton;

	@AndroidFindBy (id = "com.weoto:id/lblTermAndCondition")
	public MobileElement SignUp_1_TermsandCondition;


	@AndroidFindBy (id = "com.weoto:id/leftSideButton")
	public MobileElement SignUp_1_Error_Close;

	@AndroidFindBy (id = "com.weoto:id/description")
	public MobileElement SignUp_1_FullName_Error_Description;


	// SignUp Page 2  Locators

	@AndroidFindBy (id = "com.weoto:id/asdf")
	public MobileElement SignUp_2_Description;

	@AndroidFindBy (id = "com.weoto:id/txtEmail")
	public MobileElement SignUp_2_Email;

	// SignUp Page 3  Locators

	@AndroidFindBy (id = "com.weoto:id/lblMessage")
	public MobileElement SignUp_3_Description;

	@AndroidFindBy (id = "com.weoto:id/txtPassword")
	public MobileElement SignUp_3_Password;

	// SignUp Page 4 Locators

	@AndroidFindBy (id = "com.weoto:id/asdf")
	public MobileElement SignUp_4_Description;

	// SignUp Page 5  Locators

	@AndroidFindBy (id = "com.weoto:id/textView66")
	public MobileElement SignUp_5_Description;

	@AndroidFindBy (id = "com.weoto:id/imageCountryFlag")
	public MobileElement SignUp_5_CountryFlag;

	@AndroidFindBy (id = "com.weoto:id/textViewSelectedCountry")
	public MobileElement SignUp_5_CountryCode;

	@AndroidFindBy (id = "com.weoto:id/txtPhoneNumber")
	public MobileElement SignUp_5_Number;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button")
	public MobileElement SignUp_5_LetsgoButton;

	// SignUp Page 6  Locators

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	public MobileElement SignUp_6_Description;

	@AndroidFindBy (id = "com.weoto:id/txtCode1")
	public MobileElement SignUp_6_Code1;

	@AndroidFindBy (id = "com.weoto:id/txtCode2")
	public MobileElement SignUp_6_Code2;

	@AndroidFindBy (id = "com.weoto:id/txtCode3")
	public MobileElement SignUp_6_Code3;

	@AndroidFindBy (id = "com.weoto:id/txtCode4")
	public MobileElement SignUp_6_Code4;

	@AndroidFindBy (id = "com.weoto:id/txtCode5")
	public MobileElement SignUp_6_Code5;

	@AndroidFindBy (id = "com.weoto:id/txtCode6")
	public MobileElement SignUp_6_Code6;
	
	
	//User Actions On SignUp Screens

	// SignUp 1 User Action
	
	public void SignUp_1_SignUpClick()
	{
		SignUp_1_SigUpButton.click();
	}
	public void SignUp_1_SetName(String FullName)
	{
		SignUp_1_FullName.sendKeys(FullName);
	}


	public void SignUp_1_ContinueClick() 
	{
		SignUp_1_ContinueButton.click();
	}

	public void SignUp_1_TermsandConditionClick()
	{
		SignUp_1_TermsandCondition.click();
	}


	public void SignUp_1_Error_Click()
	{
		SignUp_1_Error_Close.click();
	}
	//SignUp 2 User Actions

	public void SignUp_2_Email(String Email)
	{
		SignUp_2_Email.sendKeys(Email);
	}


	//SignUp 3 User Actions

	public void SignUp_3_Password(String Password)
	{
		SignUp_3_Password.sendKeys(Password);
	}

	//SignUp 4 User Actions

	//SignUp 5 User Actions

	public void SignUp_5_CountryCodeClick()
	{
		SignUp_5_CountryFlag.click();
	}

	public void SignUp_5_CountryFlagClick()
	{
		SignUp_5_CountryFlag.click();
	}

	public void SignUp_5_SetNumber(String Number)
	{
		SignUp_5_Number.sendKeys(Number);
	}

	public void SignUp_5_LetsgoClick()
	{
		SignUp_5_LetsgoButton.click();
	}

	//SignUp 6 USer Action 


	public void SignUp_6_SetCode1(String code1)
	{
		SignUp_6_Code1.sendKeys(code1);
	}

	public void SignUp_6_SetCode2(String code2)
	{
		SignUp_6_Code2.sendKeys(code2);
	}

	public void SignUp_6_SetCode3(String code3)
	{
		SignUp_6_Code3.sendKeys(code3);
	}

	public void SignUp_6_SetCode4(String code4)
	{
		SignUp_6_Code4.sendKeys(code4);
	}

	public void SignUp_6_SetCode5(String code5)
	{
		SignUp_6_Code5.sendKeys(code5);
	}

	public void SignUp_6_SetCode6(String code6)
	{
		SignUp_6_Code6.sendKeys(code6);
	}

}
