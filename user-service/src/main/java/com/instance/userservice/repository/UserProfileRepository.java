package com.instance.userservice.repository;

import com.instance.userservice.model.UserProfile;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserProfileRepository extends CassandraRepository<UserProfile, UUID> {
}
