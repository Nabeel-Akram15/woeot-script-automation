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
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Pages.EventDetailPage;
import io.appium.java_client.MobileElement;

@Test()
public class XMLDataRetrieval {
	
	@Test()
	public String test(String Language1, String KeyValue)  { {

		String Language = Language1;
		//passing variable to the switch
		switch (Language) 
		{
		//comparing value of variable against each case
		case "English":
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = null;
			try {
				builder = factory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Document doc = null;
			try {
				doc = builder.parse("E:\\Software\\eclipse-workspace\\com.packege\\src\\test\\java\\tests\\updated strings (1).xml");
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = null;
			try {
				expr = xpath.compile("//resources/string[@name]");
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			NodeList nl = null;
			try {
				nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			for (int i = 0; i < nl.getLength(); i++)
			{
				Node currentItem = nl.item(i);

				String key = currentItem.getAttributes().getNamedItem("name").getNodeValue();

				if(new String(key).equals(KeyValue)) 
				{

					System.out.println(currentItem.getTextContent());

					return currentItem.getTextContent();
					
				}

			}
			return null;

		case "German":

			System.out.println("It is Raining today!");

			break;

		case "Russian":

			System.out.println("It is Cloudy today!");

			break;

			//optional
		default:
			System.out.println("Invalid Input!");
		}

	}
	return null;
	}
}
