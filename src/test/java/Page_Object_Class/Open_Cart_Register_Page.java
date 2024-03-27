package Page_Object_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Open_Cart_Register_Page extends Base_Class_init {

	public Open_Cart_Register_Page(WebDriver Driver_Obj) {
		super(Driver_Obj);
		
	}

	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement Input_First_Name;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement Input_Last_Name;
	@FindBy(xpath="//input[@id='input-email']") WebElement Input_Email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement Input_Telephone;
	@FindBy(xpath="//input[@id='input-password']") WebElement Input_Password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement Confirm_Input_Password;
	@FindBy(xpath="//input[@name='newsletter' and @value=1]") WebElement Radio_Btn_Yes;
	@FindBy(xpath="//input[@name='newsletter' and @value=0]") WebElement Radio_Btn_No;
	@FindBy(xpath="//input[@type='checkbox']") WebElement checkbox_Privacy_Policy;
	@FindBy(xpath="//input[@value='Continue']") WebElement Click_Continue_Btn;
	
	
	public void F_Input_First_Name(String Temp)
	{
		Input_First_Name.sendKeys(Temp);
	}
	
	public void F_Input_Last_Name(String Temp)
	{
		Input_Last_Name.sendKeys(Temp);
	}
	
	public void F_Input_Email(String Temp)
	{
		Input_Email.sendKeys(Temp);
	}
	
	public void F_Input_Telephone(String Temp)
	{
		Input_Telephone.sendKeys(Temp);
	}
	public void F_Input_Password(String Temp)
	{
		Input_Password.sendKeys(Temp);
	}
	public void F_Confirm_Input_Password(String Temp)
	{
		Confirm_Input_Password.sendKeys(Temp);
	}
	public void F_Radio_Btn_Yes()
	{
		Radio_Btn_Yes.click();
	}
	public void F_Radio_Btn_No()
	{
		Radio_Btn_No.click();
	}
	public void F_checkbox_Privacy_Policy()
	{
		checkbox_Privacy_Policy.click();
	}
	public void F_Click_Continue_Btn()
	{
		Click_Continue_Btn.click();
	}
	
	
	
	
	
}
