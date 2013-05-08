package com.ge.dw1.configurations;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageQueueConfiguration {
	
	@JsonProperty
	@NotNull
	private String url;
	
	@JsonProperty
	@NotNull
	private String queueName;

	public String getUrl() {
		return url;
	}

	public String getQueueName() {
		return queueName;
	}

}
