package tests;

import java.util.Scanner;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.DashboardDetail;
import Pages.EventDetailPage;
import io.appium.java_client.MobileElement;

public class EventDetailTest extends TestConfigurationBase {


	private static final int PictureCount = 0;
	
	@Test(priority=1)
	public void DisplayedAllElements() throws Exception 

	{
		LoginTest lo=new LoginTest();

		lo.LoginPositiveValue("dev.aomata3@gmail.com","123456");

		DashboardDetail dash =new DashboardDetail(TestConfigurationBase.driver);
		
		XMLDataRetrieval xml=new XMLDataRetrieval();

		dash.dashboard_UpcomingfirstElement.click();

		EventDetailPage abc=new EventDetailPage(TestConfigurationBase.driver);

		Assert.assertTrue(abc.BackButtonEvent.isDisplayed(), "You are in Wrong Page");
		
		Assert.assertTrue(abc.AddMoreParticipentsButton.isDisplayed(), "You are in Wrong Page");
		
		Assert.assertTrue(abc.TextEventStartonDateandTime.isDisplayed(), "You are in Wrong Page");
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "event_starts"), abc.TextEventStartonDateandTime.getText(),"Wrong page");
				
		Assert.assertTrue(abc.TextEventStartonDateandTime.isDisplayed(), "You are in Wrong Page");
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "event_starts"),abc.TextEventStartonDateandTime.getText());
		
		Assert.assertTrue(abc.AddSignInsideNewMomentCreation.isDisplayed(), "You are in Wrong Page");
									
		Assert.assertTrue(abc.NewMomentCreationBox.isDisplayed(), "You are in Wrong Page");
										
		Assert.assertTrue(abc.PictureListTitle.isDisplayed(), "You are in Wrong Page");
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "pictures_colon"), abc.PictureListTitle.getText());
		
		Assert.assertTrue(abc.Defaultpicture.isDisplayed(), "You are in Wrong Page");
		
		Assert.assertTrue(abc.EventDeleteButton.isDisplayed(), "You are in Wrong Page");
											
		Assert.assertTrue(abc.EventEditButoon.isDisplayed(), "You are in Wrong Page");
																										
		System.out.println("All The Elements are Displayed On the Screen...");

	}
	
	@Test(priority=2)
	public void BackButton() {

		EventDetailPage abc=new EventDetailPage(TestConfigurationBase.driver);
		
		XMLDataRetrieval xml=new XMLDataRetrieval();
		
		abc.BackButtonPress();
		
		System.out.println("Welcom Again bro---");
		
		DashboardDetail dash=new DashboardDetail(driver);
		
		String PageTitle=dash.dashboard_getTitle();
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "event"),PageTitle,"You are in Wrong Page");
		
		System.out.println("Back button is Working Fine");
		
		dash.dashboard_UpcomingfirstElement.click();
		
		String MomenetsDescription=abc.TitleOnUpcomingEventInsideEvent.getText();
		
		//Compare with Moments Text for verification of page 
		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"moments_colon" ), MomenetsDescription,"You are in wrong Page");

	}

	@SuppressWarnings("unused")
	@Test(priority=6)
	public void AddMorebuttonParticipentscheck()
	{
		DashboardDetail dash=new DashboardDetail(TestConfigurationBase.driver);

		EventDetailPage abc=new EventDetailPage(TestConfigurationBase.driver);
		
		XMLDataRetrieval xml=new XMLDataRetrieval();

		@SuppressWarnings("unused")
		WebDriverWait wait=new WebDriverWait(driver, 200);
		
		abc.AddMoreParticipants();
		
		try {

			abc.wait(300);
		} 
		catch (InterruptedException e) {

			System.out.println("Its for wait Exception---"+ e.getMessage() + e.getCause());

			e.printStackTrace();
		}
		
		abc.AddParticipents3Element.click();
		
		abc.AddParticipentInvite.click();

		System.out.println("Congratulation-------");

		String MomenetsDescription=abc.TitleOnUpcomingEventInsideEvent.getText();
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"moments_colon" ), MomenetsDescription,"You are in wrong Page");

		System.out.println("Add More button is Working Fine");
		
	}


	@Test(priority=4)
	public void DateCheckWithDB()
	{
		System.out.println("Enter the Event title Exactly---");
		
     	Scanner myObj = new Scanner(System.in); 
     	
     	String EventTitle = myObj.nextLine();
     	
     	System.out.println("You will test for this Event: " + EventTitle);
     	
		String BackEndDateQuery ="SELECT CONCAT( DATE_FORMAT( CONVERT_TZ( started_date, '+00:00', '+05:00' ) , '%d %b' ) , ' ', '', DATE_FORMAT( CONVERT_TZ( started_date, '+00:00', '+05:00' ) , '%y' ) ) AS `utc_datetime`\r\n" + 
				"FROM event_info\r\n" + 
				"WHERE `event_title` LIKE "+ EventTitle;

		DB_Test db= new DB_Test();

		try {

			String result= db.DBConnection(BackEndDateQuery);

			System.out.println("Its BackEnd Date---"+result);
			
			EventDetailPage abc= new EventDetailPage(TestConfigurationBase.driver);

			String frontendDate=abc.Date.getText();

			System.out.println("Its FrontEnd Date---"+frontendDate);
			
			Assert.assertEquals(frontendDate, result,"Date is not match with DB Date -----");
			
			//Assert.assertEquals(actual, expected);
			
			System.out.println("Date is amtched with frontEnd Date");
		} 

		catch (Exception e) {

			System.out.println("You are in trouble bro for Date function ----");

			e.printStackTrace();

			e.getCause();

			e.getMessage();
		}
	}


	@Test(priority=3)
	public void TimeCheckWithDB()
	{
		System.out.println("Enter the Event title Exactly---");
     	
		Scanner myObj = new Scanner(System.in); 
     	
     	String EventTitle = myObj.nextLine();
     	
     	System.out.println("You will test for this Event: " + EventTitle);
		
		String BackEndTimeQuery= "SELECT CONCAT( LOWER( DATE_FORMAT( CONVERT_TZ( started_date, '+00:00', '+05:00' ) , '%I:%i %p' ) ) ) AS utc_datetime FROM event_info WHERE `event_title` LIKE "+ EventTitle;

		DB_Test db =new DB_Test();

		try 
		{

			String result= db.DBConnection(BackEndTimeQuery);
			
			System.out.println("Its BackEnd Time---"+result);

			EventDetailPage abc= new EventDetailPage(TestConfigurationBase.driver);

			String frontendtime=abc.Time.getText();
			
			System.out.println("Its frontEnd Time---"+frontendtime);

			Assert.assertEquals(frontendtime, result,"Time is not match with DB Date -----");



		}
		catch (Exception e) 
		{
			System.out.println("You are in trouble bro for Time  function ---");

			e.printStackTrace();

			e.getCause();

			e.getMessage();
		}

	}


	@Test(priority=5)
	public void DeleteButton()
	{
		XMLDataRetrieval xml=new XMLDataRetrieval();
		
		EventDetailPage abc=new EventDetailPage(TestConfigurationBase.driver);
		
		Assert.assertTrue(abc.NewMomentCreationBox.isDisplayed(),"You are in wromg page");
		
		abc.EventDelete();
		
		abc.DeleteNo();
		
		Assert.assertEquals(xml.test(TestConfigurationBase.Language,"moments_colon" ), abc.TitleOnUpcomingEventInsideEvent.getText());
		
		System.out.println("Delete button is Working Fine");
	}
}
