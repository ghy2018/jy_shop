package com.jy.shop.manager.test;

import java.util.HashSet;
import java.util.Set;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class DemoTest {

	/**
	 * 测试单机版 redis
	 */
//	@Test
//	public void test1(){
//		//获取 redis 的 Java 客户端对象
//		//需要两个参数   一个 host 的 ip,另一个 redis 的端口号
//		Jedis jedis = new Jedis("192.168.4.152", 6379);
//		//设置值
//		jedis.set("a", "1");
//		//取值
//		String string = jedis.get("a");
//		System.out.println(string);
//		//关闭连接
//		jedis.close();
//	}
	
	/**
	 * 使用连接池连接 redis
	 */
//	@Test
//	public void test2(){
//		//创建连接池
//		JedisPool jedisPool = new JedisPool("192.168.4.152", 6379);
//		//从连接池中获取连接
//		Jedis jedis = jedisPool.getResource();
//		jedis.set("b", "2");
//		String string = jedis.get("b");
//		System.out.println(string);
//		//归还连接
//		jedis.close();
//		//关闭连接池
//		jedisPool.close();
//	}
//	
	/**
	 * 连接 redis 集群
	 */
//	@Test
//	public void test3(){
//		Set<HostAndPort> nodes = new HashSet<>();
//		nodes.add(new HostAndPort("192.168.4.152", 7001));
//		nodes.add(new HostAndPort("192.168.4.152", 7002));
//		nodes.add(new HostAndPort("192.168.4.152", 7003));
//		nodes.add(new HostAndPort("192.168.4.152", 7004));
//		nodes.add(new HostAndPort("192.168.4.152", 7005));
//		nodes.add(new HostAndPort("192.168.4.152", 7006));
//		JedisCluster jedisCluster = new JedisCluster(nodes);
//		jedisCluster.set("c", "3");
//		String string = jedisCluster.get("c");
//		System.out.println(string);
//		jedisCluster.close();
//	}
//	
	//@Test
//	public void testUpload() throws Exception {
//		//创建一个配置文件。文件名任意。内容就是tracker服务器的地址。
//		//使用全局对象加载配置文件。
//		ClientGlobal.init("E:/ghy/workspace/Shop/shop-manager-web/src/main/resources/properties/tracker_server.conf");
//		//创建一个TrackerClient对象
//		TrackerClient trackerClient = new TrackerClient();
//		//通过TrackClient的 getConnection()方法 获得一个TrackerServer对象
//		TrackerServer trackerServer = trackerClient.getConnection();
//		//创建一个StrorageServer的引用，可以是null
//		StorageServer storageServer = null;
//		//创建一个StorageClient，参数需要TrackerServer和StrorageServer
//		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
//		//使用StorageClient的 upload_file()方法 上传文件。
//		String[] strings = storageClient.upload_file("C:/Users/HXZY/Desktop/a.jpg", "jpg", null);
//		for (String str : strings) {
//			System.out.println(str);
//		}
//		
//	}
//	
}