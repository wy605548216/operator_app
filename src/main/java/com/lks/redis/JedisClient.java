package com.lks.redis;

import java.util.Map;

public interface JedisClient {
    String set(String key, String value);

    String get(String key);

    Boolean exists(String key);

    Long expire(String key, int seconds);

    Long ttl(String key);

    Long incr(String key);

    Long hset(String key, String field, String value);

    String hget(String key, String field);

    Long hdel(String key, String... field);

    // 清空redis
    void clearRedis();

    // 删除key
    void delKey(String key);

    void setToken(String key, String value);

    void updateToken(String key);

}
