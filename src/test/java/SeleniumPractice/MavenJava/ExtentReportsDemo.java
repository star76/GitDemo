package SeleniumPractice.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	ExtentReports extent;

	@BeforeTest
	public void config() {
		
		//ExtentReports, ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "JS");
		
	}
	
	@Test
	public void IntialDemo() {
		ExtentTest test = extent.createTest("Intial Demo");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Udemy\\updatedChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Results do not match");// explicitly fails the test case just to check extent report fail functionality in real time we dont do this
		
		extent.flush();
		
	}
}
