package com.virtualpairprogrammers.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpairprogrammers.domain.Customer;
import com.virtualpairprogrammers.services.customers.CustomerManagementService;
import com.virtualpairprogrammers.services.customers.CustomerNotFoundException;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerManagementService customerManagmentService;
	
	@RequestMapping("/customer/{id}")
	//@ResponseBody, not needed if using @RestController
	public Customer getCustomerById(@PathVariable String id){
		Customer foundCustomer=null;
		try {
			foundCustomer= customerManagmentService.getFullCustomerDetail(id);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return foundCustomer;
	}
	
}
