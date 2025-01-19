package com.uzair.myapp.coderbyte.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class GoRestService {
    private static final String BASE_URL = "https://gorest.co.in/public/v2/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Object getUsers() {
        return restTemplate.getForObject(BASE_URL + "users", Object.class);
    }

    public Object getPosts() {
        return restTemplate.getForObject(BASE_URL + "posts", Object.class);
    }

    public Object getComments() {
        return restTemplate.getForObject(BASE_URL + "comments", Object.class);
    }
}
