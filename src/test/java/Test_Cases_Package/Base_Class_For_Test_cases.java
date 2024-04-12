package Test_Cases_Package;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Page_Object_Class.Open_Cart_Account_Login;
import Page_Object_Class.Open_Cart_Home_Page;
import Page_Object_Class.Open_Cart_My_Account;
import Page_Object_Class.Open_Cart_Register_Page;
import Utilities_Class.Random_Data_Generator;

public class Base_Class_For_Test_cases {
	
	WebDriver Driver_Obj;
	Open_Cart_Account_Login Account_Login;
	Open_Cart_Register_Page Registration_Page_Obj;
	Open_Cart_My_Account My_Account;
	Open_Cart_Home_Page Home_Page_Obj;
	User_Details User_Details_Obj;
	Random_Data_Generator String_Generator_Obj=new Random_Data_Generator();
	Properties Properties_Obj= new Properties();
	
	@Parameters({"Browser"})
	@BeforeClass()
	void BeforeClass(String Browsers) throws InterruptedException, IOException
	{
		
		FileReader FileReader_Obj = new FileReader(".\\src\\test\\resources\\config.properties");
		
		Properties_Obj.load(FileReader_Obj); 
		
		switch(Browsers.toLowerCase())
		{
		case("chrome"): Driver_Obj=new ChromeDriver();
						break;
		case("edge"): Driver_Obj=new EdgeDriver();
						break;
		default:System.out.println("No browser matched");
				return;
		}
		
		Driver_Obj.manage().window().maximize();
		Driver_Obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver_Obj.get(Properties_Obj.getProperty("appURL"));
		
		
	}
	
	@AfterClass
	void Afterclass() throws InterruptedException
	{
		//Thread.sleep(6000);
		Driver_Obj.quit();
	}
	
	
	
	
	 class User_Details
	{
		String userName;
		String passWord;
		
		
		 User_Details(String username,String password)
		{
			this.userName=username;
			this.passWord=password;
			
		}

		 
		 String get_username()
				{
			return this.userName;
				}
		 
		 String get_password()
				{
			return this.passWord;
				}
		
		
	}
	
	
		
	@DataProvider(name="Email_Password")
	Object[][] Data_Provider(){
		
		return new Object[][]  {
				{new User_Details("omkarzurange777@gmail.com","123321123")},
				{new User_Details("omkarzurange777@email.com","12332112")}
				
		};
		
	
		
		
	}

}
