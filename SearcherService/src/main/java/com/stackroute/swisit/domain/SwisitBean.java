package com.stackroute.swisit.domain;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class SwisitBean {
	
	@JsonProperty("title")
	String title;
	@JsonProperty("link")
	String link;
	@JsonProperty("snippet")
	String snippet;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getSnippet() {
		return snippet;
	}
		
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	
	@Override
	public String toString() {
		return "SwisitBean [title=" + title + ", link=" + link + ", snippet=" + snippet + "]";
	}
	

}
