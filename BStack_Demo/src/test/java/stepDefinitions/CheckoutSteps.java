package stepDefinitions;

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

public class CheckoutSteps {

	public WebDriver wd;
	
	@Given("User has added product to cart")
	public void User_has_added_product_to_cart() throws InterruptedException
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
		
		//Add first product to cart
		wd.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
//		
	}
	@When("User proceeds to checkout")
	public void User_proceeds_to_checkout() throws InterruptedException
	{
		wd.findElement(By.className("bag__quantity")).click();
		Thread.sleep(2000);
		wd.findElement(By.className("buy-btn")).click();
		Thread.sleep(2000);
	}
	@And("User enters shipping information")
	public void User_enters_shipping_information() throws InterruptedException
	{
		wd.findElement(By.id("firstNameInput")).sendKeys("John");
		Thread.sleep(2000);
		wd.findElement(By.id("lastNameInput")).sendKeys("Doe");
		Thread.sleep(2000);
		wd.findElement(By.id("addressLine1Input")).sendKeys("Navi Mumbai");
		Thread.sleep(2000);
		wd.findElement(By.id("provinceInput")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		wd.findElement(By.id("postCodeInput")).sendKeys("402133");
		Thread.sleep(2000);
		
		
	}
	@And("User places order")
	public void User_places_order() throws InterruptedException
	{
		wd.findElement(By.id("checkout-shipping-continue")).click();
		Thread.sleep(2000);
	}
	@Then("Order should be placed successfully")
	public void Order_should_be_placed_successfully()
	{
		WebDriverWait wait =new WebDriverWait(wd, Duration.ofSeconds(10));
		String confirmation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/div/ol/li/div/div/div[1]/legend"))).getText();
		assertTrue(confirmation.contains("Your Order has been successfully placed."));
		
	}
}


