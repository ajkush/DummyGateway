package com.common.util;

import com.gateway.model.AirlinePojo;

public class Util {

	public static AirlinePojo splitAndExtract(String s) {

		String[] data = s.split(",");
		AirlinePojo record = new AirlinePojo(data[0], data[1], data[2],
				data[3], data[4], Float.parseFloat(data[5]),
				Integer.parseInt(data[6]), 
				Float.parseFloat(data[7]));

		return record;

	}

}
