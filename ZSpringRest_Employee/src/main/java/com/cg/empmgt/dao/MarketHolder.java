package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class MarketHolder {

	private MarketHolder() {}
	public static Map<Integer, Employee> market = new HashMap<>();
	
	public Map<Integer, Employee> getMarket() {
		
        return market;
    }

	
	

}
