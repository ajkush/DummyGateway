package com.gateway.service;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import com.gateway.model.AirlineOutputPojo;
import com.gateway.model.AirlinePojo;

public class OutputResultProcessor {

	public void output(ArrayList<AirlineOutputPojo> finalData) {

		for (AirlineOutputPojo airlineOutputPojo : finalData) {
			
			System.out.println(airlineOutputPojo.toString());
		}


	}





}
