package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;


public class EventDetailPage {

	public AndroidDriver<AndroidElement> driver2=null; 

	// Constructor
	public EventDetailPage(AndroidDriver<AndroidElement> driver) {

		this.driver2=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver2, Duration.ofSeconds(30)), this);
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
			
			
	@AndroidFindBy (id = "com.weoto:id/btnBack")
	public MobileElement BackButtonEvent;

	@AndroidFindBy (id = "com.weoto:id/lblTitle")
	public MobileElement EventTitle;

	@AndroidFindBy (id= "com.weoto:id/btnAddMore")
	public MobileElement AddMoreParticipentsButton;


	@AndroidFindBy (id= "com.weoto:id/lblEventStatus")
	public MobileElement TextEventStartonDateandTime;


	@AndroidFindBy (id = "com.weoto:id/lblDate")
	public MobileElement Date;

	@AndroidFindBy (id = "com.weoto:id/txtDateTime2")
	public MobileElement AtTheRateSign;

	


	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/"
			+ "android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]\r\n" + 
			"")
	public MobileElement Time;


	@AndroidFindBy (id = "com.weoto:id/txtMoment")
	public MobileElement TitleOnUpcomingEventInsideEvent;

	@AndroidFindBy (id= "com.weoto:id/lblAddSign")
	public MobileElement AddSignInsideNewMomentCreation;

	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/"
			+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/"
			+ "android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
			+ "android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
	public MobileElement NewMomentCreationBox;


	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/"
			+ "android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
	public MobileElement UpcomingEvent0Index;


	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/"
			+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/"
			+ "android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
			+ "android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
	public MobileElement UpcomingEvent1Index;


	@AndroidFindBy (id="com.weoto:id/txtPic")
	public MobileElement PictureListTitle;


	@AndroidFindBy (id= "com.weoto:id/imageView2")
	public MobileElement Defaultpicture;

	@AndroidFindBy (id="com.weoto:id/btnEventDelete")
	public MobileElement EventDeleteButton;

	@AndroidFindBy (id="com.weoto:id/btnEventEdit")
	public MobileElement EventEditButoon;

	@AndroidFindBy (id="com.weoto:id/lblViewMessage")
	public MobileElement DeleteEventDescriptionAfterPress;
	
	@AndroidFindBy (id="com.weoto:id/rightSideButton")
	public MobileElement DeleteEventYes;

	@AndroidFindBy (id="com.weoto:id/rightSideButton")
	public MobileElement DeleteEventNo;
	
	
	
	@AndroidFindBy (xpath="android.widget.LinearLayout[@index='2']")
	public MobileElement AddParticipents3Element;
	
	@AndroidFindBy (id="com.weoto:id/inviteBtn")
	public MobileElement AddParticipentInvite;
	
//	@AndroidFindBy (id="")
//	public MobileElement AcceptEventDetail;
//	
//	@AndroidFindBy (id="")
//	public MobileElement RejectEventDetail;
//	
	public MobileElement DateReturn()
	{
		return this.Date;
		
	}
	
	public MobileElement TimeReturn()
	{
		return this.Time;
		
	}
	

	public void BackButtonPress()
	   {
		   try{
			   if(BackButtonEvent.isDisplayed())
		   
		   {
		   //driver.findElement(BackButtonEvent).click();
		        BackButtonEvent.click();
		   }
	   }
	catch(Exception e)
		   {
		System.out.println("You are in Trouble Bro and trouble is -----"+e.getStackTrace()+"--"+ e.getCause());
		   }
   }
	
	   public void AddMoreParticipants()
	   {
		   if(AddMoreParticipentsButton.isDisplayed() && AddMoreParticipentsButton.isEnabled())
		   {
		   this.AddMoreParticipentsButton.click();
		   }
	   }
	   
	   public void NewMomentCreation()
	   {
		   if (NewMomentCreationBox.isDisplayed() && NewMomentCreationBox.isEnabled())
            {
		   this.NewMomentCreationBox.click();
            }
	   }
	   
	   public void EventDelete()
	   {
		   if (EventDeleteButton.isDisplayed() && EventDeleteButton.isEnabled())
		   {
		   this.EventDeleteButton.click();
		   
		   }
	   }
	   
	   public void EventEditButton()
	   {
		    if(EventEditButoon.isDisplayed() && EventDeleteButton.isEnabled())
		    {
		   this.EventEditButoon.click();
		    }
	   }
	   
	   public void DeleteYes()
		{
		   if(DeleteEventYes.isEnabled())
			   
			DeleteEventYes.click();
			
		}
	   
	   public void DeleteNo()
		{
		   if(DeleteEventNo.isEnabled())
			DeleteEventNo.click();
			
		}
 }
	