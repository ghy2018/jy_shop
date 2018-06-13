package com.jy.shop.httpclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class DoPost {

	/**
	 * 无参的 post 请求
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@Test
	public void testPost() throws ClientProtocolException, IOException {
		// 1.创建Httpclient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();

		// 2.创建http POST请求
		HttpPost httpPost = new HttpPost("http://www.oschina.net/");

		// 3.执行请求
		CloseableHttpResponse response = httpclient.execute(httpPost);
		// 4.判断返回状态是否为200
		if (response.getStatusLine().getStatusCode() == 200) {
			String content = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println(content);
		}
		if (response != null) {
			String content = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println(content);
			response.close();
		}
		httpclient.close();

	}

	@Test
	public void testPostParam() throws ClientProtocolException, IOException {
		// 1.创建Httpclient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();

		// 2.创建http POST请求
		HttpPost httpPost = new HttpPost("http://www.oschina.net/search");

		List<NameValuePair> parameters = new ArrayList<NameValuePair>(0);
		parameters.add(new BasicNameValuePair("scope", "project"));
		parameters.add(new BasicNameValuePair("q", "java"));
		
		// 3.构造一个form表单式的实体
		UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters, "UTF-8");
		// 将请求实体设置到httpPost对象中
		httpPost.setEntity(formEntity);

		// 4.执行请求
		CloseableHttpResponse response = httpclient.execute(httpPost);
		// 5.判断返回状态是否为200
		if (response.getStatusLine().getStatusCode() == 200) {
			String content = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println(content);
		}
		// 6.释放资源
		if (response != null) {
			String content = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println(content);
			response.close();
		}
		httpclient.close();

	}

}
