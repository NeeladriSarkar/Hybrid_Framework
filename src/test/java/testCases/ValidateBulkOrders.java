package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BulkOrdersPage;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateBulkOrders extends Base {

	@Test
	public void bulkOrderValidation() {
		
		logger = report.createTest("Validating Bulk Orders");
		LandingPage lp = new LandingPage(driver);
		lp.clickBulkOrder().click();
		BulkOrdersPage bp = new BulkOrdersPage(driver);
		Assert.assertTrue(bp.getImage().isDisplayed());
		logger.info("Successfully validated Bulk Orders");
		
	}
	
}
