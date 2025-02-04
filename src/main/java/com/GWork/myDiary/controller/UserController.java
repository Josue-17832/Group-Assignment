package com.GWork.myDiary.controller;

import com.GWork.myDiary.entity.User;
import com.GWork.myDiary.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/signup")
    public ResponseEntity<User> signup(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return ResponseEntity.status(201).body(newUser);
    }
}
