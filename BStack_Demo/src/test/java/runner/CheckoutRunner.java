package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Features/Checkout.feature",

glue = {"stepDefinitions","hooks"},

plugin = {
"pretty",
"html:target/CheckoutReport.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)
public class CheckoutRunner
extends AbstractTestNGCucumberTests {

}