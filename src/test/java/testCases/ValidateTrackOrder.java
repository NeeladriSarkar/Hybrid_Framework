package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.TrackOrderPage;
import resources.Base;
import resources.ExcelDataProvider;

public class ValidateTrackOrder extends Base {

	@Test
	public void trackOrderValidation() throws IOException {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		logger = report.createTest("Validating Track Order");
		LandingPage lp = new LandingPage(driver);
		lp.clickTrackOrder().click();
		TrackOrderPage to = new TrackOrderPage(driver);
		to.getOrderNumber().sendKeys(excel.getNumericData("Data", 0, 0));
		to.getPhoneNumber().sendKeys(excel.getNumericData("Data", 0, 1));
		to.clickSubmit().click();
		Assert.assertTrue(to.verifyText().isDisplayed());
		logger.info("Successfully validated Track Orders");
		
	}
	
}
