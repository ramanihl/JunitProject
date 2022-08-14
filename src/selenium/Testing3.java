package selenium;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // run test case in order

public class Testing3 {
	

	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	@Ignore
	@Test
	public void test6() {
		
		String actual = "abc";
		String expected = "abc";
		
	/*	if(actual.equals(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	*/
		
		System.out.println("before 1st Assert");
		Assert.assertEquals(expected, actual);   // we use regular assert in the industry
		System.out.println("After 1st Assert");
		Assert.assertTrue("verify 2>3", 2>3);
		System.out.println("After 2nd Assert");
					
	}
	
	@Test
	public void test7() {
		
		String actual = "abc";
		String expected = "abc1";
		System.out.println("before 1st Assert");
		
		try {
			Assert.assertEquals(expected, actual);
			}
		catch(Throwable t){
			System.out.println("In 1st catch");
			err.addError(t);
			}
		
		System.out.println("After 1st Assert");
		
		try {
			Assert.assertTrue("verify 2>3", 2>3);
			}
		catch (Throwable t) {
			System.out.println("In 2nd catch");
			err.addError(t);
			}
		
		System.out.println("After 2nd Assert");
					
	}
}
