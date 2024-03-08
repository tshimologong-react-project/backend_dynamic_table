
package com.algoExpert.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

 @Id
 @GeneratedValue
 private Integer user_id;
 private String username;
 private String email;

 // relationships

 /*
  @OneToMany
  private List<Task> tasks;
*/
  @OneToMany(cascade = CascadeType.ALL)
  private List<Comment> comments;

 //  constructors

@OneToMany( cascade = CascadeType.ALL)
private List<Project> projects;

// @ManyToMany( mappedBy = "user", cascade = CascadeType.ALL)
// private List<Task> tasks;

 @OneToMany(cascade = CascadeType.ALL)
 private List<Members> membersList;


 public User() {
 }

 public User(Integer user_id, String username, String email, List<Comment> comments, List<Project> projects, List<Members> membersList) {
  this.user_id = user_id;
  this.username = username;
  this.email = email;
  this.comments = comments;
  this.projects = projects;
  this.membersList = membersList;
 }

 public Integer getUser_id() {
  return user_id;
 }

 public void setUser_id(Integer user_id) {
  this.user_id = user_id;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public List<Comment> getComments() {
  return comments;
 }

 public void setComments(List<Comment> comments) {
  this.comments = comments;
 }

 public List<Project> getProjects() {
  return projects;
 }

 public void setProjects(List<Project> projects) {
  this.projects = projects;
 }

 public List<Members> getMembersList() {
  return membersList;
 }

 public void setMembersList(List<Members> membersList) {
  this.membersList = membersList;
 }
}

