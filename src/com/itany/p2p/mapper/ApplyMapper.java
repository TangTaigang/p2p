package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.Apply;
import com.itany.p2p.util.RowMapper;

public class ApplyMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs) throws Exception {
		Apply apply = new Apply();
		apply.setApplyId(rs.getInt("APPLYID"));
		apply.setApplyPerson(rs.getString("APPLYPERSON"));
		apply.setApplyPersonIDCard(rs.getString("APPLYPERSONIDCARD"));
		apply.setApplyNum(rs.getInt("APPLYNUM"));
		apply.setApplyDate(rs.getDate("APPLYDATE"));
		apply.setApplyProductName(rs.getString("APPLYPRODUCTNAME"));
		apply.setApplyProductId(rs.getInt("APPLYPRODUCTID"));
		return apply;
	}

}
