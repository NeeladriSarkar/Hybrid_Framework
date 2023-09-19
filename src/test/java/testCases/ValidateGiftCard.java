package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.GiftPage;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateGiftCard extends Base {

	@Test
	public void giftsValidation() {
		
		logger = report.createTest("Validating Gift Cards");
		LandingPage lp = new LandingPage(driver);
		lp.clickGiftCard().click();
		GiftPage gp = new GiftPage(driver);
		Assert.assertTrue(gp.getText().isDisplayed());
		logger.info("Successfully validated Gift Cards");
		
	}
	
}
