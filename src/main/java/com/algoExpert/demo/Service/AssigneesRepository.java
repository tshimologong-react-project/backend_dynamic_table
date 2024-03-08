package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Assignees;
import com.algoExpert.demo.Entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssigneesRepository extends JpaRepository<Assignees,Integer> {

}
