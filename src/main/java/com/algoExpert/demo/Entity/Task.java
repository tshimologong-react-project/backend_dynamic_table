package com.algoExpert.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private int task_id;
    private String title;
    private String description;
    private  String Owner;
    private String start_date;
    private String end_date;
    private String status;
    private String priority;
    private String comment;
    private List<Integer> col_width;
}
