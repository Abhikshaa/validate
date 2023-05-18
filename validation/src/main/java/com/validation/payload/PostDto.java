package com.validation.payload;

import lombok.Data;

import java.util.List;

@Data
public class PostDto {

    private long id;
    private String tittle;
    private String description;
    private String content;

    private List<CommentDto> comments;
}
