package com.validation.service.impl;

import com.validation.payload.PostDto;
import com.validation.repository.PostRepository;
import com.validation.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }
}
