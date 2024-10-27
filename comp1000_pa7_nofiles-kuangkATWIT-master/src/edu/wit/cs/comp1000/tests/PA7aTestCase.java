package edu.wit.cs.comp1000.tests;

import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;
import java.util.Scanner;

import edu.wit.cs.comp1000.PA7a;
import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class PA7aTestCase extends TestCase {
	
    @Rule
    public Timeout globalTimeout = Timeout.seconds(15);

	@SuppressWarnings("serial")
	private static class ExitException extends SecurityException {}
	
	private static class NoExitSecurityManager extends SecurityManager 
    {
        @Override
        public void checkPermission(Permission perm) {}
        
        @Override
        public void checkPermission(Permission perm, Object context) {}
        
        @Override
        public void checkExit(int status) { super.checkExit(status); throw new ExitException(); }
    }
	
	@Override
    protected void setUp() throws Exception 
    {
        super.setUp();
        System.setSecurityManager(new NoExitSecurityManager());
    }
	
	@Override
    protected void tearDown() throws Exception 
    {
        System.setSecurityManager(null);
        super.tearDown();
    }
	
	private void _testReadIntoArray(String input, int[] expectedSubset) {
		Integer result = null;
		final int[] nums = new int[100];
		
		final int[] expectedArray = new int[nums.length];
		for (int i=0; i<expectedSubset.length; i++) {
			expectedArray[i] = expectedSubset[i];
		}
		
		try {
			final Scanner s = new Scanner(input);
			result = PA7a.readIntoArray(s, nums);
			s.close();
		} catch (ExitException e) {}
		
		assertArrayEquals(expectedArray, nums);
		assertEquals((Object) expectedSubset.length, (Object) result);
	}
	
	public void testReadIntoArray() {
		_testReadIntoArray("", new int[] {});
		_testReadIntoArray("1", new int[] {1});
		_testReadIntoArray("-1", new int[] {-1});
		_testReadIntoArray("0", new int[] {0});
		
		_testReadIntoArray("1 2 3 4", new int[] {1, 2, 3, 4});
		_testReadIntoArray(String.format("1%n2%n3%n4"), new int[] {1, 2, 3, 4});
		
		_testReadIntoArray("49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 50",
			new int[] {49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,50}
		);
		
		_testReadIntoArray("49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 50 100 101",
			new int[] {49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,50}
		);
	}
	
	private void _testPrintAboveAverage(int[] inputNums, int inputSize, String avg, String above) {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		try {
			PA7a.printAboveAverage(inputNums, inputSize);
		} catch (ExitException e) {}
		System.setOut(null);
		
		assertEquals(String.format("Average: %s%nValues above average: %s%n", avg, above), outContent.toString());
	}
	
	public void testPrintAboveAverage() {
		_testPrintAboveAverage(new int[] {}, 0, "0.00", "none");
		_testPrintAboveAverage(new int[] {1}, 0, "0.00", "none");
		
		_testPrintAboveAverage(new int[] {1}, 1, "1.00", "none");
		_testPrintAboveAverage(new int[] {-1}, 1, "-1.00", "none");
		_testPrintAboveAverage(new int[] {0}, 1, "0.00", "none");
		
		_testPrintAboveAverage(new int[] {1, 2, 3, 4}, 4, "2.50", "nums[2]=3, nums[3]=4");
		
		_testPrintAboveAverage(
			new int[] {49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,50},  
			100,  "49.01", "nums[99]=50"
		);
	}
	
	private void _test(String[] values, String result) {
		final String input = String.join(" ", values);
		
		final String output = TestSuite.stringOutput(new String[] {
			"Enter up to 100 integers: ",
			"%s" }, new Object[] { result });
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		System.setOut(new PrintStream(outContent));
		
		try {
			PA7a.main(new String[] { "foo" });
		} catch (ExitException e) {}
		assertEquals(output, outContent.toString());
		
		System.setIn(null);
		System.setOut(null);
	}
	
	private void _testSequence(String input, String avg, String above) {
		_test(
			new String[] { input }, 
			String.format("Average: %s%nValues above average: %s%n", avg, above)
		);
	}
	
	public void testSequence() {
		_testSequence("", "0.00", "none");
		_testSequence("1", "1.00", "none");
		_testSequence("-1", "-1.00", "none");
		_testSequence("0", "0.00", "none");
		
		_testSequence("49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 50", "49.01", "nums[99]=50");
		_testSequence("49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 49 50 100 101", "49.01", "nums[99]=50");
		_testSequence("1 2 3 4", "2.50", "nums[2]=3, nums[3]=4");
	}
	
}
