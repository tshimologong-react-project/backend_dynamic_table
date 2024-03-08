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


    //    relationships
    @OneToMany(cascade = CascadeType.ALL)
    private List<Table> tables;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Members> membersList;

    @ManyToOne
    private User user;

    public Project() {
    }

    public Project(Integer project_id, String title, String description, List<Table> tables, List<Members> membersList, User user) {
        this.project_id = project_id;
        this.title = title;
        this.description = description;
        this.tables = tables;
        this.membersList = membersList;
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

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Members> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<Members> membersList) {
        this.membersList = membersList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
