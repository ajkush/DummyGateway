package com.run;

import com.common.util.Constants;
import com.gateway.exception.FileReadException;
import com.gateway.facade.CalculatorFacade;

public class Main {

	public static void main(String[] args) {

		// Expected input
		// GroupByColumn=Rating CalculationColumns= WTX | SUM : SOX | AVG
		CalculatorFacade cFacade = new CalculatorFacade();
		try {

			cFacade.doProcessData(Constants.FILE_NAME, args[2], args[4],
					args[6], args[8]);
		} catch (FileReadException e) {

			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out
			.println("**************** Invalid Input **********************");
			System.out
			.println("****************GroupByColumn=Rating CalculationColumns= WTX | SUM : SOX | AVG**********************");
			System.out
			.println("****************Giving Default Input**********************");
			try {
				//cFacade.doProcessData(Constants.FILE_NAME, "WTX", "SUM", "SOX",	"AVG");
				cFacade.doProcessData(Constants.FILE_NAME, "WTX", Constants.SUM, "SOX", Constants.AVG);
			} catch (FileReadException e1) {
				System.out
				.println("****************Something Went Wrong with Input file**********************");
				System.out.println(e.getMessage());
			}
		}
	}

}
