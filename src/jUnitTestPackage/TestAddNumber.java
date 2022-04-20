package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumber {

	@Test
	public void test() {
		jUnitFunctions junit=new jUnitFunctions();
		int result =junit.addNumbers(100, 150);
		assertEquals (250,result);
	}

}
