package com.sac.java.configuration;


public class AbilityAnnotation {
	private String skill;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return  skill;
	}
}