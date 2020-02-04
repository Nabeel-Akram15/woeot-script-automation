package tests;

public class Strings {
	  
	
	
	
	public String Language_String(String Language,String Keys)
	{
	
		switch(Language) {
		
		case "English":
			System.out.println("You Choose English Language");
			String lmn=keys(Keys);
			return lmn;
	
			
		}
		return null;
		
	}

	
	
	public String keys(String Keys)
	{
		switch(Keys) {
		case "Dashboardtitle":
			String Dashboardtitle="Events";
			return Dashboardtitle;
		}
		return Keys;
	}

}
