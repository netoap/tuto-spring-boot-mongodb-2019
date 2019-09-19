package com.alex.tutomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alex.tutomongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
