package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryDemo {
	@Test
public void test1() {
	System.out.println("Test1");
}
	@Test
public void test2() {
	System.out.println("Test2");
	//int a = 1/0;
}
	
	@Test(retryAnalyzer = listeners.RetryAnalyser.class)
public void test3() {
	System.out.println("Test3");
	Assert.assertTrue(0>1);
}
}
