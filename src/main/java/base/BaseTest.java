package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	 protected WebDriver driver ;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void teardown()
	{
	//	driver.quit();
	}
}
