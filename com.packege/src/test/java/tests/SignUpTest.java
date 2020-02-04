package tests;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Pages.SignUpDetail;

public class SignUpTest extends TestConfigurationBase {


	@Test(priority=1)
	public void DisplayFirstPageElements() 

	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		Assert.assertTrue(su.SignUp_1_Description.isDisplayed(), "Description of SignUp 1 page is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"what_should_we_call_you"),su.SignUp_1_Description.getText(),"Description of SignUp 1 page is not Match");

		Assert.assertTrue(su.SignUp_DefaultPicture.isDisplayed(), "Default Picture is not Displayed");

		Assert.assertTrue(su.SignUp_1_FullName.isDisplayed(),"Full Name is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "full_name"), su.SignUp_1_FullName.getText(),"Full Name description is not Matched");

		Assert.assertTrue(su.SignUp_1_ContinueButton.isDisplayed(), "Continue Button is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "continue_camelcased"), su.SignUp_1_ContinueButton.getText(),"Continue Button text is not matched");

		Assert.assertTrue(su.SignUp_1_TermsandCondition.isDisplayed(), "Terms and condition text is not Displayed");

		//	Assert.assertEquals(xml.test(TestConfigurationBase.Language, "by_signing_up_you_agree_to_our_terms_and_privacy_"), su.SignUp_1_TermsandCondition.getText(),"Terms and condition text is not matched");

		System.out.println("Page 1 All Elements are Displayed---");

	} 

	@Test (priority=2 ,dataProvider="SignUp FullName Negative Values Check", dataProviderClass=ParameterByDataprovider.class)
	public void FullName_Negative_Values_Check(String FullName) throws Exception
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);
		
		XMLDataRetrieval xml=new XMLDataRetrieval();

		su.SignUp_1_SetName(FullName);

		su.SignUp_1_ContinueClick();
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "input_full_name"), su.SignUp_1_FullName_Error_Description.getText(),"Error Description is not matched");

		su.SignUp_1_Error_Click();
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "what_should_we_call_you"), su.SignUp_1_Description.getText());
	}

	@Test(priority=3)
	public void FullNamePositive()
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();
		
		su.SignUp_1_SetName("Nabeel");

		su.SignUp_1_ContinueClick();
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "what_is_your_email_address"), su.SignUp_2_Description.getText());

	}
	
	@Test(priority=4)
	public void EmailPageDisplayElemensts()
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		Assert.assertTrue(su.SignUp_1_Description.isDisplayed(), "Sign Up 2 Page Desciption is Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "what_is_your_email_address"), su.SignUp_1_Description.getText(),"Sign Up 2 Pages Description is not matche");

		Assert.assertTrue(su.SignUp_DefaultPicture.isDisplayed(), "Sign Up 2 Page Default Picture is not shown");

		Assert.assertTrue(su.SignUp_2_Email.isDisplayed(), "Sign Up 2 Email Address txt is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "email_address"), su.SignUp_2_Email.getText(),"Email Addresr of 2 pages is not matached");

		Assert.assertTrue(su.SignUp_1_ContinueButton.isDisplayed(), "Sign Up 2 Continue button is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "continue_camelcased"), su.SignUp_1_ContinueButton.getText(),"Continue  of 2 pages is not matached");

		Assert.assertTrue(su.SignUp_1_TermsandCondition.isDisplayed(), "Sign Up 2 Terms and condition is not Displayed");

		//	Assert.assertEquals(xml.test(TestConfigurationBase.Language, "continue_camelcased"), su.SignUp_1_TermsandCondition.getText(),"Continue  of 2 pages is not matached");

		System.out.println("All Elements of Email Page are Displayed ----");
	}

	@Test (priority=5 ,dataProvider="SignUp Email Negative Values", dataProviderClass=ParameterByDataprovider.class)
	public void Invalid_Email_Values_Check(String Email) throws Exception
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		su.SignUp_2_Email(Email);

		su.SignUp_1_ContinueClick();

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "input_email_address_validation"), su.SignUp_1_FullName_Error_Description.getText(),"Error Message is not matched");

		su.SignUp_1_Error_Click();

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "what_is_your_email_address"), su.SignUp_1_Description.getText());

	}
//Email Positive
	@Test (priority=7)
	public void PasswordDisplayElements()
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		Assert.assertTrue(su.SignUp_3_Description.isDisplayed(), "Sign Up 3 Page Desciption is not Displayed");

		Assert.assertTrue(su.SignUp_DefaultPicture.isDisplayed(), "Sign Up 3 Default pIcture  is not Displayed");

		Assert.assertTrue(su.SignUp_3_Password.isDisplayed(), "Sign Up 3 Password is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "password"), su.SignUp_3_Password.getText(),"Password text is not match");

		Assert.assertTrue(su.SignUp_1_ContinueButton.isDisplayed(), "Sign Up 3 Continue Button is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "continue_camelcased"), su.SignUp_1_ContinueButton.getText(),"Continue Button text is not match");

		Assert.assertTrue(su.SignUp_1_TermsandCondition.isDisplayed(), "Sign Up 3 Terms and conditions is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, ""), su.SignUp_1_TermsandCondition.getText(),"Terms And Conditiontext is not match");

		//Assert.assertEquals(xml.test(TestConfigurationBase.Language, "by_signing_up_you_agree_to_our_terms_and_privacy_"), su.SignUp_1_TermsandCondition.getText(),"Terms and condition text is not matched");

		System.out.println("Password Screen All Elements are Displayed -----");
	}
	
	@Test (priority=8 ,dataProvider="SignUp Password check Negative Values", dataProviderClass=ParameterByDataprovider.class)
	public void Password_Negative_Values_Check(String Password) throws Exception
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);
		
		XMLDataRetrieval xml=new XMLDataRetrieval();

		su.SignUp_3_Password(Password);

		su.SignUp_1_ContinueClick();

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "please_enter_your_current_password_with_minimum_of_n_characters_length"), su.SignUp_1_FullName_Error_Description.getText(),"Error Message text is not matched");
		
		su.SignUp_1_Error_Click();

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "password"), su.SignUp_3_Password.getText(),"you are in wrong Page");
	}
	
	@Test (priority=9)
	public void Password() 
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		su.SignUp_2_Email("123456");

		String ac=su.SignUp_1_Description.getText();

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "email_verification_sent"), su.SignUp_1_Description.getText(),"Description of 4 page is not matched");

		su.SignUp_1_ContinueClick();
		
		//Verfication scrren move check
		
		//Assert.assertEquals(actual, expected);
	}



	@Test(priority=)
	public void Positive5to6()
	{
		SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);

		su.SignUp_1_ContinueClick();
	}

	@Test(priority=)
	public void PositiveEnterCode()
	{
		//su.
	}
}
