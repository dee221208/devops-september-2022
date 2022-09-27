package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class MainTest {

	private Main mainObj;
	private String expectedResponse;
	private String actualResponse;

	@Before
	public void init() {
		mainObj = new Main();
	}

	@Test
	public void testGetModuleName() {
		actualResponse = mainObj.getModuleName();
		expectedResponse = "Main";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		mainObj = null;
	}

}	
