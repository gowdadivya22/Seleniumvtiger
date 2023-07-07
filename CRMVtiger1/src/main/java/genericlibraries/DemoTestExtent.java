package genericlibraries;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericlibraries.LiestenerImplementation.class)
public class DemoTestExtent extends BaseClass {
	@Test
	public void validatePassedTest() {
		System.out.println("This is from passed testcase");
	}
	@Test
	public void validateFailedTest() {
		System.out.println("This is from failed testcase");
		assertEquals(false, true);
	}
	@Test
	public void validateSkippedTest() {
		System.out.println("This is from skipped test case");
		throw new SkipException("This is skipped");
	}

}
