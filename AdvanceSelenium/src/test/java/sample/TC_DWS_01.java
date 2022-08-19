package sample;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.Login;
import genericUtility.UtiliotyClass;
import objectRepository.LoginPage;

public class TC_DWS_01 extends BaseClass {
	@Test
	public void Validate_whether_user_can_login_through_invalid_credentials() throws IOException {
		LoginPage LoginPage =new LoginPage(driver);
		String ExpectedTitle="Demo Web Shop1";
		UtiliotyClass utility=new UtiliotyClass();
		LoginPage.getLoginLink().click();
		Reporter.log("Clicked on Login button",true);
		
		LoginPage.getEmailTextField().sendKeys(utility.propertyFileReader("username"));
		assertEquals(utility.propertyFileReader("username"), LoginPage.getEmailTextField().getAttribute("value"), "Email Adderss is not proper");
		Reporter.log("Succesfully entered email adderss",true);
		
		LoginPage.getPasswordTextField().sendKeys(utility.propertyFileReader("password"));
		assertEquals(utility.propertyFileReader("password"), LoginPage.getPasswordTextField().getAttribute("value"), "password is not proper");
		Reporter.log("Succesfully entered email adderss",true);
		
		LoginPage.getLoginButton().click();
		Reporter.log("Succesfully Logged in to the application",true);
		assertNotEquals(ExpectedTitle, driver.getTitle(),"Test case failed");
	}
	}

