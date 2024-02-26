package com.algoExpert.demo.Service;

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

        return projectRepository.save(project);
    }


    public List<Project> getAllProjects(){return projectRepository.findAll(); }


//    public Project findByProjectName(String projectTitle){
//        return projectRepository.findByProject(projectTitle).get();
//    }


}
