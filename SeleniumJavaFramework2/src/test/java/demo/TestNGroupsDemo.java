package demo;

import org.testng.annotations.Test; 
@Test(groups= {"AllClassTests"})
public class TestNGroupsDemo {
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups = {"sanity","smoke"} )
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups = {"windows.regression"} )
	public void test3() {
		System.out.println("test3");
	}
	public void test4() {
		System.out.println("test4");
	}

}
