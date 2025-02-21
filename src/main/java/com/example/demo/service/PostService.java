package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post("Пост 1", new Date()));
        posts.add(new Post("Пост 2", new Date()));
        posts.add(new Post("Пост 22", new Date()));

        return posts;
    }
}
