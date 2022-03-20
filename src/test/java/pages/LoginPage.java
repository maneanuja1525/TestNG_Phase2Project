package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

	WebDriver driver=BaseClass.driver;
	ExtentTest test=BaseClass.test;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void LoginFunction(String usernameVal, String passwordVal) {
	
		username.sendKeys(usernameVal);
		test.log(LogStatus.PASS, "Enter Username", "Username Entered Successfully");
		password.sendKeys(passwordVal);
		test.log(LogStatus.PASS, "Enter Password", "Password Entered Successfully");
		loginButton.click();
		test.log(LogStatus.PASS, "click Login Button", "Login Button Clicked Successfully");
	}
	
}
