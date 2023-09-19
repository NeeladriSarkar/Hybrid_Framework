package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {

	public WebDriver driver;
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By text = By.cssSelector("div[class*='ulmessage']");
	public WebElement loginText() {
		return driver.findElement(text);
	}
	
}
