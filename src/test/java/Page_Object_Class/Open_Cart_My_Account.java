package Page_Object_Class;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Open_Cart_My_Account extends Base_Class_init{
	
	
	
	public Open_Cart_My_Account(WebDriver Driver_Obj)
	{
		super(Driver_Obj);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")WebElement My_Account_Label;
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement nav_My_Account;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")WebElement nav_Logout;
	
	
	public boolean Check_My_Account_Label()
	{
		return My_Account_Label.isDisplayed();
	}
	
	public void Click_Logout()
	{
		nav_My_Account.click();
		nav_Logout.click();
	}
	
	
}
