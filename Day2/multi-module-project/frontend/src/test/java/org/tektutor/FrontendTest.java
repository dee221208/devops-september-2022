package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FrontendTest {

	private Frontend fe;
	private String expectedResponse;
	private String actualResponse;

	@Before
	public void init() {
		fe = new Frontend();
	}

	@Test
	public void testGetModuleName() {
		actualResponse = fe.getModuleName();
		expectedResponse = "Frontend";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		fe = null;
	}

}	
