package com.svx_registry.services;

import com.svx_registry.obj.Comment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    List<Comment> comments = new ArrayList<>();

    private int id = 0;

    LocalDate datexample = LocalDate.of(1990, 5, 15);

    public CommentService() {
        this.comments.add(new Comment(this.id++,10001, "wagabababobo",datexample, "This car is kind of okay"));
        this.comments.add(new Comment(this.id++,10001, "wagaga",datexample, "This car sucks"));
        this.comments.add(new Comment(this.id++,10001, "wagagooga",datexample, "I wish I was dead"));
    }

    public Comment createComment(Comment comment) {
        comment.setId(this.id);
        this.comments.add(comment);
        return comment;
    }

    /*
    public List<Comment> getCommentsByFrame(long frame) {

    }

     */

    /*
    private int id;

    private int frame;

    private String authorName;

    private LocalDate timestamp;

    private String text;
    */

}
