package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Assignees;
import com.algoExpert.demo.Entity.Members;
import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Repository.MemberRepository;
import com.algoExpert.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignessService {

	@Autowired
	private AssigneesRepository assigneesRepository;
	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private MemberRepository memberRepository;

//	 Assign task to member
	public Assignees assignTaskToMember(int member_id, int task_id){

		Assignees assignee = new Assignees(0, member_id, task_id);

		return assigneesRepository.save(assignee);
	}
}
