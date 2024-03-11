package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Assignees;
import com.algoExpert.demo.Service.AssignessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssigneeController {

    @Autowired
    private AssignessService assignessService;

    @PostMapping("/saveAssignee/{member_id}/{task_id}")
    private Assignees saveAssignee(@PathVariable int member_id,@PathVariable int task_id ){
        return assignessService.assignTaskToMember(member_id,task_id);
    }
}
