package com.hcl.demand.supply.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.demand.supply.entity.Resource;
@Repository
public interface IResourceRepository extends JpaRepository<Resource, Long> {

	List<Resource> findAllByStatus(String avialable);

	@Query("Select r from Resource r where r.primarySkill IN (:skills)")
	List<Resource> findBySkills(String primarySkill, String secondarySkill, String loctation, int experience,
			String otherSkill, String levelEnum);
	

}
