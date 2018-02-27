package com.process;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.common.util.Constants;
import com.gateway.exception.FileReadException;
import com.gateway.model.AirlinePojo;
import com.gateway.service.InputReaderProcessor;

public class TestInputReaderProcessot extends TestCase{

	
	InputReaderProcessor inputR;
	
	@Before
	public void setUp() throws Exception {
		inputR = new InputReaderProcessor();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testReadFileRecords() throws FileReadException {
		ArrayList<AirlinePojo> rec = inputR.readFile(Constants.FILE_NAME);
		//System.out.println(rec.size());
		assertEquals(52, rec.size());
	}
	
	

}
