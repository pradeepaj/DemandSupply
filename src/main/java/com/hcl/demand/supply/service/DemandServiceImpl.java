package com.hcl.demand.supply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.entity.Resource;
import com.hcl.demand.supply.repository.IResourceRepository;
import com.hcl.demand.supply.util.LevelConstant;

@Service
public class DemandServiceImpl implements IDemandService {

	@Autowired
	private IResourceRepository resourceRepository;

	@Override
	public List<ResourceDto> fetchResource() {

		List<ResourceDto> resourceDtos = new ArrayList<>();
		List<Resource> resources = resourceRepository.findAllByStatus(LevelConstant.AVIALABLE);

		for (Resource resource : resources) {
			ResourceDto dto = new ResourceDto();
			dto.setEmpId(resource.getEmpId());
			dto.setMailId(resource.getMailId());
			dto.setName(resource.getName());
			dto.setExperience(resource.getExperience());
			dto.setLevel(resource.getLevel());
			dto.setLoctation(resource.getLoctation());
			dto.setPrimarySkill(resource.getPrimarySkill());
			dto.setSecondarySkill(resource.getSecondarySkill());
			dto.setPhoneNumber(resource.getPhoneNumber());
			dto.setPhoneNumber(resource.getPhoneNumber());
			dto.setOtherSkill(resource.getOtherSkill());
			dto.setExperience(resource.getExperience());
			resourceDtos.add(dto);
		}

		return resourceDtos;
	}

}
