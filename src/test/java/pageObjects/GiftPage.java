package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftPage {

	public WebDriver driver;
	public GiftPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By text = By.xpath("//h3[contains(text(),'Special Occasions')]");
	public WebElement getText() {
		return driver.findElement(text);
	}
	
}
