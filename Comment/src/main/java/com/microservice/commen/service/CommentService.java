package com.microservice.commen.service;
import com.microservice.commen.config.RestTemplateConfig;
import com.microservice.commen.entity.Comment;
import com.microservice.commen.payload.Post;
import com.microservice.commen.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private RestTemplateConfig restTemplateConfig;

    public Comment saveComment(Comment comment){
        Post post = restTemplateConfig.getRestTemplate().getForObject("http://POST-SERVICE/api/posts/"+ comment.getPostId(),Post.class);

        if(post!=null){
            String commentId = UUID.randomUUID().toString();
            comment.setCommentId(commentId);
            Comment savedComment = commentRepository.save(comment);
           return savedComment ;
        }else {
             return null ;
        }
    }

    public List<Comment> getAllCommentByPostId(String postId) {
        List<Comment>  comments = commentRepository.findByPostId(postId);
        return comments;
    }

    }
