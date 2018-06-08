package com.jy.shop.common.jedis;

import java.util.List;

/**
 * jedisClient 接口
 * 	有两个实现类
 * 		一个是操作 redis 单机版
 * 		一个是操作 redis 集群版
 * @author Administrator
 *
 */

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
	Boolean hexists(String key, String field);
	List<String> hvals(String key);
	Long del(String key);
}
