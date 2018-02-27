package com.gateway.exception;

import java.io.FileNotFoundException;

public class FileReadException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FileReadException() {
		super();
	}
	public FileReadException(FileNotFoundException e) {
		super(e);
	}
	
}
