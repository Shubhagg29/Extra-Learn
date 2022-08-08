package qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.base.TestBase;
import qa.base.TestBase2;
import qa.util.TestUtil;

public class PlanVacation2 extends TestBase2 {

	@FindBy(id = "plan-my-trip")
	WebElement PlanTrip;

	@FindBy(xpath = "//*[@placeholder='Where do you want to go?']")
	WebElement vacationlocation;

	@FindBy(xpath = "//ul[@class='city-list-collection']/li")
	private List<WebElement> cityList;

	//@FindBy(className = "//span[@class='start-date-control']")
	@FindBy(className="start-date-control")
	WebElement startdate;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	private List<WebElement> startdateList;

	//@FindBy(xpath = "//span[@class='end-date-control']")
	@FindBy(className = "end-date-control")
	WebElement enddate;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	private List<WebElement> endDateList;

	@FindBy(xpath = "//*[@class='button p-color full-width start-planning']")
	WebElement StartPlanning;

	
	public PlanVacation2() {
		
		PageFactory.initElements(driver1, this);
	}

	// actions

	public String verifyHomePageTitle() {
		return driver1.getTitle();
	}

	public void clickPlanNextVacation() {

		PlanTrip.click();
	}

	public void EnterLocation() {

		
		System.out.println(vacationlocation);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		WebElement location = driver1.findElement(By.xpath("//input[@placeholder='Where do you want to go?']"));
		js.executeScript("arguments[0].click()", location);

		location.sendKeys("hou");

		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		for (WebElement item : cityList) {

			if (item.getText().equalsIgnoreCase("Houston, Texas, United States")) {

				item.click();

			}

		}
		System.out.println("Element Location Detected");

	}

	public void enterDate() {
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		startdate.click();

		for (int i = 0; i < startdateList.size(); i++) {
			int flag = 0;
			if (startdateList.get(i).getText().equalsIgnoreCase("24"))

			{

				startdateList.get(i).click();
				flag = 1;
				break;
			}

			if (flag == 1)
				break;
		}

		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		enddate.click();
		for (int i = 0; i < endDateList.size(); i++) {

			int flag = 0;
			if (endDateList.get(i).getText().equalsIgnoreCase("28"))

			{
				endDateList.get(i).click();
				flag = 1;
				break;
			}

			if (flag == 1)
				break;
		}

	}

	public void clickStartPlanning() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		
		js.executeScript("arguments[0].click()", StartPlanning);
	//	StartPlanning.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement text = driver1.findElement(By.className("screen-title"));
		String abc = text.getText();
		System.out.println(abc);
		Assert.assertEquals(abc, "Select duration for your cities");
		//System.out.println(abc);
	}

	}
