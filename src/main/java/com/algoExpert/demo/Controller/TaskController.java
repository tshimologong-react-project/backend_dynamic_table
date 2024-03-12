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

//    @PostMapping("/saveTask")
//    public Task saveTask(@RequestBody Task tasks){
//        return taskService.addTask(tasks);
//    }
    @GetMapping("/getAllTask")
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

   @PostMapping("/createTable/{project_id}/{member_id}")
    public Project createTable(@PathVariable Integer project_id,@PathVariable int member_id){
        return taskService.createTable(project_id,member_id);
    }

   @PostMapping("/createTask/{member_id}/{table_id}")
    public Table createTask(@PathVariable int member_id,@PathVariable int table_id){
        return taskService.createTask(member_id,table_id);
    }


}
