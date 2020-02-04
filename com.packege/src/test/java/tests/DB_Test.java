package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DB_Test {

	private Connection con = null;
	String dataBaseName = "weoto";
	String driver_DBPath = "jdbc:mysql://127.0.0.1:3306/";
	String DB_username = "root";
	String DB_password = "";

	static AppiumDriver<MobileElement> driver;


	public String DBConnection(String query) 
	{
		System.out.println("You are in DB Testing function ----");
		try
		{

			//String query="SELECT CONCAT( LOWER( DATE_FORMAT( CONVERT_TZ( started_date, '+00:00', '+05:00' ) , '%I:%i %p' ) ) ) AS utc_datetime FROM event_info WHERE `event_title` LIKE 'idius'";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 

			//For MySQL Connection
			Connection con = (Connection) DriverManager.getConnection(driver_DBPath + dataBaseName ,DB_username,DB_password );

			Statement statement=con.createStatement();

			ResultSet resulttime=statement.executeQuery(query);

			while(resulttime.next()) 
			{
				System.out.println("Query Executed succesfully----");
				
				String backendqueryresult = resulttime.getString(1);

				System.out.println("Its BackEnd End time "+backendqueryresult);

				System.out.println("Query Executed succesfully----");
				
				return backendqueryresult;
			
			}	

		}


		catch(Exception e)
		{
			System.out.println(e.getMessage());

			System.out.println("Query is not Execuetd");

		}
		return null;
		
		
		
		

	}

}
