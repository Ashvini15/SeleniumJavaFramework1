import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir"); 
		System.out.println("projectPath : \n"+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver wd = new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://google.com/");
		//wd.findElement(By.id("realbox")).sendKeys("abcd");
		//wd.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		//List<WebElement> listOfInputElements = wd.findElements(By.xpath("//input"));
		//int count = listOfInputElements.size();
		//System.out.println("Number of input elements are:" +count);
		//wd.quit();

//		System.setProperty("webdriver.ie.driver", projectPath+"/Drivers/iedriver/IEDriverServer.exe");
//		WebDriver wd = new InternetExplorerDriver();
//		wd.get("https://selenium.dev/");
	}
}
