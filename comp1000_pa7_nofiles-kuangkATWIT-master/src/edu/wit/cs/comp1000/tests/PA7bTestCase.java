package edu.wit.cs.comp1000.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;

import edu.wit.cs.comp1000.PA7b;
import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class PA7bTestCase extends TestCase {
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
	
	private void _test(String[] values, String result) {
		final String input = String.join(" ", values);
		
		final String output = TestSuite.stringOutput(new String[] {
			"Enter text: ",
			"%s" }, new Object[] { result });
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		System.setOut(new PrintStream(outContent));
		
		try {
			PA7b.main(new String[] { "foo" });
		} catch (ExitException e) {}
		assertEquals(output, outContent.toString());
		
		System.setIn(null);
		System.setOut(null);
	}
	
	private void _testText(String input, String counts) {
		_test(
			new String[] { String.format(input) }, 
			String.format(counts + "%n")
		);
	}
	
	public void testEmpty() {
		_testText("", "");
	}
	
	public void testZero() {
		_testText("1 2 3%n! ? >%n:) !!%n", "");
	}
	
	public void testLettersLower() {
		_testText("a%nb b%ncc c%nd d dd%n%neee ee%n", "A: 1%nB: 2%nC: 3%nD: 4%nE: 5");
	}
	
	public void testLettersUpper() {
		_testText("A%nB B%nCC C%nD D DD%n%nEEE EE%n", "A: 1%nB: 2%nC: 3%nD: 4%nE: 5");
	}
	
	public void testLettersMixed() {
		_testText("a%nb B%nCc C%nd D Dd%n%nEeE eE%n", "A: 1%nB: 2%nC: 3%nD: 4%nE: 5");
	}
	
	public void testHelloWorld() {
		_testText("Hello World!%n", "D: 1%nE: 1%nH: 1%nL: 3%nO: 2%nR: 1%nW: 1");
	}
	
}
