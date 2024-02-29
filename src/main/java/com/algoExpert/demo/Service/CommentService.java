package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Comment;
import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Repository.CommentRepository;
import com.algoExpert.demo.Repository.TaskRepository;
import com.algoExpert.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private TaskRepository taskRepository;

    public User createComment(int userId,Comment comment, int taskId){


        User findUser =  userRepository.findById(userId).get();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        comment.setDate_created(simpleDateFormat.format(new Date()));

        comment.setUsername(findUser.getUsername());
        
        Task task = taskRepository.findById(taskId).get();
        List<Comment> commentTask = task.getComments();
        List<Comment> commentUser=findUser.getComments();
        commentTask.add(comment);
        commentUser.add(comment);
        findUser.setComments(commentUser);

        task.setComments(commentTask);

        taskRepository.save(task);


        return userRepository.save(findUser);

    }

    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    public Comment editComment(int commentId,Comment newComment){
        return commentRepository.findById(commentId)
                .map(oldComment -> {oldComment.setComment(newComment.getComment());
                return commentRepository.save(oldComment);}).orElseThrow();
    }

    public List<Comment> deleteComment(int commentId){
        Comment findComment = commentRepository.findById(commentId).orElseThrow(()->new IllegalArgumentException("comment with Id "+commentId+" does not exist"));
        if(findComment !=null){
            commentRepository.deleteById(commentId);
            return commentRepository.findAll();
        }

        return null;
    }
}
