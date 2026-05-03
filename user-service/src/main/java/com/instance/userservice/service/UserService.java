package com.instance.userservice.service;

import com.instance.userservice.dto.CreateUserRequest;
import com.instance.userservice.dto.UserProfileResponse;
import com.instance.userservice.model.UserProfile;
import com.instance.userservice.repository.UserProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserProfileRepository userProfileRepository;

    public UserProfileResponse createUserProfile(CreateUserRequest createUserRequest) {

        UserProfile userProfile = new UserProfile(
                UUID.randomUUID(),
                createUserRequest.username(),
                createUserRequest.displayName(),
                createUserRequest.bio()
        );

        return toResponse(userProfileRepository.save(userProfile));
    }

    private UserProfileResponse toResponse(UserProfile userProfile) {
        return new UserProfileResponse(
                userProfile.getUserId(),
                userProfile.getUsername(),
                userProfile.getDisplayName(),
                userProfile.getBio());
    }
}
