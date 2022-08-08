package qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import qa.base.DriverFactory;
import qa.base.TestBase;
import qa.pages.PlanVacation;

public class ExecuteTest extends TestBase {
	
	@BeforeMethod
	public void setup() {

		initialize();

		getDriver().get(prop.getProperty("url1"));

	}
	
	@Test
	public void searchTest1() throws InterruptedException {
		
		//getDriver().get("https://www.google.com");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.name("q")).sendKeys("Selenium Training");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}	
	
	@Test
	public void searchTest2() throws InterruptedException {		
		//getDriver().get("https://www.google.com");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.name("q")).sendKeys("Java Training");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	

	@Test
	public void searchTest3() throws InterruptedException {		
		//getDriver().get("https://www.google.com");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.name("q")).sendKeys("UFT Training");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	@Test
	public void searchTest4() throws InterruptedException {	
		//getDriver().get("https://www.google.com");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.name("q")).sendKeys("Jenkins Training");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
	}



}
