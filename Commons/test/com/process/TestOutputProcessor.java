package com.process;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.common.util.Constants;
import com.gateway.exception.FileReadException;
import com.gateway.model.AirlineOutputPojo;
import com.gateway.model.AirlinePojo;
import com.gateway.service.InputReaderProcessor;
import com.gateway.service.RecordProcessor;

public class TestOutputProcessor extends TestCase {

	InputReaderProcessor inputR;
	RecordProcessor recordProcessor;
	ArrayList<AirlineOutputPojo> processedRec;

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
		recordProcessor = new RecordProcessor(rec, "WTX", Constants.SUM, "SOX", Constants.AVG);
		processedRec = recordProcessor.processRecord();
		assertEquals(9, processedRec.size());
	}
	
	@Test
	public void testRecordsBBGrade() throws FileReadException {
		ArrayList<AirlinePojo> rec = inputR.readFile(Constants.FILE_NAME);
		recordProcessor = new RecordProcessor(rec, "WTX", Constants.SUM, "SOX", Constants.AVG);
		processedRec = recordProcessor.processRecord();
		for (AirlineOutputPojo airlineFPojo : processedRec) {
			if(airlineFPojo.getRating().equals("BB")){
				
				Assert.assertEquals(532.0, airlineFPojo.getSox(), .00010);
				Assert.assertEquals(26.402, airlineFPojo.getWtx(), .00010);
				

			}
		}
		
	}

		@Test
		public void testRecordsBBGradeAvg() throws FileReadException {
			ArrayList<AirlinePojo> rec = inputR.readFile(Constants.FILE_NAME);
			recordProcessor = new RecordProcessor(rec, "WTX", Constants.SUM, "SOX", Constants.SUM);
			processedRec = recordProcessor.processRecord();
			for (AirlineOutputPojo airlineFPojo : processedRec) {
				if(airlineFPojo.getRating().equals("BB")){
					
					Assert.assertEquals(2128.0, airlineFPojo.getSox(), .00010);
					Assert.assertEquals(26.402, airlineFPojo.getWtx(), .00010);
					

				}
			}
		
	
		}
}
