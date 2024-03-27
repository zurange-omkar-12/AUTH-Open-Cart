package Test_Cases_Package;

import org.testng.Assert;
import org.testng.annotations.*;
import Page_Object_Class.Open_Cart_Home_Page;
import Page_Object_Class.Open_Cart_Register_Page;

public class Test_Case_01 extends Base_Class_For_Test_cases {
	
		
	

	@Test(enabled = false)
	void Test_Case_001()
	{
		
		Home_Page_Obj=new Open_Cart_Home_Page(Driver_Obj);
		Assert.assertEquals(Home_Page_Obj.Open_Registration_Page(), "Register Account");
	}
	
	@Test()
	void Test_Case_002() //User Registration
	{
		
		Home_Page_Obj=new Open_Cart_Home_Page(Driver_Obj);
		
		Home_Page_Obj.Open_Registration_Page();
		
		
		
		Registration_Page_Obj=new Open_Cart_Register_Page(Driver_Obj);
		
		Registration_Page_Obj.F_Input_First_Name(String_Generator_Obj.Name_Generator());

		Registration_Page_Obj.F_Input_Last_Name(String_Generator_Obj.Name_Generator());
		
		Registration_Page_Obj.F_Input_Email(String_Generator_Obj.Email_And_Password_Generator()+".com");
		
		Registration_Page_Obj.F_Input_Telephone(String_Generator_Obj.Telephone_Generator());
		
		String Temp_Password = String_Generator_Obj.Email_And_Password_Generator();
		
		Registration_Page_Obj.F_Input_Password(Temp_Password);
		
		Registration_Page_Obj.F_Confirm_Input_Password(Temp_Password);

		Registration_Page_Obj.F_Radio_Btn_Yes();
		
		Registration_Page_Obj.F_checkbox_Privacy_Policy();
		
		Registration_Page_Obj.F_Click_Continue_Btn();	
		
		Assert.assertEquals("http://localhost/opencart/upload/index.php?route=account/success", Driver_Obj.getCurrentUrl());
		
		
	}
	
	

	
	
	
	
	

}
