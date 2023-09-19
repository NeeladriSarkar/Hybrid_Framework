package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.WishlistPage;
import resources.Base;

public class ValidateWishlist extends Base {

	@Test
	public void wishlistValidation() {
		
		logger = report.createTest("Validating Wishlist");
		LandingPage lp = new LandingPage(driver);
		lp.clickWishlist().click();
		WishlistPage wp = new WishlistPage(driver);
		Assert.assertTrue(wp.loginText().isDisplayed());
		logger.info("Successfully validated Wishlist");
		
	}
	
}
