package com.example.onlineshopebook.service.user;

import com.example.onlineshopebook.dto.request.UserRequest;
import com.example.onlineshopebook.dto.response.UserResponse;
import com.example.onlineshopebook.exception.RuleException;
import com.example.onlineshopebook.model.User;
import com.example.onlineshopebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse save(UserRequest userRequest) {
        Optional<User> findByUserName = userRepository.findByUsername(userRequest.getUserName());
        if (findByUserName.isPresent())
            throw new RuleException("username is exist.");
        User user = createUser(userRequest);
        User userSave = userRepository.save(user);
        return createUserResponse(userSave);
    }

    private  User createUser(UserRequest userRequest) {
        User user = User.builder()
                .username(userRequest.getUserName())
                .password(userRequest.getPassword())
                .build();
        return user;
    }

    private UserResponse createUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .userName(user.getUsername())
                .build();
    }
}
