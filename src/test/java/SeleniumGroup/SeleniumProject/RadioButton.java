package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement radiobutton1 = driver.findElement(By.cssSelector("input[value = option1]"));
		radiobutton1.click();
		
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value = option2]"));
		radiobutton2.click();
		
		WebElement radiobutton3 = driver.findElement(By.cssSelector("input[value = option3]"));
		radiobutton3.click();
		
		driver.quit();
		
	}

}
