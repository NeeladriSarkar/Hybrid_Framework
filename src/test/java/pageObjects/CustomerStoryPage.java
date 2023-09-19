package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerStoryPage {

	public WebDriver driver;
	public CustomerStoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By text = By.xpath("//span[contains(text(),'Anindya')]");
	public WebElement getText() {
		return driver.findElement(text);
	}
	
}
