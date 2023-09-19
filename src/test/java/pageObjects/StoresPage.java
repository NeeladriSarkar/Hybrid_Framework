package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoresPage {

	public WebDriver driver;
	public StoresPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By location = By.xpath("//h3[contains(text(),'Hadapsar, Pune')]");
	public WebElement getLocation() {
		return driver.findElement(location);
	}
	
}
