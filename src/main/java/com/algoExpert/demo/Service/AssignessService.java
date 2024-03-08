package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Assignees;
import com.algoExpert.demo.Entity.Members;
import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Repository.MemberRepository;
import com.algoExpert.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AssignessService {

	@Autowired
	private AssigneesRepository assigneesRepository;
	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private MemberRepository memberRepository;

//	 Assign task to member
	public Assignees assignTaskToMember(int member_id, int task_id){

		Task task=   taskRepository.findById(task_id).get();
		Members member=   memberRepository.findById(task_id).get();

		Assignees assignee = new Assignees(0, member_id, task_id);

		return assigneesRepository.save(assignee);
	}
}
