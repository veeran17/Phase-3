package com.cisco.Sporty_shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cisco.Sporty_shoes.Entity.Product;
import com.cisco.Sporty_shoes.repo.ProductRepo;
import java.util.List;

@RestController
public class Productcontroller {
	
	@Autowired
	ProductRepo Prepo;
	
	@RequestMapping("Store")
	public String Store (@RequestParam("Pid") String Pid, @RequestParam("Pname") String Pname, @RequestParam("PP") String PP) 
	{
		 Product P=new Product(Pid,Pname,Integer.parseInt(PP));
		 Prepo.save(P);
		 return "Successfully added";
		
	
	}

	
	@GetMapping("GetProducts")
	public ModelAndView GetProducts()
	{
		ModelAndView MV=new ModelAndView("Get") ;
		List<Product> Plist=Prepo.findAll();
		MV.addObject("Plist",Plist);
		 return MV;
		 
	}
}
