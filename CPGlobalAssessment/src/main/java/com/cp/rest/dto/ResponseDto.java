package com.cp.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {

	/** The status id. */
	@JsonProperty("statusCode")
	private Integer statusId;
	
	/** The status message. */
	@JsonProperty("statusMessage")
	private String statusMessage;
	
	@JsonProperty("count")
	private int count;
	
	@JsonProperty("data")
	private Object results;
	
	public ResponseDto() {
		super();
	}

	public ResponseDto(Integer statusId, String statusMessage) {
		super();
		this.statusId = statusId;
		this.statusMessage = statusMessage;
	}

	public Integer getStatusId() {
		return statusId;
	}


	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}


	public String getStatusMessage() {
		return statusMessage;
	}


	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}


	public Object getResults() {
		return results;
	}


	public void setResults(Object object) {
		this.results = object;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	
	

}
