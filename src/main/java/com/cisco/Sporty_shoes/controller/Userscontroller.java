package com.cisco.Sporty_shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cisco.Sporty_shoes.repo.UsersRepo;

@RestController
public class Userscontroller {
	
	@Autowired
	UsersRepo Urepo;
@RequestMapping("UserLogin")
public ModelAndView UL(@RequestParam("Uid") String Uid, @RequestParam("password") String Password) {
	 
	 if(Uid.equals("Sushma") && Password.equals("2710")) {
		 ModelAndView MV=new ModelAndView("Operation") ;
		 return MV;
		
	 }
	 else {
		 ModelAndView MV=new ModelAndView("UserLogin") ;
		 return MV;
		 
	 }
		 
}



}
