package com.itany.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.jmx.snmp.Timestamp;

public class TestDate {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
		
		
	}
}
