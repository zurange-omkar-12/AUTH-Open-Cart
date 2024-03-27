package Page_Object_Class;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Open_Cart_My_Account extends Base_Class_init{
	
	
	
	public Open_Cart_My_Account(WebDriver Driver_Obj)
	{
		super(Driver_Obj);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")WebElement My_Account_Label;
	
	
	public boolean Check_My_Account_Label()
	{
		return My_Account_Label.isDisplayed();
	}
	
	
	
}
