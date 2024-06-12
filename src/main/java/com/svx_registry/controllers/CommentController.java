package com.svx_registry.controllers;

import com.svx_registry.obj.Comment;
import com.svx_registry.services.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) { this.commentService = commentService; }

    @PostMapping("create")
    public Comment createComment(@RequestBody Comment comment) { return this.commentService.createComment(comment); }

    @GetMapping("{id}")
    public List<Comment> getCommentsByFrame(@PathVariable long id) { return commentService.getCommentsByFrame(id); }
}
