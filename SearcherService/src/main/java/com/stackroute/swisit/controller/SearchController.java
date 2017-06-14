package com.stackroute.swisit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.stackroute.swisit.domain.ResponsiveBean;
import com.stackroute.swisit.domain.SwisitBean;
import com.stackroute.swisit.searchservice.SearchService;

@RestController
public class SearchController {
	
	@Value("${url}")
	String url;
	
	
	@Autowired
	private SearchService searchService;
	
	
	@RequestMapping(value="urlget", method=RequestMethod.GET)
	public Iterable<SwisitBean> get()
	{
		return searchService.getAll();
	}
	
	@RequestMapping(value="urlpost", method=RequestMethod.POST)
	public ResponseEntity save()
	{
		RestTemplate restTemplate = new RestTemplate(); 
		ResponsiveBean responsiveBean = new ResponsiveBean();
		responsiveBean = restTemplate.getForObject(url,ResponsiveBean.class);
		
		System.out.println(responsiveBean.getS());
		searchService.save(responsiveBean);
		
		Map msgMap = new HashMap<String,String>();
	    msgMap.put("message","Data Inserted successsfully");
	    return new ResponseEntity<Map<String,String>>(msgMap, HttpStatus.OK);
	}
	
	
}
