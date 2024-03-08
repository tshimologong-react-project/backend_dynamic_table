package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Members;
import com.algoExpert.demo.Entity.Project;
import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Repository.ProjectRepository;
import com.algoExpert.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;



    public Project createProject(Project project,Integer user_id)
    {
        User user=userRepository.findById(user_id).get();
        project.setUser(user);
        Project savedProjects =projectRepository.save(project);

        List<Members> members =  savedProjects.getMembersList();
        Members newMember = new Members(0,user.getUser_id(), savedProjects.getProject_id(),null);
        members.add(newMember);
        project.setMembersList(members);
        return projectRepository.save(savedProjects);
    }

    public List<Project> getAllProjects(){return projectRepository.findAll(); }


//    public Project findByProjectName(String projectTitle){
//        return projectRepository.findByProject(projectTitle).get();
//    }


}
