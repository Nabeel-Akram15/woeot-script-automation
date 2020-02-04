package tests;


import org.testng.annotations.Test;

import Pages.EventDetailPage;

public class Abc extends TestConfigurationBase {

	
	
	
	private static final int PictureCount = 0;
	EventDetailPage abc=new EventDetailPage(TestConfigurationBase.driver);
	
	@Test(priority=0)
	public void DisplayedAllElements() 
	{
		System.out.println("You r in 0 priority function");
		
         
		if (abc.BackButtonEvent.isDisplayed()) {
			if(abc.EventTitle.isDisplayed())
			{
				if (abc.AddMoreParticipentsButton.isDisplayed())
				{
					if(abc.TextEventStartonDateandTime.isDisplayed())
					{
						if(abc.Date.isDisplayed())
						{
							if(abc.AtTheRateSign.isDisplayed())
							{
								if (abc.Time.isDisplayed())
								{
									if(abc.TitleOnUpcomingEventInsideEvent.isDisplayed())
									{
										if(abc.AddSignInsideNewMomentCreation.isDisplayed())
										{
											if(abc.AddSignInsideNewMomentCreation.isDisplayed())
											{
												if(abc.NewMomentCreationBox.isDisplayed())
												{
													if(abc.PictureListTitle.isDisplayed())
													{
														if(abc.Defaultpicture.isDisplayed() && PictureCount==0)
														{
															if(abc.EventDeleteButton.isDisplayed())
															{
																if(abc.EventEditButoon.isDisplayed())
																{
																	System.out.println("All The Elements are Displayed On the Screen...");
																}
															}
															
														}
													}

												}
											}

										}
									}
								}
							}
						}
					}
				}
			}
		}
         }

}
