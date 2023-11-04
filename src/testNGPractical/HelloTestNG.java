package testNGPractical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloTestNG {
	
	//Global variable declaration
	public String baseURL="https://www.sliit.lk/";
	public String driverPath="D:\\Eclipse-workplace\\SQA_Batch26_TestNG\\Thirdparty_Resource_Files\\Chrome Driver\\V118.exe";
	public WebDriver driver;
	
	//Before test
	@BeforeTest
	public void beforeTestExecution()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	
	//Test case/s
	@Test(invocationCount=1)
	public void callingURL()
	{
		System.out.println("Hello to TestNG");
	}
	
	//After test
	@AfterTest
	public void AfterTestExecutionProcess()
	{
		driver.quit();
	}
 
  
}
