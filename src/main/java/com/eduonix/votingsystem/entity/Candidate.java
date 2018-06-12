package com.eduonix.votingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "candidate")
@Entity
public class Candidate {
	@Id
	@Column(name = "ID")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "candidate_name")
	private String name;

	public Candidate(int  i, String candidate_name) {
		super();
		this.id =  (long) i;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCandidate_name(String name) {
		this.name = name;
	}

	public Candidate() {
		super();
	}
	
	@Column(name ="numberOfVotes")
	private Integer numOfVotes;

	public Integer getNumOfVotes() {
		return numOfVotes;
	}

	public void setNumOfVotes(Integer numOfVotes) {
		this.numOfVotes = numOfVotes;
	}
	
	
}
