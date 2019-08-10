package com.hcl.demand.supply.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.dto.SkillSet;
import com.hcl.demand.supply.entity.Resource;
import com.hcl.demand.supply.entity.Training;
import com.hcl.demand.supply.service.DemandServiceImpl;

@RestController
@RequestMapping("/demandsupply")
public class DemandSupplyController {
	
	@Autowired
	com.hcl.demand.supply.service.IDemandService IDemandService;
	
	@PostMapping("/demandsupply/{SkillSet}")
	public List<ResourceDto> demandByPM(@NotEmpty @PathVariable SkillSet skillset){
		List<ResourceDto> listofresources = IDemandService.getRelevantResources(skillset);
		return listofresources;
	}
	

}
