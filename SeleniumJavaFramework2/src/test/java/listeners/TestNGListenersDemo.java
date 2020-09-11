package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	@Test
	public void test1() {
		System.out.println("Inside Test1");
	}
	@Test
	public void test2() {
		System.out.println("Inside Test2");
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://google.com/");
		wd.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
	}
	@Test
	public void test3() {
		System.out.println("Inside Test3");
		throw new SkipException("This test is skipped");
	}

}
