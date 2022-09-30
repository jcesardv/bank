package org.bank.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkus.redis.datasource.RedisDataSource;
import io.quarkus.redis.datasource.hash.HashCommands;
import io.vertx.redis.client.RedisAPI;

@ApplicationScoped
public class BalanceServiceImpl {
    private static final String MY_KEY = "my-key";
    @Inject RedisAPI lowLevelClient;

    private final HashCommands<String, String, String> commands;

    public BalanceServiceImpl(RedisDataSource ds) { 
        commands = ds.hash(String.class); 
    }

    public void set(String field, String value) {
        commands.hset(MY_KEY, field, value); 
    }

}
