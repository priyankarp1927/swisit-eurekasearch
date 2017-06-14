package com.stackroute.swisit.domain;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@Document
public class ResponsiveBean {
	
	
	@JsonProperty("items")
	SwisitBean[] s;

	public SwisitBean[] getS() {
		return s;
	}

	public void setS(SwisitBean[] s) {
		this.s = s;
	}
	

	@Override
	public String toString() {
		return "Responsive [s=" + Arrays.toString(s) + "]";
	}
	

}
