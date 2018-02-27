package com.gateway.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import com.common.util.Constants;
import com.gateway.model.AirlineOutputPojo;
import com.gateway.model.AirlinePojo;

public class RecordProcessor {

	private ArrayList<AirlinePojo> list;

	private String formulaToColumn1;
	private String formulaToColumn2;

	public RecordProcessor(ArrayList<AirlinePojo> list, String column1,
			String formulaToColumn1, String column2, String formulaToColumn2) {
		super();
		this.list = list;
		this.formulaToColumn1 = formulaToColumn1;
		this.formulaToColumn2 = formulaToColumn2;
	}

	public ArrayList<AirlineOutputPojo> processRecord() {

		ConcurrentHashMap<String, List<AirlinePojo>> map = new ConcurrentHashMap<String, List<AirlinePojo>>();
		initMap(map);
		return processData(map);

	}

	private void initMap(ConcurrentHashMap<String, List<AirlinePojo>> map) {

		for (AirlinePojo airlinePojo : list) {

			List<AirlinePojo> rating = map.get(airlinePojo.getRating());
			if (null != rating) {
				rating.add(airlinePojo);
			} else {
				ArrayList<AirlinePojo> aiList = new ArrayList<AirlinePojo>();
				aiList.add(airlinePojo);
				map.put(airlinePojo.getRating(), aiList);

			}

		}

		//recordPrint(map);

	}

	private ArrayList<AirlineOutputPojo> processData(ConcurrentHashMap<String, List<AirlinePojo>> map) {

		float calCol1 = 0;
		float calCol2 = 0;

		ArrayList<AirlineOutputPojo> list = new ArrayList<AirlineOutputPojo>();

		for (Entry<String, List<AirlinePojo>> entry : map.entrySet()) {
			String key = entry.getKey().toString();
			List<AirlinePojo> value = entry.getValue();

			AirlineOutputPojo airlineOutputPojo = new AirlineOutputPojo();

			for (AirlinePojo airlinePojo : value) {

				calCol1 = calCol1 + airlinePojo.getWtx();
				calCol2 = calCol2 + airlinePojo.getSox();

			}
			if (formulaToColumn1.equals(Constants.AVG)) {
				calCol1 = calCol1 / value.size();
			}

			if (formulaToColumn2.equals(Constants.AVG)) {
				calCol2 = calCol2 / value.size();
			}

			airlineOutputPojo.setRating(key);
			airlineOutputPojo.setWtx(calCol1);
			airlineOutputPojo.setSox(calCol2);
			list.add(airlineOutputPojo);
		}
		return list;

	}

	private void recordPrint(ConcurrentHashMap<String, List<AirlinePojo>> map) {

		for (Entry<String, List<AirlinePojo>> entry : map.entrySet()) {
			String key = entry.getKey().toString();
			List<AirlinePojo> value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);
		}

	}

}
