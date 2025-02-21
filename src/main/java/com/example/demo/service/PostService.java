package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    ArrayList<Post> posts = new ArrayList<>(List.of(
            new Post(0l, "Пост 1", new Date()),
            new Post(1l, "Пост 2", new Date()),
            new Post(2l, "Пост 22", new Date())
    ));

    public ArrayList<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long)posts.size(), text, new Date()));
    }
}
