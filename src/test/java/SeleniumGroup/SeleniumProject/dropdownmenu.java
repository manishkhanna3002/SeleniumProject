package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class dropdownmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://formy-project.herokuapp.com/dropdown");
			WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));
			dropdownmenu.click();
			
			WebElement dropdownmenuitem = driver.findElement(By.xpath("/html/body/div/div/div/a[5]"));
			dropdownmenuitem.click();
			
			//driver.quit();
			
	}

}
