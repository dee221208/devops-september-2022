package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class HelloTest {

	private Hello hello;
	private String expectedResponse;
	private String actualResponse;

	@Before
	public void init() {
		hello = new Hello();
	}

	@Test
	public void testSayHello() {
		actualResponse   = hello.sayHello();
		expectedResponse = "Hello Maven!";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After 
	public void cleanUp() {
		hello = null;
	}
	
}
