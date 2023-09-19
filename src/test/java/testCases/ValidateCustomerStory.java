package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CustomerStoryPage;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateCustomerStory extends Base {

	@Test
	public void customerStoryValidation() {
		
		logger = report.createTest("Validating Customer Stories");
		LandingPage lp = new LandingPage(driver);
		lp.customerStoryClick().click();
		CustomerStoryPage cp = new CustomerStoryPage(driver);
		Assert.assertTrue(cp.getText().isDisplayed());
		logger.info("Successfully validated Customer Stories");
		
	}
	
}
