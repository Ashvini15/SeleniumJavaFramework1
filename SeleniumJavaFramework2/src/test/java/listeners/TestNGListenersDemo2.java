package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo2 {
	@Test
	public void test4() {
		System.out.println("Inside Test4");
	}
	@Test
	public void test5() {
		System.out.println("Inside Test5");
		Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("Inside Test6");
		throw new SkipException("This test is skipped");
	}

}
