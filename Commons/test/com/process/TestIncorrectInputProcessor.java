package com.process;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gateway.exception.FileReadException;
import com.gateway.service.InputReaderProcessor;

public class TestIncorrectInputProcessor {

InputReaderProcessor inputR;
	
	@Before
	public void setUp() throws Exception {
		inputR = new InputReaderProcessor();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test(expected=FileReadException.class)
	public void testReadFile() throws FileReadException {
		inputR.readFile("FileNotExist");
	}
	
}
