package com.uzair.myapp.coderbyte.controller;

import com.uzair.myapp.coderbyte.model.User;
import com.uzair.myapp.coderbyte.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping
//    public ResponseEntity<?> createUser(@RequestBody User user) {
//        return userService.createUser(user)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.badRequest().build());
//    }
        @PostMapping
        public ResponseEntity<?> createUser(@RequestBody User user) {
        return userService.createUser(user)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build())
                .block(); // Blocks to resolve the reactive chain to a synchronous ResponseEntity.
        }
}
