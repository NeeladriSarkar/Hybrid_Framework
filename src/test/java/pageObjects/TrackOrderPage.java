package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrackOrderPage {

	public WebDriver driver;
	public TrackOrderPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	By order = By.name("orderNumber");
	public WebElement getOrderNumber() {
		return driver.findElement(order);
	}
	
	By phone = By.name("phoneNumber");
	public WebElement getPhoneNumber() {
		return driver.findElement(phone);
	}
	
	By submit = By.cssSelector("button[class*='_3Haew _1fVSi action-button _1njbS _1XfDi _1tgY9']");
	public WebElement clickSubmit() {
		return driver.findElement(submit);
	}
	
	By text = By.xpath("//p[contains(text(),'Order not found. If you have just placed the order')]");
	public WebElement verifyText() {
		return driver.findElement(text);
	}
	
}
