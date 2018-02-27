package com.gateway.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.common.util.Constants;
import com.gateway.exception.FileReadException;
import com.gateway.facade.CalculatorFacade;
import com.gateway.model.AirlineOutputPojo;

@RestController
@Component
public class EngineController {

	@RequestMapping(path="/info", method=RequestMethod.GET, produces="application/json")
	public String getInfo(){
		return "This is a Spting Web Servce";
	}

	@RequestMapping(path="/execute",  method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<ArrayList<AirlineOutputPojo>> getProcessedData(@RequestParam(value = "column1") String column1, @RequestParam(value = "formulaToColumn1") String formulaToColumn1, @RequestParam(value = "column2") String column2,  @RequestParam(value = "formulaToColumn2") String formulaToColumn2){

		ArrayList<AirlineOutputPojo> entities = new ArrayList<>();
		CalculatorFacade cFacade = new CalculatorFacade();
		try {

			entities = cFacade.doProcessData(Constants.FILE_NAME,column1, formulaToColumn1,
					column2, formulaToColumn2);
		} catch (FileReadException e) {

			e.printStackTrace();
		}

		return ResponseEntity.accepted().body(entities);
	}

}
