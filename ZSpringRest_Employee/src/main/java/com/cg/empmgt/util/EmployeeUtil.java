package com.cg.empmgt.util;

import java.util.*;
import org.springframework.stereotype.Component;
import com.cg.empmgt.dto.EmployeeDetails;
import com.cg.empmgt.beans.Employee;

@Component
public class EmployeeUtil {
	
	public EmployeeDetails toDetails(Employee employee){
		
        EmployeeDetails details=new EmployeeDetails(employee.getId(), employee.getName(),employee.getDepartment());
        return details;
    }

    public List<EmployeeDetails> toDetailsList(Collection<Employee> employees){
    	
        List<EmployeeDetails>desired=new ArrayList<>();
        
        for (Employee employee:employees){
        	
            EmployeeDetails details=toDetails(employee);
            desired.add(details);
        }
        return desired;

    }


}
