package com.microservice.commen.payload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    private String postId;
    private String title;
    private String description;
    private String content;

                 }
