package com.spring.blogzin.service;

import java.util.List;

import com.spring.blogzin.model.Post;

public interface BlogzinService {

	List<Post> findAll();

	Post findById(long id);

	Post save(Post post);

}
