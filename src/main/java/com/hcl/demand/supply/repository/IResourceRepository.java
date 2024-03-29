package com.hcl.demand.supply.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.demand.supply.entity.Resource;
@Repository
public interface IResourceRepository extends JpaRepository<Resource, Long> {

	List<Resource> findAllByStatus(String avialable);

}
