package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\BSE\\geckodriver-v0.11.1-win32\\geckodriver.exe");
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.linkedin.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		
		
        // Close the driver
        driver.quit();

	}

}
