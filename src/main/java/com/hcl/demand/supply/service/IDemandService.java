package com.hcl.demand.supply.service;

import java.util.List;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.entity.Resource;

public interface IDemandService {
	
	List<ResourceDto> fetchResource();

	List<Resource> getRelevantResources(List<String> skill);
	
}
