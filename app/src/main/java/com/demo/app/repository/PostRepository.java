package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.app.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
