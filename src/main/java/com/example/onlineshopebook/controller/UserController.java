package com.example.onlineshopebook.controller;


import com.example.onlineshopebook.dto.request.UserRequest;
import com.example.onlineshopebook.dto.response.UserResponse;
import com.example.onlineshopebook.model.User;
import com.example.onlineshopebook.service.user.UserService;
import com.example.onlineshopebook.service.user.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<UserResponse> save(@RequestBody UserRequest user){
      return ResponseEntity.ok(userService.save(user));
    }
}
