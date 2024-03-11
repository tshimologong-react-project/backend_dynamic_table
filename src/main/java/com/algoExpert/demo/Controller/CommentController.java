package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Comment;
import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;
//
//    @PostMapping("/create/{userId}/{taskId}")
//    private Task createComment(@PathVariable int userId, @RequestBody Comment comment, @PathVariable int taskId){
//        return commentService.createComment(userId,comment,taskId);
//    }
//
    @GetMapping("/all")
    private List<Comment> getUsers(){
        return commentService.getAllComments();
    }
//
//    @PutMapping("/edit/{commentId}")
//    private Comment editComment(@PathVariable int commentId,@RequestBody Comment comment){
//        return commentService.editComment(commentId,comment);
//    }
//
//    @DeleteMapping("/delete/{commentId}")
//    List<Comment> deleteComment(@PathVariable int commentId){
//        return commentService.deleteComment(commentId);
//    }

        @PostMapping("/create/{member_id}/{task_id}")
        private Comment createComment(@RequestBody Comment comment, @PathVariable int member_id,@PathVariable int task_id){
        return commentService.createComment(comment,member_id,task_id);
    }
}
