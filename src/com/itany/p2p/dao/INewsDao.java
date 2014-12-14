package com.itany.p2p.dao;

import java.util.List;

import com.itany.p2p.entity.News;
import com.itany.p2p.exception.DataAccessException;

public interface INewsDao {

	//获取新闻
	public List getNews() throws DataAccessException;
	
	//添加新闻
	public Object addNews(News news) throws DataAccessException;
	
	//根据ID获取新闻
	public List getNewsById(int newsId) throws DataAccessException;
	
	//根据ID修改新闻
	public void modifyNewsById(News news) throws DataAccessException;
	
}