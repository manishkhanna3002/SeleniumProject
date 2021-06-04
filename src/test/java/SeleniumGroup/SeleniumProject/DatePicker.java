package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/datepicker");
	
	WebElement datepicker = driver.findElement(By.id("datepicker"));
	datepicker.sendKeys("01/01/1980");
	
	datepicker.sendKeys(Keys.RETURN);
	
	//driver.quit();
	
	
	}

}
