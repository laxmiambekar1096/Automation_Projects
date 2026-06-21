package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

public WebDriver wd;
WebDriverWait wait;
@Given("User opens login page")
public void User_opens_login_page()
{
	wd=Hooks.wd;
	wait = new WebDriverWait(wd, Duration.ofSeconds(10));
	wd.get("https://bstackdemo.com/");
}
@When("User enters username and password")
public void User_enters_username_and_password() throws InterruptedException
{
	//By signIn = By.id("signin");
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
}
@And("Clicks on login button")
public void Clicks_on_login_button() throws InterruptedException
{
	// Login button
    wait.until(ExpectedConditions.elementToBeClickable(
            By.id("login-btn")))
            .click();
    Thread.sleep(2000);
}
@Then("User is redirected to dashboard or home page")
public void User_is_redirected_to_dashboard_or_home_page() throws InterruptedException
{
	String ExpenctedUrl="https://bstackdemo.com/?signin=true";
	String ActualUrl=wd.getCurrentUrl();
	Assert.assertEquals(ActualUrl, ExpenctedUrl);
	System.out.println("The Url of your website is "+ActualUrl+" \n Login Test case is Pass ");
	Thread.sleep(2000);
	//wd.close();
}

}


