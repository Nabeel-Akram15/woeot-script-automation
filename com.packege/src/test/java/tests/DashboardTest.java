package tests;

import java.time.Duration;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.DashboardDetail;
import Pages.MenuDetail;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DashboardTest extends TestConfigurationBase {

	@Test(priority=0)
	public void DisplayDashboardAllElements() throws Exception
	{
		LoginTest lg= new LoginTest();

		lg.LoginPositiveValue("dev.aomata3@gmail.com","123456");

		DashboardDetail dh= new DashboardDetail(TestConfigurationBase.driver);

		XMLDataRetrieval xml=new XMLDataRetrieval();

		Assert.assertTrue(dh.dashboard_Menue_Button.isDisplayed(), "Dashboard Menue is not Displayed");

		Assert.assertTrue(dh.Dashboardtile.isDisplayed(), "Dashboard title is not Displayed");

		Assert.assertEquals(xml.test(TestConfigurationBase.Language, "events"),dh.dashboard_getTitle());

		Assert.assertTrue(dh.dashboardSearch.isDisplayed(), "Search button is not Displayed");

		Assert.assertTrue(dh.dashboardSearch.isEnabled(), "Dashboard button is not Displayed");

		Assert.assertTrue(dh.dashboard_UpcomingfirstElement.isDisplayed(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_UpcomingfirstElement.isEnabled(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_UpcomingthirdElement.isDisplayed(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_UpcomingthirdElement.isEnabled(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_SavedEvents.isDisplayed(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_SavedEventFirstElement.isDisplayed(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_SavedEventFirstElement.isEnabled(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_SavedEventSecondElement.isDisplayed(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_SavedEventSecondElement.isEnabled(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_PlusButton.isDisplayed(),"First Element is not Displayed");

		Assert.assertTrue(dh.dashboard_PlusButton.isEnabled(),"First Element is not Displayed");

		System.out.println("All the Elements are Displayed of Dashboard---");
	}

	@Test(priority=1)
	public void UpcomingBackFrontCountMatch()
	{
		DB_Test db=new DB_Test();

		DashboardDetail dash= new DashboardDetail(TestConfigurationBase.driver);
		dash.clickMenu();
		MenuDetail menu=new MenuDetail(driver);
        String Email=menu.UserEmail.getText();
        //Back to dashboard
    	System.out.println("You will test for this Event: " + Email);

		String query= "SELECT ((SELECT count(*)\r\n" + 
				" FROM invites inv,event_info ei,user_info ui WHERE ui.id = inv.recipient_id AND ei.id = inv.event_info_id AND CONVERT_TZ( UTC_TIMESTAMP, '+00:00', '+05:00'  AND ui.email = "+ Email +")) + (SELECT count(*)\r\n" + 
				" from event_info ei, user_info ui WHERE ui.id = ei.organizer_id AND CONVERT_TZ( UTC_TIMESTAMP, '+00:00', '+05:00') < CONVERT_TZ( ei.started_date, '+00:00', '+05:00') AND ui.email = "+ Email +")) AS 'Count of Up Coming events'";

		try
		{

			String Count= db.DBConnection(query);

			@SuppressWarnings("unused")
			int result = Integer.parseInt(Count);

			int abc= 5;

			for(int i=0; i<abc-2;i++)
			{

				this.SwipeHorizental();
			}

		}
		catch (Exception e) 
		{
			System.out.println("You are in trouble bro---");

			e.printStackTrace();
		}

		if(dash.dashboard_UpcomingthirdElement.isDisplayed())

		{
			System.out.println("Count Mismatch with DB and FrontEnd of Upcoming Events--");
		}

	}

	@Test(priority=2)
	public void SavedBackFrontCountMatch()
	{
		DB_Test db=new DB_Test();

		@SuppressWarnings("unused")
		DashboardDetail dash= new DashboardDetail(TestConfigurationBase.driver);
		dash.clickMenu();
         MenuDetail menu=new MenuDetail(driver);
         String Email=menu.UserEmail.getText();
     	System.out.println("You will test for this Event: " + Email);

		String query= "SELECT ((SELECT count(*)\r\n" + 
				" FROM invites inv,event_info ei,user_info ui WHERE ui.id = inv.recipient_id AND ei.id = inv.event_info_id AND CONVERT_TZ( UTC_TIMESTAMP, '+00:00', '+05:00'  AND ui.email = "+ Email +")) + (SELECT count(*)\r\n" + 
				" from event_info ei, user_info ui WHERE ui.id = ei.organizer_id AND CONVERT_TZ( UTC_TIMESTAMP, '+00:00', '+05:00') > CONVERT_TZ( ei.started_date, '+00:00', '+05:00') AND ui.email = "+ Email +")) AS 'Count of Up Coming events'";
		try
		{

			String Count= db.DBConnection(query);

			@SuppressWarnings("unused")
			int result = Integer.parseInt(Count);

			int abc= 11;

			for(int i=0; i<abc-2;i++)
			{

				this.SwipeVertical();
			}

		}
		catch (Exception e) 
		{
			System.out.println("You are in trouble bro---");

			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	public void SwipeHorizental()
	{
		DashboardDetail dash= new DashboardDetail(TestConfigurationBase.driver);

		new TouchAction(driver)

		.press(PointOption.point(dash.dashboard_UpcomingSecondElements.getLocation()))

		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))

		.moveTo(PointOption.point(dash.dashboard_UpcomingfirstElement.getLocation()))

		.release()

		.perform();
	}

	@SuppressWarnings("rawtypes")
	public void SwipeVertical()
	{
		DashboardDetail dash= new DashboardDetail(TestConfigurationBase.driver);

		new TouchAction(driver)

		.press(PointOption.point(dash.dashboard_SavedEventSecondElement.getLocation()))

		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))

		.moveTo(PointOption.point(dash.dashboard_SavedEventFirstElement.getLocation()))

		.release()

		.perform();
	}
}


