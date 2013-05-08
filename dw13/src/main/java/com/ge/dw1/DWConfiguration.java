package com.ge.dw1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ge.dw1.configurations.MessageQueueConfiguration;
import com.yammer.dropwizard.config.Configuration;

public class DWConfiguration extends Configuration {
	
	@Valid
	@JsonProperty
	@NotNull
	private MessageQueueConfiguration messageQueue = new MessageQueueConfiguration();

	public MessageQueueConfiguration getMessageQueueConfiguration() {
		return messageQueue;
	}
	
	
}
