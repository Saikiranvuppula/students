package com.example.studs.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException 
{
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<?>HandleResourceNotFoundException
	(StudentNotFoundException exception,WebRequest request)
	{
		ExceptionResponse exceptionresponse =new ExceptionResponse(new Date(), exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(exceptionresponse,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?>HandleGlobalException
	(Exception exception,WebRequest request)
	{
		ExceptionResponse exceptionresponse =new ExceptionResponse(new Date(), exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(exceptionresponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
