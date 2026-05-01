package com.instance.userservice.model;

import com.instance.userservice.model.key.FollowerKey;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("followers_by_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FollowersByUser {

    @PrimaryKey
    private FollowerKey key;
}
