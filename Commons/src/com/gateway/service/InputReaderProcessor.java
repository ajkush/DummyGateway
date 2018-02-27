package com.gateway.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.common.util.Util;
import com.gateway.exception.FileReadException;
import com.gateway.model.AirlinePojo;

public class InputReaderProcessor {

	public ArrayList<AirlinePojo> readFile(String fileName) throws FileReadException {
		
		ArrayList<AirlinePojo> list = new ArrayList<>();
		try {

			Scanner sc = new Scanner(new File(fileName));
			String rec;
			boolean read = false;
			while (sc.hasNextLine()) {
				rec = sc.nextLine();
				if(read){
				list.add(initializePojo(rec));
				}
				if(!read){
					read=true;
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			throw new FileReadException(e);
		}
		
		return list;

	}

	private AirlinePojo initializePojo(String rec) {

		return Util.splitAndExtract(rec);
	}

}
