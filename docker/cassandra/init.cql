CREATE KEYSPACE IF NOT EXISTS user_service
    WITH replication = {
        'class': 'NetworkTopologyStrategy',
        'datacenter1': 1
        }
     AND durable_writes = true;
