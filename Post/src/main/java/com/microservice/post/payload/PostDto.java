package com.microservice.post.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostDto {
    private String postId;
    private String title;
    private String description ;
    private String content ;

    List<Comment> comments;


}
