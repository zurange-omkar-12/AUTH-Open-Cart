package Page_Object_Class;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Open_Cart_Home_Page extends Base_Class_init {
	
	WebDriver Driver_Obj;
	
	public Open_Cart_Home_Page(WebDriver Driver_Obj)
	{
		super(Driver_Obj);
	}

	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")  WebElement My_Account;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement Register_Link;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement Login_Link;
	
	
	public String Open_Registration_Page()
	{
		My_Account.click();
		Register_Link.click();
		
		return super.Driver_Obj.getTitle();
		
	}
	
	public void Open_Login_Page()
	{
		My_Account.click();
		Login_Link.click();
		
		//return super.Driver_Obj.getTitle();
		
	}
	
	
	
	
}
