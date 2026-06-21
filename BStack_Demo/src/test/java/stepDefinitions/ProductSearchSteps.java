package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import io.cucumber.java.en.*;

public class ProductSearchSteps {
	public WebDriver wd;
	WebDriverWait wait;

    @Given("User is on application")
    public void User_is_on_application() throws InterruptedException {
    	wd=Hooks.wd;
    	wait = new WebDriverWait(wd, Duration.ofSeconds(10));
    	wd.get("https://bstackdemo.com/");
    }

    @When("User searches for {string}")
    public void User_searches_for(String productName) {
    	wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/input")).sendKeys(productName);
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/button")).click();
    }

    @Then("Matching {string} products should be displayed")
    public void Matching_products_should_be_displayed(String expectedProduct) {
    	String resultText=wd.findElement(By.xpath("//*[@id=\"2\"]/p")).getText();
		assertTrue(resultText.contains(expectedProduct));
		System.out.println("Product search Test case with valid data is PASS");

    }
}