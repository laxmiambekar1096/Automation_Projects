package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver wd;
	@Before
	public void setup()
	{
		wd=new FirefoxDriver();
		System.out.println("Launching browser..");//launch driver
		wd.manage().window().maximize();
		System.out.println("Browser maximized..");//browser maximize
	}
	
	@After
	public void teardown()
	{
		System.out.println("Closing bowser..");//closing Browser
		wd.quit();
	}

}

