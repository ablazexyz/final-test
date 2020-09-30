package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.CustomerDao;
import com.lti.model.Admin;
import com.lti.model.Customer_Details;
import com.lti.model.Login;
import com.lti.model.Registration;

@Service("service")
@Scope(scopeName = "singleton")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao dao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void createRegistration(Registration reg) {
	
		dao.addRegistration(reg);

	}
	
	public Registration findRegistrationDetailsbyEmail(String email) {
		
		return dao.getRegistrationDetailsbyEmail(email);
	}
	
	public List<Registration> findAllRegistrations(){
		
		return dao.getAllRegistrations();
	}
	
	public List<Admin> findAllAdmins() {
		
		return dao.getAllAdmins();
	}
	
	
	public Customer_Details findCustomerDetailsbyEmail(String email) {
		
		return dao.getCustomerDetailsbyEmail(email);
	}
	
	/*
	public List<Application> findAllApplicationsbyEmail(String email){
		
		return dao.getAllApplicationsbyEmail(email);
	}
	*/
	
	public List<Customer_Details> findAllCustomerDetails(){
		
		return dao.getAllCustomerDetails();
	}
	
	/*
	public List<Application> findAllApplications(){
		
		return dao.getAllApplications();
	}
	*/
	
	public boolean verifyLogin(Login login) {
		
		try {
			Admin adm = dao.getAdminDetailsbyEmail(login.getAdemail());
			if (adm.getAdpassword().equals(login.getAdpass())) {
				return true;
			}
			
		}
		catch(Exception e) {
			return false;
		}
		return false;
		
	}
	
	
}
