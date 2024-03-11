package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Members;
import com.algoExpert.demo.Entity.Project;
import com.algoExpert.demo.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/inviteMember/{project_id}/{user_id}")
    public Project inviteMember(@PathVariable int project_id, @PathVariable int user_id){

        return memberService.inviteMember(project_id,user_id);
    }

    @GetMapping("/getAllMembers")
    public List<Members> getAllMembers(){
        return memberService.getAllMembers();
    }
}