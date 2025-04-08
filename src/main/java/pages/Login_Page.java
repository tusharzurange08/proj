package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
	  WebDriver driver;
	
	private By uname=By.id("user-name");
	private By pwd=By.id("password");
	private By loginbutton=By.id("login-button");
	
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void enterusername(String username)
	{
		driver.findElement(uname).sendKeys(username);
		
	}
		
	
	public void enterpassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void clickloginbutton()
	{
		driver.findElement(loginbutton).click();
	}
}
