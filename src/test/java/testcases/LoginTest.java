package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void LoginSuccessTest() {
	
		LoginPage login=new LoginPage();
		login.LoginFunction("standard_user", "secret_sauce");
		System.out.println("Login Success");
	}
	
	@Test
	public void LoginFailureTest() {
		LoginPage login=new LoginPage();
		login.LoginFunction("standard_user1", "saucelabs1");
		WebElement errorMsg=driver.findElement(By.xpath("//div[@class='error-message-container error']//h3"));
		String ActualMsg=errorMsg.getText();
		String ExpectedMsg="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		System.out.println("Login Failure");
	}
}
