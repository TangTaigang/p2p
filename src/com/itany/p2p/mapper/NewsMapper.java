package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.News;
import com.itany.p2p.util.RowMapper;

public class NewsMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws Exception {
		News news = new News();
		news.setNewsId(rs.getInt("newsid"));
		news.setNewsTitle(rs.getString("newstitle"));
		news.setImage(rs.getString("image"));
		news.setCreateAt(rs.getDate("createat"));
		news.setContent(rs.getString("content"));
		return news;
	}

}
