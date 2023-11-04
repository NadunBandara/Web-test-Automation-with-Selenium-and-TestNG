package testNGPractical;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationPriority {
 
	@Test(priority=3)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(priority=1)
	public void CallingBrowser() {
		System.out.println("Calling Browser");
	}
	
	@Test(priority=2)
	public void Profile() {
		System.out.println("Profile");
	}
	

}
