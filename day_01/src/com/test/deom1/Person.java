package com.test.deom1;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String pname;
	private String[] ARRs;
	private List<String> list;
	private Map<String,String> map;
	private Properties properties; 

	public void setARRs(String[] aRRs) {
		ARRs = aRRs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	public void test1() {
		System.out.println("list:"+list);
		System.out.println("map:"+map);
		System.out.println("properties:"+properties);
		System.out.println("ARRs:"+ARRs);
	}
	
}
