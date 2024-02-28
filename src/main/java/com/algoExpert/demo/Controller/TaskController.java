package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Project;
import com.algoExpert.demo.Entity.Table;
import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task tasks){
        return taskService.addTask(tasks);
    }
    @GetMapping("/getAllTask")
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

   @PostMapping("/createTask/{project_id}")
    public Project createTable(@PathVariable Integer project_id){
        return taskService.createTable(project_id);
    }

}
