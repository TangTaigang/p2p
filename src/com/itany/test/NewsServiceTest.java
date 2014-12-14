package com.itany.test;

import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import com.itany.p2p.entity.News;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.INewsService;
import com.itany.p2p.service.impl.NewsServiceImpl;

public class NewsServiceTest extends TestCase{
	
	INewsService newsService;
	
	@Override
	protected void setUp() throws Exception {
		newsService = new NewsServiceImpl();
	}
	
	public void testGetNews() throws ServiceException{
		List list = newsService.getAllNews();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void testAddNews() throws ServiceException{
		News news = new News();
		String title = "请示指导";
		Date date = new Date();
		String image = "images/5.png";
		String content = "福耀玻璃光大证券";
		news.setNewsTitle(title);
		news.setCreateAt(date);
		news.setImage(image);
		news.setContent(content);
		
		System.out.println(newsService.addNews(news));
		
	}
	
}
