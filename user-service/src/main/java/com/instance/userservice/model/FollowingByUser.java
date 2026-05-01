package com.instance.userservice.model;

import com.instance.userservice.model.key.FollowingKey;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("following_by_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FollowingByUser {

    @PrimaryKey
    private FollowingKey key;
}
