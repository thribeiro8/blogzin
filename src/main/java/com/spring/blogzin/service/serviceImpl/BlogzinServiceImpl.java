package com.spring.blogzin.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.blogzin.model.Post;
import com.spring.blogzin.repository.BlogzinRepository;
import com.spring.blogzin.service.BlogzinService;

@Service
public class BlogzinServiceImpl implements BlogzinService {

	@Autowired
	BlogzinRepository blogzinRepository;

	@Override
	public List<Post> findAll() {
		return blogzinRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return blogzinRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return blogzinRepository.save(post);
	}

}
