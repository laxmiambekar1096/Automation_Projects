package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Features/Product_Search.feature",

glue = {"stepDefinitions","hooks"},

plugin = {
"pretty",
"html:target/ProductReport.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)
public class ProductSearchRunner
extends AbstractTestNGCucumberTests {

}