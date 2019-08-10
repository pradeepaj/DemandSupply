package com.hcl.demand.supply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.entity.Resource;
import com.hcl.demand.supply.repository.IResourceRepository;
import com.hcl.demand.supply.util.LevelConstant;

public class DemandServiceImpl implements IDemandService {

	@Autowired
	private IResourceRepository resourceRepository;

	@Override
	public List<ResourceDto> fetchResource() {

		List<ResourceDto> resourceDtos = null;
		List<Resource> resources = resourceRepository.findAllByStatus(LevelConstant.AVIALABLE);
		for (Resource resource : resources) {
			ResourceDto dto=new ResourceDto();
			dto.setEmpId(resource.getEmpId());			
		}
		return resourceDtos;
	}

	@Override
	public List<Resource> getRelevantResources(String skill) {
		Resource rsc = new Resource();
		rsc.setPrimarySkill(skill);
		List<Resource> listOfResources = resourceRepository.findBySkills(rsc);
		if(listOfResources.isEmpty()) {
			
		}
		return null;
	}
	
	

}
