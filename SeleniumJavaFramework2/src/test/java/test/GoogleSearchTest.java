package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in searchbox
		//driver.findElement(By.name("q")).sendKeys("seven wonders");
		GoogleSearchPage.textbox_search(driver).sendKeys("seven wonders");
		
		//Click on Search button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//Close Driver
		driver.close();
		System.out.println("Test Completed successfully");
	}

}
