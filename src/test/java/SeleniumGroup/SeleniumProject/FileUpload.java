package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		WebElement fileupload = driver.findElement(By.id("file-upload-field"));
		fileupload.sendKeys("FileUpload.jpg");
		
		fileupload.sendKeys(Keys.RETURN);
		
		//driver.quit();
	}

}
