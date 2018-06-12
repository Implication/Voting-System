package com.eduonix.votingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="citizen")
@Entity
public class Citizen {
	
	public Citizen() {
		super();
	}
	
	
	public Citizen(int i, String name) {
		super();
		this.id = (long) i;
		this.name = name;
	}
	
	@Id
	@Column(name="id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "citizen_name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	
	
	public Citizen(Long id, String name, Boolean hasVoted) {
		super();
		this.id = id;
		this.name = name;
		this.hasVoted = hasVoted;
	}

	@Column(name="hasvoted")
	private Boolean hasVoted;

	public Boolean getHasVoted() {
		return hasVoted;
	}

	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
	
	
}
