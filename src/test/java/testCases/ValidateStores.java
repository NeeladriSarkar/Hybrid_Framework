package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.StoresPage;
import resources.Base;

public class ValidateStores extends Base {

	@Test
	public void storesValidation() {
		
		logger = report.createTest("Validating Stores");
		LandingPage lp = new LandingPage(driver);
		lp.clickStores().click();
		StoresPage sp = new StoresPage(driver);
		Assert.assertTrue(sp.getLocation().isDisplayed());
		logger.info("Successfully validated Stores");
		
	}
	
}
