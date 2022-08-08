package qa.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.DriverFactory;
import qa.base.TestBase;
import qa.base.TestBase2;
import qa.pages.PlanVacation;

public class PlanVacationTest extends TestBase {

	public PlanVacation planVacation;

	public PlanVacationTest() {

		super();

	}

	@BeforeMethod
	public void setup() {

		initialize();
		getDriver().get(prop.getProperty("Url"));
		planVacation = new PlanVacation();

	}

	@Test(priority = 1)
	public void homePageTitleTest() {
		// test = extent.createTest("Verify title");
		String title = planVacation.verifyHomePageTitle();
		// test.log(Status.PASS, "Title Verified");
		Assert.assertEquals(title, "Vacation Planner for Your Holidays: TripHobo");

	}

	@Test
	public void clickplanvacation() {

		// test = extent.createTest("Plan Vacation Test");
		planVacation.clickPlanNextVacation();

		// test.log(Status.PASS, "Plan Vacation Clicked");
		planVacation.EnterLocation();

		planVacation.enterDate();
		// test.log(Status.PASS, "Date Entered");
		Reporter.log("Message to verify Condition -->> >>> >>>>++++++");
		planVacation.clickStartPlanning();

	}

}
