package com.instance.userservice.dto;

import java.util.UUID;

public record UserProfileResponse(UUID userId, String username, String displayName, String bio) {
}
