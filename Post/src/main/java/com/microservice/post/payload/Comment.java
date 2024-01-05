package com.microservice.post.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    private String commentId;
    private String name;
    private String email ;
    private String body;
    private String postId;
}
