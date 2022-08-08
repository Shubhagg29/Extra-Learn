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
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import qa.util.EventListener;
import qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public  static Properties prop;
	public String filePath = "./src/main/java/qa/config/config.properties";
	public static  ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	//public static WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	public static EventFiringWebDriver e_driver;
	public static EventListener eventListener;
	
	
	public TestBase() {

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
	
	
	public static WebDriver initialize() {
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
			driver.set(new ChromeDriver());
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		
		//Code to register Events
		e_driver = new EventFiringWebDriver(getDriver());
		eventListener = new EventListener();
		e_driver.register(eventListener);
	
		//driver=(ThreadLocal<WebDriver>) e_driver;
		
		
	
		
		getDriver().manage().window().maximize();
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		//getDriver().get(prop.getProperty("Url"));
		
		return getDriver();
		
	}
	
	
	public  static synchronized WebDriver getDriver() 
	{
		return driver.get();
	}
	
	
	public static void getScreenShot() {
		
		TakesScreenshot sc=  ((TakesScreenshot)getDriver());
	File SrcFile=	sc.getScreenshotAs(OutputType.FILE);
	
	String destination = System.getProperty("user.dir") + "/test-output/abc.png";
	File finaldestination = new File(destination);
	try {
		FileUtils.copyFile(SrcFile, finaldestination);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
		
	}

	@AfterMethod
	public void removeDriver() {
		getDriver().quit();
		driver.remove();
	}
}
