package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring=new jUnitFunctions();
		String result =junitstring.addStrings("hello", "world");
		assertEquals ("helloworld",result);
	}

}
