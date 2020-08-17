/***************************************************************
 -Author                : Geetha
 -Created/Modified Date : 11/08/2020
 -Description           : Error Controller For Flight
 
*******************************************************************/
package com.capg.fms.flight.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fms.flight.exception.FlightAlreadyExistException;
import com.capg.fms.flight.exception.FlightNotFoundException;


@ControllerAdvice
@RestController
public class FlightErrorController {

	@ExceptionHandler(FlightNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = " Flight Not Found", code = HttpStatus.NOT_FOUND)
	public void flightNotFoundException() {

	}

	@ExceptionHandler(FlightAlreadyExistException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = " Flight Already Exists")
	public void flightAlreadyExistsException() {
		
	}
	
}