package com.microservice.commen.repository;

import com.microservice.commen.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, String > {

    // Abstract method will change in Hql(Hibernate) query
  List<Comment> findByPostId(String postId);

}
