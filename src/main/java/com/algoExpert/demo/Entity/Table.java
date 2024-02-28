package com.algoExpert.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@jakarta.persistence.Table(name = "task_table")
public class Table {


    @Id
    @GeneratedValue
    private int table_id;
    private String table_name;

//    relationships

//  constructors
        @JsonIgnore
        @ManyToOne
    private Project project;

    @OneToMany( cascade = CascadeType.ALL , mappedBy = "table")
    List<Task> tasks;

    public Table() {
    }

    public Table(int table_id, String table_name, Project project, List<Task> tasks) {
        this.table_id = table_id;
        this.table_name = table_name;
        this.project = project;
        this.tasks = tasks;
    }

    public Table(int i, String newTable, List<Task> tasks) {
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
