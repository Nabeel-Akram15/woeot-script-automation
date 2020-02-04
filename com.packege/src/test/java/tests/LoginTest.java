package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.DashboardDetail;
import Pages.loginDetailPage;

public class LoginTest extends TestConfigurationBase {


	@Test(priority=0)
	public void DisplayElements()
	{
		loginDetailPage login=new loginDetailPage(TestConfigurationBase.driver);

		XMLDataRetrieval xml= new XMLDataRetrieval();

		Assert.assertTrue(login.DefaultPicture.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertTrue(login.Login_1_Description.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"enter_your_email_and_password" ),login.Login_1_Description.getText(),"Strings are not matched");

		Assert.assertTrue(login.Login_1_Email.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"email" ),login.Login_1_Email.getText(),"Strings are not matched");

		Assert.assertTrue(login.Login_1_Password.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"password" ),login.Login_1_Password.getText(),"Strings are not matched");

		Assert.assertTrue(login.Login_1_ForgotPassword.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"password_forget_login" ),login.Login_1_ForgotPassword.getText(),"Strings are not matched");

		Assert.assertTrue(login.Login_1_EyeButton.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertTrue(login.Login_1_LoginButton.isDisplayed(), "Default Picture is not Displayed");

		//Assert.assertEquals(xml.test(TestConfigurationBase.Language,"login" ),login.Login_1_LoginButton.getText(),"Strings are not matched");

		Assert.assertTrue(login.Login_1_TermsandCondition.isDisplayed(), "Default Picture is not Displayed");

		//	Assert.assertEquals(xml.test(TestConfigurationBase.Language,"login_terms_conditions_and_privacy_policy" ),login.Login_1_TermsandCondition.getText(),"Strings are not matched");

		System.out.println("All The Elements are Displayed Congartulation ----");
	}




	@Test(priority=3 ,dataProvider="Positive Values Login Check" ,dataProviderClass = ParameterByDataprovider.class)
	public void LoginPositiveValue(String Email, String Password) throws Exception
	{
		loginDetailPage login=new loginDetailPage(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();
		
		login.Login_1_SetEmail(Email);
		
		login.Login_1_SetPassword(Password);

		login.Login_1_click();

		DashboardDetail dash= new DashboardDetail(TestConfigurationBase.driver);

		String title=dash.dashboard_getTitle();

		String abc=xml.test(TestConfigurationBase.Language, "events");

		System.out.println("It is key value---"+abc);

		Assert.assertEquals(abc, title,"You are in Wrong Page");
	}

	@Test(priority=1 ,dataProvider="Negative Values Login Check Email" , dataProviderClass=ParameterByDataprovider.class)
	public void LoginNegativeValues(String Email,String Password) throws Exception
	{
		System.out.println("You are in Negative Values Function");

		loginDetailPage login=new loginDetailPage(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		login.Login_1_SetEmail(Email);

		login.Login_1_SetPassword(Password);

		login.Login_1_click();

		Assert.assertTrue(login.Login_1_Error_CloseButton.isDisplayed());

		Assert.assertTrue(login.Login_1_Error_CloseButton.isEnabled());

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "input_valid_email_address"), login.Login_1_Error_Description.getText(),"String are not match");

		login.Login_1_Error_CloseButton.click();

	}
	@Test(priority=2 ,dataProvider="Negative Values Login Check Password" , dataProviderClass=ParameterByDataprovider.class)
	public void LoginNegativeValuesPassword(String Email,String Password) throws Exception
	{
		System.out.println("You are in Negative Values Function");

		loginDetailPage login=new loginDetailPage(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		login.Login_1_SetEmail(Email);

		login.Login_1_SetPassword(Password);

		login.Login_1_click();
		
		Assert.assertTrue(login.Login_1_Error_CloseButton.isDisplayed());

		Assert.assertTrue(login.Login_1_Error_CloseButton.isEnabled());
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "unable_to_authenticate"), login.Login_1_Error_Description.getText(),"String are not match");
		
		login.Login_1_Error_CloseButton.click();

		}

	public void StringMatch(String key)
	{
		String language=TestConfigurationBase.Language;
		Strings str=new Strings();
		String actual =str.Language_String(language, key);
	}
}



