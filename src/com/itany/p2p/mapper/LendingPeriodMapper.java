package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.util.RowMapper;

public class LendingPeriodMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws Exception {
		LendingPeriod lendingPeriod = new LendingPeriod();
		lendingPeriod.setLendingPeriodId(rs.getInt("LENDINGPERIODID"));
		lendingPeriod.setPeriod(rs.getString("PERIOD"));
		lendingPeriod.setStatus(rs.getInt("STATUS"));
		return lendingPeriod;
	}

}
