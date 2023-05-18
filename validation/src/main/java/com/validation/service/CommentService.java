package com.validation.service;

import com.validation.payload.CommentDto;

public interface CommentService {

    public CommentDto createComment(long postId,CommentDto commentDto);
}
