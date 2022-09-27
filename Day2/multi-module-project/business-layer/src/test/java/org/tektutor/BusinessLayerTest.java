package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class BusinessLayerTest {

	private BusinessLayer bl;
	private String expectedResponse;
	private String actualResponse;

	@Before
	public void init() {
		bl = new BusinessLayer();
	}

	@Test
	public void testGetModuleName() {
		actualResponse = bl.getModuleName();
		expectedResponse = "BusinessLayer";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		bl = null;
	}

}	
