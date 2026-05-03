package com.instance.userservice.controller;

import com.instance.userservice.dto.CreateUserRequest;
import com.instance.userservice.dto.UserProfileResponse;
import com.instance.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserProfileResponse createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
        return userService.createUserProfile(createUserRequest);
    }
}
