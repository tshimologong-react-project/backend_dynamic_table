package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Comment;
import com.algoExpert.demo.Entity.Project;
import com.algoExpert.demo.Entity.Table;
import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Repository.ProjectRepository;
import com.algoExpert.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskService {
     @Autowired
     private TaskRepository taskRepository;
     @Autowired
     private ProjectRepository projectRepository;

    public Task addTask(Task task){
     return taskRepository.save(task); }

    public List<Task> getAllTask(){
        return (List<Task>) taskRepository.findAll();
    }

    public Project createTable(Integer id){
         Project project =  projectRepository.findById(id).get();
         List<Table>  storedTable =   project.getTables();

         List<Comment> comment = new ArrayList<>();

         Task firstTask = new Task( 0, "","","","","","","",comment);

         List<Task> tasks = new ArrayList<>();
         tasks.add(firstTask);
         tasks.add(firstTask);

         Table tables = new Table(0,"New table",tasks);
         storedTable.add(tables);

         project.setTables(storedTable);

         return projectRepository.save(project);
    }
}

