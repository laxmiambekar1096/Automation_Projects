package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginLogoutSteps {
	public WebDriver wd;
	@Given("User is logged into application")
	public void User_is_logged_into_application() throws InterruptedException
	{
		wd=Hooks.wd;
		wd.get("https://bstackdemo.com/");
		//Login
		WebDriverWait wait =
	            new WebDriverWait(wd, Duration.ofSeconds(10));
		
		wd.findElement(By.id("signin")).click();
	    // Username dropdown
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
	            .click();

	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//div[text()='demouser']")))
	            .click();

	    // Password dropdown
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("password")))
	            .click();

	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//div[text()='testingisfun99']")))
	            .click();
	 // Login button
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.id("login-btn")))
	            .click();
	    Thread.sleep(2000);
	}
	
	@When("User clicks logout button")
	public void User_clicks_logout_button() throws InterruptedException
	{
		wd.findElement(By.xpath("//*[@id=\"signin\"]")).click();
		Thread.sleep(2000);
	}
	
	@Then("User should logout successfully")
	public void User_should_logout_successfully() throws InterruptedException
	{

		String ExpenctedUrl="https://bstackdemo.com/";
		String ActualUrl=wd.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpenctedUrl);
		System.out.println("The Url of your website is "+ActualUrl+" \n Logout is PASS ");
		Thread.sleep(2000);
	}
}
