
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


 //  constructors



// @ManyToMany( mappedBy = "user", cascade = CascadeType.ALL)
// private List<Task> tasks;




 public User() {
 }

 public User(Integer user_id, String username, String email) {
  this.user_id = user_id;
  this.username = username;
  this.email = email;
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

}

