package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Features/Add_to_Cart.feature",

glue = {"stepDefinitions","hooks"},

plugin = {
"pretty",
"html:target/Add_to_CartReport.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)
public class Add_to_CartRunner
extends AbstractTestNGCucumberTests {

}