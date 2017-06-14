package com.stackroute.swisit.searchservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.swisit.domain.ResponsiveBean;
import com.stackroute.swisit.domain.SwisitBean;
import com.stackroute.swisit.repository.SearchRepository;


@Service
public class SearchService implements SearchServiceInterface {
	
	@Autowired
	private SearchRepository searchRepository;
	
	

	public Iterable<SwisitBean> save(ResponsiveBean obj) {
		
		SwisitBean a=new SwisitBean();
		for(SwisitBean b:obj.getS())
		{
			a.setTitle(b.getTitle());
			a.setLink(b.getLink());
			a.setSnippet(b.getSnippet());
			searchRepository.save(a);
		}
		
		return searchRepository.findAll();
		
	}



	public Iterable<SwisitBean> getAll() {
		return searchRepository.findAll();
	}
	


}
