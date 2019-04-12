package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		int result=junit.addNumbers(22, 7);
		assertEquals(29, result);
	}

}
