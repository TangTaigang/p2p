package com.itany.p2p.service;

import java.util.List;

import com.itany.p2p.entity.News;
import com.itany.p2p.exception.ServiceException;

public interface INewsService {
	
	//获取所有新闻
	public List getAllNews() throws ServiceException;
	
	//添加新闻
	public Object addNews(News news) throws ServiceException;
	
	//根据ID获取新闻
	public List getNewsById(int newsId) throws ServiceException;
	
	//根据ID修改新闻
	public void modifyNewsById(News news) throws ServiceException;
	
}