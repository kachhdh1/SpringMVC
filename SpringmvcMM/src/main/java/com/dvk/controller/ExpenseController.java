package com.dvk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dvk.model.Expense;

@Controller
public class ExpenseController {

	//modelAttribute name will be bound to form command name
	//in the jsp
	@RequestMapping(value="/addExpense")
	public String addExpense(@ModelAttribute("expense") Expense expense){
		if(null!=expense && 0!=expense.getAmount())
			System.out.println("Adding RS "+expense.getAmount()+""
					+ " for "+expense.getPerson());
		return "addExpense";
	}
}
