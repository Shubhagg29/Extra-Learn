package qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.base.TestBase2;
import qa.pages.PlanVacation;
import qa.pages.PlanVacation2;

public class PlanVacationTest3 extends TestBase2 {

	public PlanVacation2 planVacation1;

	public PlanVacationTest3() {
		super();

	}

	@BeforeMethod
	public synchronized void setup() {
       System.out.println("PAGE Factory Initialized::");
		initialize();
		planVacation1=new PlanVacation2();
		//planVacation1 = PageFactory.initElements(driver1, PlanVacation2.class);

	}

	
	@Test
	public  void homePageTitleTest() {
	//test = extent.createTest("Verify title");
		String title = planVacation1.verifyHomePageTitle();
		//test.log(Status.PASS, "Title Verified");
		Assert.assertEquals(title, "Vacation Planner for Your Holidays: TripHobo");
		
		
		
		
	}

      @Test
	  public  void clickplanvacation() {

		//test = extent.createTest("Plan Vacation Test");
		planVacation1.clickPlanNextVacation();

		//test.log(Status.PASS, "Plan Vacation Clicked");
		planVacation1.EnterLocation();
		
		
		planVacation1.enterDate();
		//test.log(Status.PASS, "Date Entered");
		Reporter.log("Message to verify Condition -->> >>> >>>>++++++");
		planVacation1.clickStartPlanning();
		
	
	}

    
	
}
