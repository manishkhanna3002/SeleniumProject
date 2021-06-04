package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete1 = driver.findElement(By.id("autocomplete"));
		autocomplete1.sendKeys("1555 Park Blvd, Palo Alto, CA, USA");
		
		//Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//autocomplete1.findElement(By.className("pac-item")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		
		WebElement autocompleteresult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pac-item")));
				
		//autocomplete1.click();
		autocompleteresult.click();
		
		//driver.quit();
	}

}
