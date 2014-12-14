package com.itany.p2p.service.impl;

import java.util.List;

import com.itany.p2p.dao.INewsDao;
import com.itany.p2p.dao.impl.NewsDaoImpl;
import com.itany.p2p.entity.News;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.INewsService;

public class NewsServiceImpl implements INewsService {
	
	private INewsDao newsDao= new NewsDaoImpl();
	
	//获取所有新闻
	public List getAllNews() throws ServiceException{
		List list = null;
		try {
			list = newsDao.getNews();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}
	
	//添加新闻
	public Object addNews(News news) throws ServiceException{
		Object obj = null;
		try {
			obj = newsDao.addNews(news);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return obj;
	}

	//根据ID获取新闻
	public List getNewsById(int newsId) throws ServiceException {
		List list = null;
		try {
			list = newsDao.getNewsById(newsId);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}

	//根据ID修改新闻
	public void modifyNewsById(News news) throws ServiceException {
		try {
			newsDao.modifyNewsById(news);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}
	
}
