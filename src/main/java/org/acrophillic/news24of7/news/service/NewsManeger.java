package org.acrophillic.news24of7.news.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.acrophillic.news24of7.news.model.NewsTO;

public class NewsManeger {
	
	private Service newsService = new Service();

	public List<NewsTO> getAllNews() {
		return newsService.getAllNews();
	}
	public List<NewsTO> getAllNews(int year) {
		List<NewsTO> result = new ArrayList<>(); 
		List<NewsTO> list = new NewsManeger().getAllNews();
		for (NewsTO newsTO : list) {
			if(newsTO.getDate().get(Calendar.YEAR)==year)
				result.add(newsTO);
		}

		 return result;
	}
	public List<NewsTO> getAllNews(int start, int size) {
		List<NewsTO> result = new ArrayList<>(); 
		List<NewsTO> list = new NewsManeger().getAllNews();
		
		for (int i = start ; i<= start+size-1 && i<= list.size()-1; i++) {
			result.add(list.get(i));
		}
		return result;
	}
	
	public List<NewsTO> getAllNews(int year, int start, int size) {
		List<NewsTO> result = new ArrayList<>(); 
		List<NewsTO> list = new NewsManeger().getAllNews();
		
		for (int i = start ; i<= start+size && i<= list.size()-1; i++) {
			if(list.get(i).getDate().get(Calendar.YEAR)==year)
				result.add(list.get(i));
		}
		
		return result;
	}


	public NewsTO getNewsById(int id) {
		return newsService.getAllNews().get(id);
	}

	public NewsTO addNews(NewsTO newsTO) {		
		int id = newsService.getAllNews().size();
		newsTO.setId(id);
		return newsService.addNews(newsTO);
	}
	
	public NewsTO updateNews(NewsTO newsTO) {		
		return newsService.updateNews(newsTO);
	}
	
	public void deleteNews(int id) {
		newsService.deleteNews(id);
	}

}
