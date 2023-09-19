package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateCart extends Base {

	@Test
	public void cartValidation() {
		
		logger = report.createTest("Validating Cart");
		LandingPage lp = new LandingPage(driver);
		lp.clickCart().click();
		CartPage cp = new CartPage(driver);
		Assert.assertTrue(cp.emptyCartText().isDisplayed());
		Assert.assertTrue(cp.browseText().isDisplayed());
		logger.info("Successfully validated Cart");
		
	}
	
}
