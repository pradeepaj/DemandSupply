package com.hcl.demand.supply.controller;


import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demand.supply.entity.Resource;
import com.hcl.demand.supply.entity.Training;

@RestController
@RequestMapping("/demandsupply")
public class DemandSupplyController {
	
	@PostMapping("/recommendedResources")
	public List<List<Resource>,List<Training>> recommendedReSources(@PathVariable SkillSet){
		
		
	}
	

}
