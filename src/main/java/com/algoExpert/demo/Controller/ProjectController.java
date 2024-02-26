package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Project;
import com.algoExpert.demo.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @PostMapping("/createProject/{user_id}")
    public Project create(@RequestBody Project project,@PathVariable Integer user_id){
        return projectService.createProject(project,user_id);
    }

    @GetMapping("/findAllProject")
    public List<Project> getAllProject(){
        return projectService.getAllProjects();
    }



}
