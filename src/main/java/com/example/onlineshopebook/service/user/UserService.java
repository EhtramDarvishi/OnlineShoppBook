package com.example.onlineshopebook.service.user;

import com.example.onlineshopebook.dto.request.UserRequest;
import com.example.onlineshopebook.dto.response.UserResponse;
import com.example.onlineshopebook.model.User;

public interface UserService {
    UserResponse save(UserRequest user);
}
