package com.spring.blogzin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.blogzin.model.Post;

public interface BlogzinRepository extends JpaRepository<Post, Long> {

	
}
