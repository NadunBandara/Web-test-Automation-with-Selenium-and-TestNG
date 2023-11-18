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
import java.util.List;
import java.util.concurrent.TimeoutException;

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
	/*
	@Test(priority=1)
	public void FailedUserLoginFunction1() throws Exception
	{
		System.out.println("---------------TC 001---------------");
		
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		
		//find the username 
		WebElement user_name = driver.findElement(By.id("user-name"));
		user_name.sendKeys("standard_user");
		
		Thread.sleep(2000);
		//find the password 
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234");
		
		//find the login button
		Thread.sleep(1000);
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		// Check if the error message is present
		WebElement errorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
		
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
		
	}
	
	//Test Case 003: Icorrect un & Correct PW
	@Test(priority=3)
	public void FailedUserLoginFunction3() throws Exception {
		System.out.println("---------------TC 003---------------");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//find the username 
		WebElement user_name = driver.findElement(By.id("user-name"));
		user_name.sendKeys("nadun");
		
		Thread.sleep(2000);
		//find the password 
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		//find the login button
		Thread.sleep(1000);
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		// Check if the error message is present
		WebElement errorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
		
		if(errorMessage.isDisplayed()) {
			System.out.println("Test Case 003:Passed");
			System.out.println("Login Failed");
			
			// Take a screenshot of the error
			this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Login_Error3.png");
			
		}
		else {
			System.out.println("Test Case 003: Faield");
			System.out.println("Login Passed");
		}
		
	}
	

		//Test Case 004: Correct UN & PW
		@Test(priority=4)
		public void SuccessUserLoginFunction() throws Exception {
			System.out.println("---------------TC 004---------------");
			
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			//find the username 
			WebElement user_name = driver.findElement(By.id("user-name"));
			user_name.sendKeys("standard_user");
			
			Thread.sleep(2000);
			//find the password 
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			
			//find the login button
			Thread.sleep(1000);
			WebElement loginbtn = driver.findElement(By.id("login-button"));
			loginbtn.click();
			Thread.sleep(2000);
			
			// Check if the error message is present
			String expected_url = "https://www.saucedemo.com/inventory.html";
			String actual_url = driver.getCurrentUrl();
			
			if(expected_url.equals (actual_url)) {
				
				System.out.println("Test Case 004:Passed");
				System.out.println("Login Passed");
				// Take a screenshot of the expected page
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Login_Success.png");
				
			}
			else {
				
				System.out.println("Test Case 004: Faield");
				System.out.println("Login Failed");
				
			}
			
		}
		*/
		
		//Test Case 005: Verify the loaded page
		@Test(priority=5)
		public void VerifyLoadedResult() throws Exception {
			System.out.println("---------------TC 005---------------");
			UserLogin();
			Thread.sleep(2000);
			
			//Find all product list
			List<WebElement> product_items = driver.findElements(By.className("inventory_item"));
			
			//expected product count that display on page
			int expected_product_count = 6;
			
			//check the actual result match with expected result
			if(product_items.size()== expected_product_count) {
				
				System.out.println("Test Case 005:Passed");
				System.out.println("Display all Products");
				
				// Take a screenshot of the product that displayed
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Display_Products.png");
				
			}
			else {
				
				System.out.println("Test Case 005: Faield");
				System.out.println("All products are not displayed");
				
			}
		}
		
		//Test Case 006: Verify products text is displayed
		@Test(priority=6)
		public void VerifyHeaderText() throws Exception {
			System.out.println("---------------TC 006---------------");
			Thread.sleep(2000);
			
			WebElement elementhead = driver.findElement(By.className("title"));
			elementhead.getText();	
					
			//Find all product list
			//String expected_title = "Products";
			//String actual_title = driver.getTitle();	
					
			//check the product text displayed or not
			  if (elementhead.isDisplayed()) {
				System.out.println("Test Case 006:Passed");
				System.out.println("Display expected text on page header" );
						
				// Take a screenshot of the text
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Display_Products(text).png");
						
			}
			else {
						
				System.out.println("Test Case 006: Faield");
				System.out.println("Expected text is not displayed");
						
			}
	}
		//Test Case 007: Verify products text is displayed
		@Test(priority=7)
		public void VerifyPageTitle() throws Exception {
			System.out.println("---------------TC 007---------------");
			Thread.sleep(2000);
					
			//Find the page title
			String expected_title = "Swag Labs";
			
			String actual_title = driver.getTitle();	
					
			//check whether the actual title is match to the expected title
			  if (expected_title.equals(actual_title)) {
				System.out.println("Test Case 007:Passed");
				System.out.println("Display the expected tile" );
						
				// Take a screenshot of the title
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Display_Title.png");
						
			}
			else {		
				System.out.println("Test Case 007: Faield");
				System.out.println("Expected title is not displayed");						
			}
	}
		
		/*//Test Case 008: Add to cart button transition
		@Test(priority = 8)
		public void ButtonTrasition() throws Exception {
		    System.out.println("---------------TC 008---------------");
		    Thread.sleep(2000);

		    WebElement addcart_btn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		    addcart_btn.click();

		    // Wait for the Remove button to be clickable
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement remove_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("remove-sauce-labs-backpack")));

		    remove_btn.click();
		    Thread.sleep(2000);

		    if (remove_btn.isDisplayed()) {
		        System.out.println("Test Case 008: Passed");
		        System.out.println("Add to Cart button is changed to Remove Button");

		        // Take a screenshot of the title
		        this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Button_Change.png");

		    } else {
		        System.out.println("Test Case 008: Failed");
		        System.out.println("Button is not changed");
		    }
		}*/
		
		//Test Case 008: Add to cart button transition
		@Test(priority = 8)
		public void ButtonTrasition() throws Exception {
		    System.out.println("---------------TC 008---------------");
		    //Thread.sleep(2000);

		    WebElement addcart_btn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		    addcart_btn.click();
		    Thread.sleep(5000);
		    
		    //Button change find handling
		    try {
		    	WebElement remove_btn = driver.findElement(By.id("remove-sauce-labs-backpack"));
		    	
		    	if (remove_btn.isDisplayed()) {
			        System.out.println("Test Case 008: Passed");
			        System.out.println("Add to Cart button is changed to Remove Button");

			        // Take a screenshot of the title
			        this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Button_Change.png");

			    } else {
			        System.out.println("Test Case 008: Failed");
			        System.out.println("Button is not changed");
			    }
		    	
		    }catch (TimeoutException e){
		    	 System.out.println("Test Case 008: Failed");
		         System.out.println("Remove button not found");	    	
		    }
	    
		}
		
		//Test Case 009: Verify the cart icon count is not 0
		@Test(priority=9)
		public void CartItemCount() throws Exception {
		    System.out.println("---------------TC 009---------------");
		    
		    //Identify the cart count
		    WebElement cartcount = driver.findElement(By.className("shopping_cart_badge"));
		    
		    //check the cart whether empty or not
		    if(cartcount.getText().equals("1")) {
		    	
		    	System.out.println("Test Case 009: Passed");
		        System.out.println("Cart is not empty");

		        // Take a screenshot of the title
		        this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Cartcount.png");
		    	
		    }else {
		    	System.out.println("Test Case 009: Failed");
		        System.out.println("Cart is empty");
		    }
	    
		}
		
		//Test Case10: Click on cart icon
		@Test(priority=10)
		public void ClickcartIcon() throws Exception {
		    System.out.println("---------------TC 010---------------");
		    
		    //Identify the cart icon and click
		    WebElement carticon = driver.findElement(By.xpath("html/body/div/div/div/div[1]/div[1]/div[3]/a"));
		    carticon.click();
		    
		    //Set target url
		    String expected_url = "https://www.saucedemo.com/cart.html";
		    String actual_url = driver.getCurrentUrl();
		    
		    //compare the expected and actual urls
		    if(expected_url.equals(actual_url)) {
		    	
		    	System.out.println("Test Case 010: Passed");
		        System.out.println("Successfully load the target page");

		        // Take a screenshot of the target page
		        this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\After_Click_Cart_Icon.png");
		    	
		    }else {
		    	System.out.println("Test Case 010: Failed");
		        System.out.println("Target page is not load");
		    }
		}
		
		//Test Case 011: Verify the display "Your Cart" cart page header 
		@Test(priority=11)
		public void VerifyCartHeaderText() throws Exception {
			System.out.println("---------------TC 011---------------");
			Thread.sleep(2000);
			
			//find header text called "Your Cart"
			WebElement elementheadtxt = driver.findElement(By.className("title"));
			elementheadtxt.getText();	
					
			//check the text displayed or not
			  if (elementheadtxt.isDisplayed()) {
				System.out.println("Test Case 011:Passed");
				System.out.println("Displayed the expected text on page header: " + elementheadtxt.getText() );		
				// Take a screenshot of the text
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Display_YourCart.png");					
			}
			else {		
				System.out.println("Test Case 011: Faield");
				System.out.println("Expected text is not displayed");			
			}
	}
		//Test Case 012: Verify all the details of item is display on the page
		@Test(priority=12)
		public void VerifyItemDetails() throws Exception {
			System.out.println("---------------TC 012---------------");
			
			//Identify the product name and description
			WebElement product_name = driver.findElement(By.className("inventory_item_name"));
			WebElement product_dsc = driver.findElement(By.className("inventory_item_desc"));
					
			//check the text displayed or not
			  if ((product_name != null) && (product_dsc != null)) {
				System.out.println("Test Case 012:Passed");
				System.out.println("Item details are display on the page" );		
				// Take a screenshot of the text
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Item_Details.png");					
			}
			else {		
				System.out.println("Test Case 011: Faield");
				System.out.println("Item details are not display on the page");			
			}
	}
		//Test Case: Verify the item price
		/*@Test(priority=13)
		public void VerifyItemPrice() throws Exception {
			System.out.println("---------------TC 012---------------");
			
			//Identify the product name and description
			WebElement product_name = driver.findElement(By.className("inventory_item_name"));
			WebElement product_dsc = driver.findElement(By.className("inventory_item_desc"));
					
			//check the text displayed or not
			  if ((product_name != null) && (product_dsc != null)) {
				System.out.println("Test Case 012:Passed");
				System.out.println("Item details are display on the page" );		
				// Take a screenshot of the text
				this.takeSnapShot(driver, "C:\\Users\\user\\Desktop\\SS\\Item_Details.png");					
			}
			else {		
				System.out.println("Test Case 011: Faield");
				System.out.println("Item details are not display on the page");			
			}
	}*/
		
		

	
	//After test
	@AfterTest
	public void AfterTestExecutionProcess() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();//close the browser
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
		  
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		  
		//Copy file at destination
		//FileUtil.copy(SrcFile, DestFile);
		Files.copy(SrcFile, DestFile);
	}
	
	public void UserLogin() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
		
		//find the username & password
		WebElement user_name = driver.findElement(By.id("user-name"));
		user_name.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		//find the login button
		Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		Thread.sleep(3000);
		
		
	}
 
  
}
