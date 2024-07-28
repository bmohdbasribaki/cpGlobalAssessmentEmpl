package com.cp.rest.constant;

import org.springframework.stereotype.Component;


@Component
public class ResponseCodeConstants {
	
	/** The Constant BAD_REQUEST. */
	public static final int BAD_REQUEST = 400;
	
	/** The Constant UNAUTHORIZED. */
	public static final int UNAUTHORIZED = 401;
	
	/** The Constant NOT_FOUND. */
	public static final int NOT_FOUND =404;
	
	/** The Constant OK. */
	public static final int OK=200;
	
	/** The Constant Forbidden. */
	public static final int FORBIDDEN=403;
	
	/** The Constant SUCCESS_STRING. */
	public static final String SUCCESS_STRING = "success";
	
	/** The Constant ERROR_STRING. */
	public static final String ERROR_STRING = "error";
	
	/** The Constant UNAUTHORIZED_STRING. */
	public static final String UNAUTHORIZED_STRING = "unauthorized";
	
	/** The Constant INVALID_INPUT. */
	public static final String INVALID_INPUT="Invalid Input";
	
	/** The Constant INVALID_INPUT. */
	public static final String BAD_CREDENTIALS_INPUT="Bad Credentials Exception";
	
	public static final int ACCEPTED=202;
	
	/** The Constant Forbidden. */
	public static final int CONFLICT=409;
	
	public static final String CONFLICT_INPUT="Conflict Input";
	
	public static final String DUPLICATE_INPUT="Duplicate Input";
}
