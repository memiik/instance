package com.instance.userservice.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Table("users_by_id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserProfile {

    @PrimaryKey("keycloak_user_id")
    private UUID keycloakUserId;

    @Column("username")
    private String username;

    @Column("display_name")
    private String displayName;

    @Column("bio")
    private String bio;
}
