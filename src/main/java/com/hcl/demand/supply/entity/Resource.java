package com.hcl.demand.supply.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "resource")
public class Resource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	private String name;
	private String mailId;
	private String loctation;
	private String primarySkill;

	private String secondarySkill;
	private String otherSkill;
	private int age;
	private int experience;
	private String status;
	private String phoneNumber;
	private String level;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getLoctation() {
		return loctation;
	}

	public void setLoctation(String loctation) {
		this.loctation = loctation;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public String getOtherSkill() {
		return otherSkill;
	}

	public void setOtherSkill(String otherSkill) {
		this.otherSkill = otherSkill;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Resource [empId=" + empId + ", name=" + name + ", mailId=" + mailId + ", loctation=" + loctation
				+ ", primarySkill=" + primarySkill + ", secondarySkill=" + secondarySkill + ", otherSkill=" + otherSkill
				+ ", age=" + age + ", experience=" + experience + ", status=" + status + ", phoneNumber=" + phoneNumber
				+ ", levelEnum=" + level + "]";
	}
}
