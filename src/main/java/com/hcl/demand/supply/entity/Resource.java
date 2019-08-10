package com.hcl.demand.supply.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hcl.demand.supply.util.LevelEnum;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="resource")
public class Resource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	private String mailId;
	private String loctation;
	private String primarySkill;
	private String secondarySkill;
	private String otherSkill;
	private int age;
	private String status;
	private String phoneNumber;
	private String levelEnum;
}
