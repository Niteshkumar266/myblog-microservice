package com.microservice.post.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "posts")
public class Post {
@Id
    private String id;
    private String title;
    private String description;
    private String content;

      }
