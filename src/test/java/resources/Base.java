package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeTest
	public void initializeReporter() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+File.separator+"reports"+File.separator+"HybridFrameworkReports.html"));
		report = new ExtentReports();
		report.attachReporter(reporter);
	}
	
	@BeforeMethod
	public void setupBrowser() throws IOException {
		prop = new Properties();
		FileInputStream f = new FileInputStream(".\\src\\test\\java\\resources\\data.properties");
		prop.load(f);
		setupDriver(prop.getProperty("browser"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		
		Helper helper = new Helper();
		if(result.getStatus() == ITestResult.FAILURE) {
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(helper.captureScreenshot(driver)).build());
		}
		else if(result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(helper.captureScreenshot(driver)).build());
		}
		driver.close();
	}
	
	@AfterTest
	public void afterTestTeardown() {
		report.flush();
	}
	
	public void setupDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers.geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\drivers.msedgedriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	
}
