package com.cg.springBootLab1point2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value("${sbu.Id}")
	private int sbuId;
	
	@Value("${sbu.Name}")
	private String sbuName;
	
	@Value("${sbu.Head}")
	private String sbuHead;

	public int getSbuId() {
		
		return sbuId;
	}

	public void setSbuId(int sbuId) {
		
		this.sbuId = sbuId;
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
	
	

}
