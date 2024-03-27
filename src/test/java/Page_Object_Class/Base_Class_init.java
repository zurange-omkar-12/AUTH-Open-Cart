package Page_Object_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Class_init {
	
	WebDriver Driver_Obj;
	
	Base_Class_init(WebDriver Driver_Obj)
	{
		this.Driver_Obj=Driver_Obj;
		PageFactory.initElements(Driver_Obj, this);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
