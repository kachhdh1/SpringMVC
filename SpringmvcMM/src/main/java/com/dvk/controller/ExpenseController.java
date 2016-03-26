package com.dvk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dvk.model.Category;
import com.dvk.model.Expense;

@Controller
public class ExpenseController {

	//modelAttribute name will be bound to form command name
	//in the jsp
	@RequestMapping(value="/addExpense")
	public String addExpense(@ModelAttribute("expense") Expense expense){
		if(null!=expense && 0!=expense.getAmount()){
			System.out.println("Adding RS "+expense.getAmount()+""
					+ " for "+expense.getPerson());
			System.out.println("Category :"+expense.getCategory());
		}
		return "addExpense";
	}
	
	@RequestMapping(value="/categories", method=RequestMethod.GET)
	public @ResponseBody List<Category> findAllCategories(){
		List<Category> categoryList = new ArrayList<Category>();
		Category food = new Category();
		food.setName("food");
		Category petrol = new Category();
		petrol.setName("petrol");
		categoryList.add(food);
		categoryList.add(petrol);
		return categoryList;
	}
	
	
}
