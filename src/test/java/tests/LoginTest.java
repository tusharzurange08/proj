package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login_Page;

public class LoginTest extends BaseTest  {
	
	
	
	@Test
	public void testvalidlogin() {
		
		Login_Page lop=new Login_Page(driver);
		
		lop.enterusername("standard_user");
		lop.enterpassword("secret_sauce");
		lop.clickloginbutton();
		
	
		 
		 Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
			
		
	}
	
	
	
	
}
