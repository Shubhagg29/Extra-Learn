package qa.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	protected static ThreadLocal<WebDriver> threadLocalDriver =  new ThreadLocal<WebDriver>();
	
	
	@BeforeMethod
	public static void setDriver() {
		System.out.println("Thread Information ::" + Thread.currentThread());
		WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		threadLocalDriver.set(new ChromeDriver());
	}
	
	
	public static WebDriver getDriver() {
		return threadLocalDriver.get();
	}	

	@AfterMethod
	public void removeDriver() {
		getDriver().quit();
		threadLocalDriver.remove();
	}
}
