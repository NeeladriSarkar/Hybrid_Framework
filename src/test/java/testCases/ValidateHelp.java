package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HelpPage;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateHelp extends Base {

	@Test
	public void helpValidation() {
		
		logger = report.createTest("Validating Help");
		LandingPage lp = new LandingPage(driver);
		lp.clickHelp().click();
		HelpPage hp = new HelpPage(driver);
		Assert.assertTrue(hp.verifyHelpCenter().isDisplayed());
		logger.info("Successfully validated Help Page");
		
	}
	
}
