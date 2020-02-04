package tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Pages.EventDetailPage;
import Pages.SignUpDetail;
import io.appium.java_client.MobileElement;
public class ForQaIndividualTest extends TestConfigurationBase
{
 @Test(priority=0)
 public void DisplayFirstPageElements() 

{
	SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);
	
	XMLDataRetrieval xml=new XMLDataRetrieval();
	
		Assert.assertTrue(su.SignUp_1_ContinueButton.isDisplayed());
		}
		


//// @Test(priority=0)
//// public void DisplayFirstPageElements1() 
////
////{
////	SignUpDetail su=new SignUpDetail(TestConfigurationBase.driver);
////	
////	XMLDataRetrieval xml=new XMLDataRetrieval();
////	
////		if(su.SignUp_1_Description.isDisplayed())
////		{
////			if(su.SignUp_1_Description.isDisplayed())
////			{
////				Assert.assertEquals(su.SignUp_1_Description.getText(),xml.test("English","what_should_we_u"),"Strings are not matched`");
////				
////			{
////			if(su.SignUp_DefaultPicture.isDisplayed())
////			{
////				if(su.SignUp_1_FullName.isDisplayed())
////				{
////					if(su.SignUp_1_ContinueButton.isDisplayed())
////					{
////						if(su.SignUp_1_TermsandCondition.isDisplayed())
////						{
////							System.out.println("Page 1 All Elements are Displayed---");
////						}
////					}
////				}
////			}
////
////		}
////	}
////		
////		}
////		
////}
// @AfterMethod
// public void abc()
// {
//	 driver.closeApp();
// }
//	
	}
