package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class DataAccessLayerTest {

	private DataAccessLayer dal;
	private String expectedResponse;
	private String actualResponse;

	@Before
	public void init() {
		dal = new DataAccessLayer();
	}

	@Test
	public void testGetModuleName() {
		actualResponse = dal.getModuleName();
		expectedResponse = "DataAccessLayer";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		dal = null;
	}

}	
