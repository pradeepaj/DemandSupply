package com.hcl.demand.supply.dto;

import java.util.List;

public class SkillSet {

	  private List<String> primaryskill;
	  private List<String> secondaryskill;
	  private List<String> Location;
	  private int Experience;
	public List<String> getPrimaryskill() {
		return primaryskill;
	}
	public void setPrimaryskill(List<String> primaryskill) {
		this.primaryskill = primaryskill;
	}
	public List<String> getSecondaryskill() {
		return secondaryskill;
	}
	public void setSecondaryskill(List<String> secondaryskill) {
		this.secondaryskill = secondaryskill;
	}
	public List<String> getLocation() {
		return Location;
	}
	public void setLocation(List<String> location) {
		Location = location;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	@Override
	public String toString() {
		return "SkillSet [primaryskill=" + primaryskill + ", secondaryskill=" + secondaryskill + ", Location="
				+ Location + ", Experience=" + Experience + "]";
	}
	  
}
