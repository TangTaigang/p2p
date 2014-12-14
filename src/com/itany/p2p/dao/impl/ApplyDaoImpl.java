package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.IApplyDao;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.ApplyMapper;
import com.itany.p2p.util.JDBCTemplate;

public class ApplyDaoImpl implements IApplyDao {
	
	private JDBCTemplate template;
	
	public ApplyDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//获取所有申请信息
	public List getAllApply(int applyProductId) throws DataAccessException{
		String sql = "select *from apply where applyproductid=?";
		List list = template.query(sql, new ApplyMapper(),applyProductId);
		return list;
	}
	
}
