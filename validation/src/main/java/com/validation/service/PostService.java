package com.validation.service;

import com.validation.payload.PostDto;
import org.hibernate.event.spi.PostDeleteEvent;

public interface PostService {

    public PostDto createPost(PostDto postDto);
}
