package com.algoExpert.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Optional;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer project_id;
    private String title;
    private String description;

    /*
    //    relationships
    @OneToMany
    private List<Table> tables;
*/


    @ManyToMany
    @JoinTable(
            name = "user_project",
            joinColumns =  @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> user;

    public Project() {
    }
//    constructors


    public Project(Integer project_id, String title, String description, List<User> user) {
        this.project_id = project_id;
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}

