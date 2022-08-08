package qa.testcases;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.base.TestBase2;
import qa.pages.PlanVacation;

public class PlanVacationTest1 extends TestBase {

	public PlanVacation planVacation;

	public PlanVacationTest1() {
		
		super();

	}

	@BeforeMethod
	public void setup() {
	
		initialize();
		getDriver().get(prop.getProperty("Url"));
		planVacation=  new PlanVacation();

	}

	
	@Test(priority=1)
	public void homePageTitleTest() {
	//test = extent.createTest("Verify title");
		String title = planVacation.verifyHomePageTitle();
		//test.log(Status.PASS, "Title Verified");
		Assert.assertEquals(title, "Vacation Planner for Your Holidays: TripHobo");
		
		
		
	}

     

	
	@Test
	public void searchTest2() throws InterruptedException {		
		getDriver().get("https://www.google.com");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.name("q")).sendKeys("Java Training");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);		
	}
	
   
}
