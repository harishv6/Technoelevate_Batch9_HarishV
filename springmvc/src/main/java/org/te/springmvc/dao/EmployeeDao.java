package org.te.springmvc.dao;

import java.util.List;

import org.hibernate.sql.Update;
import org.te.springmvc.bean.EmployeeBean;

public interface EmployeeDao {
	
public EmployeeBean authenticate(int id, String pwd);
	
	public EmployeeBean getEmployee(int id);
	
	public boolean deleteEmployee(int id);
	
	public List<EmployeeBean> getAllEmployees();
	
	public String getUpdateform();

}
