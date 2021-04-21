package org.te.springmvc.service;

import java.util.List;

import org.te.springmvc.bean.EmployeeBean;

public interface EmployeeService {
	
	public EmployeeBean authenticate(int id, String pwd);

	public EmployeeBean getEmployee(int id);

	public boolean deleteEmployee(int id);
	
	public List<EmployeeBean> getAllEmployees();

}
