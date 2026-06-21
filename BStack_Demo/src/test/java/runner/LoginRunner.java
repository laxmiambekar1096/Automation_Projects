package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Features/Login.feature",

glue = {"stepDefinitions","hooks"},

plugin = {
"pretty",
"html:target/LoginReport.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)
public class LoginRunner
extends AbstractTestNGCucumberTests {

}