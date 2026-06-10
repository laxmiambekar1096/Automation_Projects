package helper;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility_Files.ExtentManage_Utility;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	public WebDriver wd;
	public Properties prop;
	public ExtentReports extent;
	public ExtentTest test;
	public static Logger log=LogManager.getLogger(BaseTest.class);
	
  @BeforeSuite
  public void setupReport()
  {
	  extent=ExtentManage_Utility.createInstance();  
	  }
  
  @BeforeMethod
  public void initialize_n_OpenBrowser(Method method)
  {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterSuite
  public void afterSuite() {
  }

}
