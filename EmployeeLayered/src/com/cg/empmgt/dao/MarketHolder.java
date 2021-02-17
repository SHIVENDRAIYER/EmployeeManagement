package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.*;

public class MarketHolder {

	private MarketHolder() {}
	public static Map<Integer, Employee> market = new HashMap<>();

	/*
	 * public static int createId() {
	 * 
	 * int size = market.size() + 1;
	 * 
	 * return size; }
	 */
	

}
