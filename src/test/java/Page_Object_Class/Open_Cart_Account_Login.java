package Page_Object_Class;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Open_Cart_Account_Login extends Base_Class_init {
	

	public Open_Cart_Account_Login(WebDriver Driver_Obj)
	{
		super(Driver_Obj);
	}
	
	
	
	@FindBy(xpath="//input[@id='input-email']") WebElement Enter_Email;
	@FindBy(xpath="//input[@id='input-password']") WebElement Enter_Password;
	@FindBy(xpath="//input[@value='Login']") WebElement Click_Login;
	
	
	
	public void Login(String Email,String Password)
	{
		Enter_Email.sendKeys(Email);
		Enter_Password.sendKeys(Password);
		Click_Login.click();
	}
	
	
	
}
