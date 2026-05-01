package com.instance.userservice.model.key;

import lombok.*;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.UUID;

@PrimaryKeyClass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FollowingKey implements Serializable {

    @PrimaryKeyColumn(name = "user_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @EqualsAndHashCode.Include
    private UUID userId;

    @PrimaryKeyColumn(name = "following_user_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @EqualsAndHashCode.Include
    private UUID followingUserId;
}
