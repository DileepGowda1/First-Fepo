package genericUtility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {


	public WebDriver driver;

		@BeforeSuite
		public void launchBrowser() {
			ChromeOptions options=new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			Reporter.log("Browser is laucnhed",true);
			driver.manage().window().maximize();
			Reporter.log("Window is maximized",true);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@BeforeMethod
		public void NavigatingToApplication() {
			driver.get("http://demowebshop.tricentis.com/");
			Reporter.log("Navigated to application",true);
		}

		@AfterMethod
		public void logoutOperation() {
			System.out.println("logout from app");
			Reporter.log("Logged out from application",true);
		}
		@AfterSuite
		public void tearDownTheBrowser() {
			driver.quit();
			Reporter.log("Quitted the browser",true);
		}
	}

