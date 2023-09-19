package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	public WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By emptyCart = By.xpath("//p[contains(text(),'Your cart is empty')]");
	public WebElement emptyCartText() {
		return driver.findElement(emptyCart);
	}
	
	By browse = By.xpath("//div[contains(text(),'Browse Popular Categories')]");
	public WebElement browseText() {
		return driver.findElement(browse);
	}
	
}
