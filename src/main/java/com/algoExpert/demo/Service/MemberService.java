package com.algoExpert.demo.Service;


import com.algoExpert.demo.Entity.Members;
import com.algoExpert.demo.Entity.Project;
import com.algoExpert.demo.Repository.ProjectRepository;
import com.algoExpert.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    public Project inviteMember (int project_id , int user_id){

        Project userproject = projectRepository.findById(project_id).get();
        List<Members> members =  userproject.getMembersList();
        Members newMember = new Members(0,user_id, project_id,null);
        members.add(newMember);
        userproject.setMembersList(members);

        return projectRepository.save(userproject);
    }
}
