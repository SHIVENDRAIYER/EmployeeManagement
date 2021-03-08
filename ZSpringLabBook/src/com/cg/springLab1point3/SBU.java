package com.cg.springLab1point3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value("${sbu.Code}")
	private int sbuCode;
	
	@Value("${sbu.Name}")
	private String sbuName;
	
	@Value("${sbu.Head}")
	private String sbuHead;
	
	@Autowired
	private List<Employee>emplist;


	public int getSbuCode() {
		
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		
		this.sbuHead = sbuHead;
	}
	
	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	
	

}
