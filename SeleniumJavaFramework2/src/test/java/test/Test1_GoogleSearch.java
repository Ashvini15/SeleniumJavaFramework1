package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir"); 
		//System.out.println("projectPath : \n"+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in searchbox
		driver.findElement(By.name("q")).sendKeys("seven wonders");
		
		//Click on Search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//Close Driver
		driver.close();
		System.out.println("Test Completed successfully");
	}

}
