package com.algoExpert.demo.Repository;

import com.algoExpert.demo.Entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Members,Integer> {


}
