package qa.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import qa.util.TestUtil;
import qa.util.EventListener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase2 {

	
	public  static Properties prop;
	public String filePath = "./src/main/java/qa/config/config.properties";
	//protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public static WebDriver driver1;
    public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	public static EventFiringWebDriver e_driver;
	public static EventListener eventListener;
	
	
	public TestBase2() {

		BufferedReader reader;

		prop = new Properties();

		try {
			reader = new BufferedReader(new FileReader(filePath));
			prop.load(reader);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
//	@BeforeSuite
	public void generateExtentReport() {
		
		System.out.println("Test Report :::::>>>>> Started");
	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/Triphobo.html");
		
		extent =new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Shubham Gupta");
		htmlReporter.config().setDocumentTitle("Title of the Report Comes here ");
		// N9667876ame of the report
		htmlReporter.config().setReportName("Name of the Report Comes here ");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	
	public  static void initialize() {
		
		
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver1=new ChromeDriver();
			//driver.set(ThreadGuard.protect(new ChromeDriver()));
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		
		//Code to register Events
		//e_driver = new EventFiringWebDriver(driver1);
		//eventListener = new EventListener();
		//e_driver.register(eventListener);
		//driver1 = e_driver;
		
		
	
		
		driver1.manage().window().maximize();
		
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		driver1.get(prop.getProperty("Url"));
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver1.close();
	}

}
