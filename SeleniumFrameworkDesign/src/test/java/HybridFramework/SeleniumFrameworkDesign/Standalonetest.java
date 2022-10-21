package HybridFramework.SeleniumFrameworkDesign;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasses.CheckOutPage;
import pageclasses.ConfirmPage;
import pageclasses.LoginPage;
import pageclasses.MyCartPage;
import pageclasses.ProductCatalogue;
import testcomponents.BaseTest;

public class Standalonetest{

	
	@Test
//	public  void SubmitOrderTest() throws IOException {
//		// TODO Auto-generated method stub
////		SubmitOrder.java
//
//	}

	public static ExtentReports ExtentReportData()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test results");
		
		ExtentReports extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester", "Mubeena");
		return extent;
		
	}
	
//	public   void Demo1()
//	{
//		ExtentReports extent=ExtentReportData();
//		ExtentTest test=extent.createTest("test1");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mubeena\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		extent.flush();
//		
//	}

}
