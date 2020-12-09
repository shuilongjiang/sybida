package com.sy.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * https://blog.csdn.net/zzhongcy/article/details/102584028
 *
 * StringRedisTemplate，存储字符串类型
 * RedisTemplate, 存储对象类型
 *
 * Jedis：是Redis 老牌的Java实现客户端，提供了比较全面的Redis命令的支持，  SpringBoot 1.5 默认
 * Redisson：实现了分布式和可扩展的Java数据结构。
 * Lettuce：高级Redis客户端，用于线程安全同步，异步和响应使用，支持集群，Sentinel，管道和编码器。
 *
 * Lettuce和jedis 的都是连接 Redis Server的客户端，
 * Jedis 在实现上是直连 redis server，多线程环境下非线程安全，除非使用连接池（Jedis Pool）
 * 为每个 redis实例增加物理连接。
 *
 * Lettuce 是一种可伸缩，线程安全，完全非阻塞的Redis客户端，多个线程可以共享一个RedisConnection,
 * 它利用Netty NIO 框架来高效地管理多个连接，从而提供了异步和同步数据访问方式，
 * 用于构建非阻塞的反应性应用程序。
 *
 * 在springboot 1.5.x版本的默认的Redis客户端是 Jedis实现的，
 * springboot 2.x版本中默认客户端是用 lettuce实现的。
 *
 *
 */
@Component
public class RedisUtil {
    @Autowired
    private RedisOpsUtil redisOpsUtil;

    public void setObj(String key, Object obj, long timeout) {
        redisOpsUtil.set(key,obj,timeout);
    }
    public Object getObj(String key) {
        return redisOpsUtil.get(key);
    }

}
