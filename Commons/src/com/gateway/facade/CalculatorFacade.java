package com.gateway.facade;

import java.util.ArrayList;

import com.gateway.exception.FileReadException;
import com.gateway.model.AirlineOutputPojo;
import com.gateway.model.AirlinePojo;
import com.gateway.service.InputReaderProcessor;
import com.gateway.service.OutputResultProcessor;
import com.gateway.service.RecordProcessor;

public class CalculatorFacade {

	private InputReaderProcessor fileReader;
	private RecordProcessor recordProcessor;
	private OutputResultProcessor resultProcessor;

	public ArrayList<AirlineOutputPojo> doProcessData(String fileName, String column1, String formulaToColumn1,
			String column2, String formulaToColumn2) throws FileReadException {

		//Reading Input
		fileReader = new InputReaderProcessor();
		ArrayList<AirlinePojo> list = fileReader.readFile(fileName);

		//Processing Data
		recordProcessor = new RecordProcessor(list, column1, formulaToColumn1, column2, formulaToColumn2);
		ArrayList<AirlineOutputPojo> finalData = recordProcessor.processRecord();
		
		//OutPut Data
		OutputResultProcessor outputResultProcessor = new OutputResultProcessor();
		outputResultProcessor.output(finalData);
		return finalData;

	}

}
