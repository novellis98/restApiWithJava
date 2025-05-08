package com.example.firstRestApi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstRestApi.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
