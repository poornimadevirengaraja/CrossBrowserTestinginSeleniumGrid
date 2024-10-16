package DesiredCapabilities_CrossBrowser;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//C:\seleniumjarfiles go to this location selenium-server-4.25.0 location jar files and run cmd 
//java -jar selenium-server-<version>.jar standalone
//java -jar selenium-server-4.25.0.jar standalone to install selnium grid


public class FirefoxOptions extends baseclass {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
	 driver = initializebrowser("firefox","");
	}
	
	@Test
	public void testonchrome() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+"from firefox");
		System.out.println(driver.getCurrentUrl()+"from firefox");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
