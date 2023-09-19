package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	public WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By count = By.cssSelector("span[class='count']");
	public WebElement getCount() {
		return driver.findElement(count);
	}
	
}
