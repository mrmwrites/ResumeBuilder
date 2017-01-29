package main;

import org.junit.Assert;

public class LoginBO {

	public boolean validate(Login login, String button) {
		// TODO Auto-generated method stub
	
		if ("Login".equals(button))
		{
			if(login.getUserName().equals("naveenhome") && login.getPassword().equals("xyz"))
			{
				System.out.println("Login successful");
				return true;
			}
			else
				return false;
	//	return true; //--"Login successful";

		}

		else
			return false;// return false; //"Login failed";
	}
/*	public boolean validateEmail(Login login, String button) {
		// TODO Auto-generated method stub
	
		if ("Login".equals(button))
		{
			if(login.getEmailAddress().equals("swami@mrmwrites.com"))
			{
				System.out.println("Email address is in the right format");
				return true;
			}
			else
				return false;
	//	return true; //--"Login successful";

		}

		else
			return false;// return false; //"Login failed";
	}*/
}
