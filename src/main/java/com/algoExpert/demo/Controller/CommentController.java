package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Comment;
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

    @PostMapping("/create/{userId}")
    private Comment createComment(@PathVariable int userId, @RequestBody Comment comment){
        return commentService.createComment(userId,comment);
    }

    @GetMapping("/all")
    private List<Comment> getUsers(){
        return commentService.getAllComments();
    }

    @PutMapping("/edit/{commentId}")
    private Comment editComment(@PathVariable int commentId,@RequestBody Comment comment){
        return commentService.editComment(commentId,comment);
    }

    @DeleteMapping("/delete/{commentId}")
    List<Comment> deleteComment(@PathVariable int commentId){
        return commentService.deleteComment(commentId);
    }
}
