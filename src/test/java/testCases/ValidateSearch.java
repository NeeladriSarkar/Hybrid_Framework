package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.Base;
import resources.ExcelDataProvider;

public class ValidateSearch extends Base {

	@Test
	public void searchValidation() throws IOException {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		logger = report.createTest("Validating Search");
		LandingPage lp = new LandingPage(driver);
		lp.searchElement().sendKeys(excel.getStringData("Data", 1, 0));
		lp.searchElement().sendKeys(Keys.ENTER);
		SearchPage sp = new SearchPage(driver);
		System.out.println(sp.getCount().getText());
		Assert.assertTrue(sp.getCount().isDisplayed());
		logger.info("Successfully validated Search");
		
	}
	
}
