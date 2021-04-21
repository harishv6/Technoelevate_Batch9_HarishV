package com.te.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvc.beans.EmployeeBean;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public EmployeeBean authenticate(int id, String pwd) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
		EntityManager manager = factory.createEntityManager();
		
		try {
			
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		
		if(bean!=null) {
			if(bean.getPassword().equals(pwd)) {
				System.out.println("Login Successful");
				return bean;
			} else {
				System.out.println("Invalid Password");
				return null;
			}
		} else {
			System.out.println("Invalid Login Credentials");
			return null;
		}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
		EntityManager manager = factory.createEntityManager();
		
		EmployeeBean bean = manager.find(EmployeeBean.class,id);
		
		return bean;
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
		EntityManager manager = factory.createEntityManager();
		
		EmployeeBean bean = manager.find(EmployeeBean.class,id);
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		boolean b = (bean!=null) ? true : false;
		
		if(b) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<EmployeeBean> getAllEmployees() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery(" from EmployeeBean "); 
		
		List<EmployeeBean> list = query.getResultList();
		
		return list;
	}
	
	
	
	
}
