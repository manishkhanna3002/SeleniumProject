package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get ("https://formy-project.herokuapp.com/scroll");
		  
		  WebElement name = driver.findElement(By.id("name"));
		  
		  Actions actions = new Actions(driver);
		  actions.moveToElement(name);
		  
		  name.sendKeys("Manish K");
		  
		  WebElement date = driver.findElement(By.id("date"));
		  date.sendKeys("01/01/2020");
		  
		  driver.quit();

	}

}
