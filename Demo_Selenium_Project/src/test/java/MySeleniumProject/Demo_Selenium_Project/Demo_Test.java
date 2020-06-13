package MySeleniumProject.Demo_Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Systematiser;

public class Demo_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		
		WebElement element1 = driver.findElement(By.name("q"));
		
		element1.sendKeys("");
		
		driver.quit();
	}

}

