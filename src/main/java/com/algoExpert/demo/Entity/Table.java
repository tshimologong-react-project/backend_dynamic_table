package com.algoExpert.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Table {
    @Id
    @GeneratedValue
    private int table_id;
    private String table_name;

    @OneToMany
    List<Task> tasks;

}
