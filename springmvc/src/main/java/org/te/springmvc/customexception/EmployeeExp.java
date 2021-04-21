package org.te.springmvc.customexception;

public class EmployeeExp extends RuntimeException {
	
	private EmployeeExp msg;
	
	public EmployeeExp getException() {
		return msg;
		
	}

}
