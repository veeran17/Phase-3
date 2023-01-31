package com.cisco.Sporty_shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cisco.Sporty_shoes.repo.AdminRepo;

@RestController
public class Admincontroller{
	
	@Autowired
	AdminRepo Arepo;
	
	@RequestMapping("AdminLogin")
	public ModelAndView UL(@RequestParam("Aid") String Uid, @RequestParam("Password") String Password) {
		 
		 if(Uid.equals("SushmaSpoti") && Password.equals("0810")) {
			 ModelAndView MV=new ModelAndView("Adminop") ;
			 return MV;
			
		 }
		 else {
			 ModelAndView MV=new ModelAndView("AdminLogin") ;
			 return MV;
			 
			
	
		 }
	
	}
	
	
}
