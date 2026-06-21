package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Features/Login_Logout.feature",

glue = {"stepDefinitions","hooks"},

plugin = {
"pretty",
"html:target/LogoutReport.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)
public class LoginLogoutRunner
extends AbstractTestNGCucumberTests {

}