package DesiredCapabilities_CrossBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

class baseclass {
	public WebDriver initializebrowser(String browsername, String drivertype) throws MalformedURLException {
		WebDriver driver = null;

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions Options = new ChromeOptions();
			// To run in incognito mode
			// Options.addArguments("--incognito");

			// for security purposes
			// Options.addArguments("--no-sandbox");

			// To run with maximized window mode
			// Options.addArguments("start-maximized");

			// To do headless browser mode
			// Options.addArguments("--headless");
			// Options.addArguments("--disable-gpu);

			// To add new extensions in chrome
			// Options.addExtensions(new File("/Path/to/extension.crx"));

			// To add binary path if it throws any binary exception
			// Options.setBinary(new File("/Path/to/Chrome"));

			// To accept untrusted SSSL certificate
			Options.setAcceptInsecureCerts(true);

			// To disable info-bar
			// Options.addArguments("disabe-infobars");

			// To block Block dialog windows
			// Options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

			// To remove the Automation pop up
			Options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

			// TO change the window size
			// Options.addArguments("window-size=400,600");

			// "Remotedriver" run in Selenium grid
			if (drivertype.equalsIgnoreCase("remote")) {// To setCapability
				Options.setCapability("browserName", "chrome");
				Options.setCapability("platformName", "Windows 11");
				try {
					driver = new RemoteWebDriver(new URL("http://localhost:4444"), Options);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			} // else "webdriver" run in local machine
			else {
				try {
					driver = new ChromeDriver(Options);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions Options= new FirefoxOptions();
			// To run in incognito mode
			// Options.addArguments("--incognito");

			// for security purposes
			// Options.addArguments("--no-sandbox");

			// To run with maximized window mode
			// Options.addArguments("start-maximized");

			// To do headless browser mode
			// Options.addArguments("--headless");
			// Options.addArguments("--disable-gpu);

			// To add new extensions in chrome
			// Options.addExtensions(new File("/Path/to/extension.crx"));

			// To add binary path if it throws any binary exception
			// Options.setBinary(new File("/Path/to/Chrome"));

			// To accept untrusted SSSL certificate
			// Options.setAcceptInsecureCerts(true);

			// To disable info-bar
			// Options.addArguments("disabe-infobars");

			// To block Block dialog windows
			// Options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

			// To remove the Automation pop up
			//Options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

			// TO change the window size
			// Options.addArguments("window-size=400,600");

			// "Remotedriver" run in Selenium grid
			if (drivertype.equalsIgnoreCase("remote")) {// To setCapability
				Options.setCapability("browserName", "firefox");
				Options.setCapability("platformName", "Windows 11");
				try {
					driver = new RemoteWebDriver(new URL("http://localhost:4444"), Options);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
			// else "webdriver" run in local machine
			else {
				try {
					driver = new FirefoxDriver(Options);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions Options = new EdgeOptions();
			// To run in incognito mode
			// Options.addArguments("--incognito");

			// for security purposes
			// Options.addArguments("--no-sandbox");

			// To run with maximized window mode
			// Options.addArguments("start-maximized");

			// To do headless browser mode
			// Options.addArguments("--headless");
			// Options.addArguments("--disable-gpu);

			// To add new extensions in chrome
			// Options.addExtensions(new File("/Path/to/extension.crx"));

			// To add binary path if it throws any binary exception
			// Options.setBinary(new File("/Path/to/Chrome"));

			// To accept untrusted SSSL certificate
			// Options.setAcceptInsecureCerts(true);

			// To disable info-bar
			// Options.addArguments("disabe-infobars");

			// To block Block dialog windows
			// Options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

			// To remove the Automation pop up
			Options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

			// TO change the window size
			// Options.addArguments("window-size=400,600");

			// "Remotedriver" run in Selenium grid
			if (drivertype.equalsIgnoreCase("remote")) {// To setCapability
				Options.setCapability("browserName", "MicrosoftEdge");
				Options.setCapability("platformName", "Windows 11");
				try {
					driver = new RemoteWebDriver(new URL("http://localhost:4444"), Options);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
			// else "webdriver" run in local machine
			else {
				try {
					driver = new EdgeDriver(Options);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} else if (browsername.equalsIgnoreCase("internetexplorer")) {
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions Options= new InternetExplorerOptions();
			
			if (drivertype.equalsIgnoreCase("remote")) {	
			Options.setCapability("browserName", "internet explorer");
			Options.setCapability("platformName", "Windows 11");
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444"), Options);
			
			} catch (MalformedURLException e) {
						e.printStackTrace();
			}
			}
			else {
				try {
					driver = new InternetExplorerDriver(Options);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return driver;
	}

}
