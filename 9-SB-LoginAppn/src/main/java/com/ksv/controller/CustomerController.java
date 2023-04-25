package com.ksv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ksv.model.Customer;
import com.ksv.model.Login;
import com.ksv.service.CustomerServiceImp;

@Controller
public class CustomerController {

	@Autowired
	private CustomerServiceImp service;

	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/add")
	public String regForm(Model model)
	{
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "reg";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String addForm(@ModelAttribute Customer customer, Model model)
	{
		Customer cus=service.saveCustomer(customer);
		return "sucess";
	}
	@RequestMapping("/loginform")
	public String loginForm(Model model)
	{
		Login login=new Login();
		model.addAttribute("login",login);
		return "login";
		
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String addForm(@ModelAttribute Login login, Model model)
	{
		Customer log=service.login(login.getCname(),login.getPassword());
		String message=null;
		if(log!=null)
		{
			message="Your Logined Success fully";
		}
		else {
			message="redirect:/login";
		}
		
		model.addAttribute("message",message);
		return "loginsucess";
	}
}
