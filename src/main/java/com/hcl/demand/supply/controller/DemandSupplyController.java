package com.hcl.demand.supply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.service.IDemandService;

@RestController
@RequestMapping("/demandsupply")
public class DemandSupplyController {

	@Autowired
	private IDemandService iDemandService;

	@GetMapping("/showResources")

	public List<ResourceDto> showResoure() {
		iDemandService.fetchResource();
		return null;

	}

}
