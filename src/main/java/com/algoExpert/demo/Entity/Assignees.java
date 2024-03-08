package com.algoExpert.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Assignees {

	@Id
	@GeneratedValue
	private Integer Assignees_id;

	private Integer member_id;

	private Integer task_id;


	public Assignees() {
	}

	public Assignees(Integer assignees_id, Integer member_id, Integer task_id) {
		Assignees_id = assignees_id;
		this.member_id = member_id;
		this.task_id = task_id;
	}

	public Integer getAssignees_id() {
		return Assignees_id;
	}

	public void setAssignees_id(Integer assignees_id) {
		Assignees_id = assignees_id;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}
}
