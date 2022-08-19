package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	@FindBy(id="username")
	private WebElement usernameTb;

	@FindBy(name="pwd")
	private WebElement passwordTb;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setusername(String un)
	{
	usernameTb.sendKeys(un);	
	}
	public void setpwd(String pwd)
	{
	passwordTb.sendKeys(pwd);	
	}
	 public void  clickLogin()
	{
		loginBtn.click();	
	}
	}

