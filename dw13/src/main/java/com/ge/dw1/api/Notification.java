package com.ge.dw1.api;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Notification {
	public Notification(String text, Integer id) {
		super();
		this.text = text;
		this.id = id;
	}

	@NotEmpty
	@JsonProperty
	private String text;
	
	@NotNull
	@JsonProperty
	private Integer id;

	public String getText() {
		return text;
	}

	public Integer getId() {
		return id;
	}

}
