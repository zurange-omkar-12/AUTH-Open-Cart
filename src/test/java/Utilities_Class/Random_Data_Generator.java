package Utilities_Class;

import org.apache.commons.lang3.RandomStringUtils;

public class Random_Data_Generator {

	
	public String Name_Generator()
	{
		return RandomStringUtils.randomAlphabetic(6); 
	}
	
	
	public String Telephone_Generator()
	{
		return RandomStringUtils.randomAlphanumeric(10); 
	}
	
	
	public String Email_And_Password_Generator()
	{
		return RandomStringUtils.randomAlphabetic(5)+RandomStringUtils.randomAlphanumeric(2)+"@"+RandomStringUtils.randomAlphabetic(3); 
	}
	

	
	
}
