package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.INewsDao;
import com.itany.p2p.entity.News;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.NewsMapper;
import com.itany.p2p.util.JDBCTemplate;

public class NewsDaoImpl implements INewsDao {
	
	private JDBCTemplate template;
	
	public NewsDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//获取所有新闻
	public List getNews() throws DataAccessException{
		String sql = "select *from news order by createat desc";
		List list = template.query(sql, new NewsMapper());
		return list;
	}
	
	//添加新闻
	public Object addNews(News news) throws DataAccessException{
		String sql = "insert into news values(sequence_news_id.nextval,?,?,?,?)";
		Object obj = template.save(sql, news.getNewsTitle(),news.getCreateAt(),news.getImage(),news.getContent());
		
		return obj;
	}

	//根据ID获取新闻
	public List getNewsById(int newsId) throws DataAccessException {
		String sql = "select *from news where newsid=?";
		List list = template.query(sql, new NewsMapper(), newsId);
		return list;
	}

	//根据ID修改新闻
	public void modifyNewsById(News news) throws DataAccessException {
		String sql = "update news set newstitle=?,content=?,image=? where newsid=?";
		template.update(sql, news.getNewsTitle(),news.getContent(),news.getImage(),news.getNewsId());
		
	}
	
	
}


