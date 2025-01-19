package com.uzair.myapp.coderbyte.controller;

import com.uzair.myapp.coderbyte.service.GoRestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GoRestController {
    private final GoRestService goRestService;

    public GoRestController(GoRestService goRestService) {
        this.goRestService = goRestService;
    }

    @GetMapping("/users")
    public Object getUsers() {
        return goRestService.getUsers();
    }

    @GetMapping("/posts")
    public Object getPosts() {
        return goRestService.getPosts();
    }

    @GetMapping("/comments")
    public Object getComments() {
        return goRestService.getComments();
    }
}
