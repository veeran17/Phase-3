package com.cisco.Sporty_shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.Sporty_shoes.Entity.Report;
import com.cisco.Sporty_shoes.repo.ReportRepo;

@RestController
public class Reportcontroller {
	
	@Autowired
	ReportRepo Rrepo;
	@RequestMapping("addsale/{pid}/{price}")
    public String addsale(@PathVariable("pid") String pid,@PathVariable("price") int price) {
        Report s=new Report();
        
       s.setPid(pid);
       s.setPP(price);
        Rrepo.save(s);
        return "successfully bought";
    }

}
