package com.jy.shop.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class DoGet {

	/**
	 * 无参数 GET请求
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@Test
	public void testGet() throws ClientProtocolException, IOException{
		//1.创建 HttpClient 对象  (打开浏览器)
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		//2.创建 http GET 请求    (输入网址)
		HttpGet httpGet = new HttpGet("http://www.baidu.com");
		
		//3.执行请求   (按下回车键)
		//response 是执行完请求后得到的响应结果
		CloseableHttpResponse response = httpClient.execute(httpGet);
	
		//4.判断响应是否成功(状态码是否为 200)    
		if(response.getStatusLine().getStatusCode() == 200){
			// 获取响应正文   (浏览网页信息)
			String content = EntityUtils.toString(response.getEntity(),"UTF-8");
			System.out.println("===========以下为响应内容=========");
			System.out.println(content);
		}
		
		//释放资源   (关闭网页)
		if(response != null){
			response.close();
		}
		//关闭浏览器
		httpClient.close();
	}
	
	/**
	 * 有参数 GET请求
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	@Test
	public void testGetParam() throws ClientProtocolException, IOException, URISyntaxException{
		//1.创建 HttpClient 对象  (打开浏览器)
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		//2.定义请求参数 
		URI uri = new URIBuilder("http://www.baidu.com/s")
							.setParameter("wd", "java").build();
		
		//System.out.println(uri.toString());
		
		//3.创建 http GET 请求
		HttpGet httpGet = new HttpGet(uri);
		
		//4.执行请求   (按下回车键)
		CloseableHttpResponse response = httpClient.execute(httpGet);
		
		//5.判断响应是否成功(状态码是否为 200)    
		if(response.getStatusLine().getStatusCode() == 200){
			// 获取响应正文   (浏览网页信息)
			String content = EntityUtils.toString(response.getEntity(),"UTF-8");
			System.out.println("===========以下为响应内容=========");
			System.out.println(content);
		}
		
		//释放资源   (关闭网页)
		if(response != null){
			response.close();
		}
		//关闭浏览器
		httpClient.close();
	}
	
}
