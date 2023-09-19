package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;


public class ValidateTitle extends Base {

	@Test
	public void titleValidation() throws IOException {
		logger = report.createTest("Validating Title");
		Assert.assertEquals(driver.getTitle(), "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
		logger.info("Successfully validated title");
	}
	
}
