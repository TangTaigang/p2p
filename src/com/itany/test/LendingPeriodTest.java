package com.itany.test;

import java.util.List;

import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ILendingPeriodService;
import com.itany.p2p.service.impl.LendingPeriodServiceImpl;

import junit.framework.TestCase;

public class LendingPeriodTest extends TestCase {
	ILendingPeriodService lendingPeriodService;
	
	@Override
	protected void setUp() throws Exception {
		lendingPeriodService = new LendingPeriodServiceImpl();
	}
	
	public void testGetLendingPeriod() throws ServiceException{
		List list = lendingPeriodService.getLendingPeriod();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((LendingPeriod)list.get(i)).getPeriod());
		}
		
	}

}
