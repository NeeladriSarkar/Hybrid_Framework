package resources;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public String captureScreenshot(WebDriver driver) {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+File.separator+".\\screenshots"+File.separator+getTime()+".png";
		try {
			
			FileHandler.copy(src, new File(path));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return path;
	}
	
	public String getTime() {
		
		DateFormat current = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return current.format(currentDate);
		
	}
	
}
