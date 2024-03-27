package Test_Cases_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object_Class.Open_Cart_Account_Login;
import Page_Object_Class.Open_Cart_Home_Page;
import Page_Object_Class.Open_Cart_My_Account;

public class Test_Case_03 extends Base_Class_For_Test_cases {

	
	@Test
	void Test_Case_Login_Page()
	{
		Home_Page_Obj=new Open_Cart_Home_Page(Driver_Obj);
		
		Home_Page_Obj.Open_Login_Page();
		
		Account_Login = new Open_Cart_Account_Login(Driver_Obj);
		
		Account_Login.Login(Properties_Obj.getProperty("Email"),Properties_Obj.getProperty("Password"));
		
		My_Account = new Open_Cart_My_Account(Driver_Obj);
		
		Assert.assertTrue(My_Account.Check_My_Account_Label());
						
		}
	
	
	
}

