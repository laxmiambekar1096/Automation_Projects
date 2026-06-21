package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_to_CartSteps {

	public WebDriver wd;
	
	@Given("User is on the application")
	public void User_is_on_the_application() throws InterruptedException
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
	@When("User has added product to the cart")
	public void User_has_added_product_to_the_cart()
	{
		//Add product to cart
		wd.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
			
	}
	@Then("Product should be added successfully")
	public void Product_should_be_added_successfully() {

	    String cartCount = wd.findElement(
	            By.className("bag__quantity"))
	            .getText();

	    assertEquals(cartCount, "1",
	            "Cart count is incorrect");

	    System.out.println("Product added successfully");
	}
}
		
		
	