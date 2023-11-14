package testNGPractical;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.google.common.io.Files;

public class Individual_Assignment {
	
	//Global variable declaration
	public String baseURL="https://www.saucedemo.com/";
	public String driverPath="D:\\Eclipse-workplace\\SQA_Batch26_TestNG\\Thirdparty_Resource_Files\\Chrome Driver\\V119.exe";
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
	
	//Test cases
	//Test case 001 : Incorrect UN & PW
	@Test(priority=1)
	public void FailedUserLoginFunction1() throws Exception
	{
		System.out.println("---------------TC 001---------------");
		
		Thread.sleep(1000);
		//find the username 
		WebElement user_name = driver.findElement(By.id("user-name"));
		user_name.sendKeys("Nadun");
		Thread.sleep(1000);
		
		//find the password 
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		Thread.sleep(1000);
		
		//find the login button
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(1000);
		
		// Check if the error message is present
		WebElement errorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
		
		if(errorMessage.isDisplayed()) {
			System.out.println("Test Case 001:Passed");
			System.out.println("Login Failed");
			
			// Take a screenshot of the error
			this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Login_Error1.png");
			
		}
		else {
			System.out.println("Test Case 001: Faield");
			System.out.println("Login Passed");
		}
		
	}
	
	//Test case 002 : Correct UN, Incorrect PW
	@Test(priority=2)
	public void FailedUserLoginFunction2() throws Exception {
		System.out.println("---------------TC 002---------------");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		//find the username 
		WebElement user_name = driver.findElement(By.id("user-name"));
		user_name.sendKeys("standard_user");
		
		Thread.sleep(1000);
		//find the password 
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234");
		
		//find the login button
		Thread.sleep(1000);
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Check if the error message is present
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")));
		
		if(errorMessage.isDisplayed()) {
			System.out.println("Test Case 002:Passed");
			System.out.println("Login Failed");
			
			// Take a screenshot of the error
			this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Login_Error2.png");
			
		}
		else {
			System.out.println("Test Case 002: Faield");
			System.out.println("Login Passed");
		}
		
		user_name.clear();
		password.clear();
	}
	
	
	//After test
	@AfterTest
	public void AfterTestExecutionProcess() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();//close the browser
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		  
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		  
		//Copy file at destination
		//FileUtil.copy(SrcFile, DestFile);
		Files.copy(SrcFile, DestFile);
	}
 
  
}
