package com.jy.shop.front.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.shop.front.pojo.HttpResult;


@Service
public class HttpClientService {

	@Autowired
    private CloseableHttpClient httpClient;
	
    @Autowired
    private RequestConfig requestConfig;
    
    /**
     * 封装无参 GET 请求
     * @param url
     * @return
     * @throws IOException
     */
    public String doGet(String url) throws IOException {
        //创建httpClient对象
        CloseableHttpResponse response = null;
        HttpGet httpGet = new HttpGet(url);
        //设置请求参数
        httpGet.setConfig(requestConfig);
        try {
            //执行请求
            response = httpClient.execute(httpGet);
            //判断返回状态码是否为200
            if (response.getStatusLine().getStatusCode() == 200){               
                return EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return null;
    }

    /**
     * 带参 GET 请求
     * @param url
     * @param params
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public String doGet(String url, Map<String, String> params)
            throws IOException, URISyntaxException {
        URIBuilder builder = new URIBuilder(url);
        for (String key : params.keySet()) {
            builder.addParameter(key, params.get(key));
        }
        URI uri = builder.build();
        return doGet(uri.toString());
    }

    /**
     * 带参的 POST 请求
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public HttpResult doPost(String url, Map<String, String> params)
            throws IOException {
        HttpPost httpPost = new HttpPost(url);
        //设置请求参数
        httpPost.setConfig(requestConfig);
        if (params != null) {
            List<NameValuePair> parameters = new ArrayList<>();
            for (String key : params.keySet()) {
                parameters.add(new BasicNameValuePair(key, params.get(key)));
            }
            //构建一个form表单式的实体
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(
                    parameters, Charset.forName("UTF-8"));
            //将请求实体放入到httpPost中
            httpPost.setEntity(formEntity);
        }
        //创建httpClient对象
        CloseableHttpResponse response = null;
        try {
            //执行请求
            response = httpClient.execute(httpPost);
            return new HttpResult(response.getStatusLine().getStatusCode(),
                    EntityUtils.toString(response.getEntity()));
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

    /**
     * 无参的 POST 请求
     * @param url
     * @return
     * @throws IOException
     */
    public HttpResult doPost(String url) throws IOException {
        return doPost(url, null);
    }

    /**
     * 参数为 json格式 的 POST 请求
     * @param url
     * @param json
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public HttpResult doPostJson(String url, String json)
            throws ClientProtocolException, IOException {
        // 创建http POST请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(this.requestConfig);

        if (json != null) {
            // 构造一个请求实体
            StringEntity stringEntity = new StringEntity(json,
                    ContentType.APPLICATION_JSON);
            // 将请求实体设置到httpPost对象中
            httpPost.setEntity(stringEntity);
        }
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = this.httpClient.execute(httpPost);
            return new HttpResult(response.getStatusLine().getStatusCode(),
                    EntityUtils.toString(response.getEntity(), "UTF-8"));
        } finally {
            if (response != null){
                response.close();
            }
        }
    }

}