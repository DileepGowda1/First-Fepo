package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc4_Test {
	@Test
		public void swiggy()
		 {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.swiggy.com/");
		 }

}

