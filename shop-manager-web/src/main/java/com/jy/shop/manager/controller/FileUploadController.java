package com.jy.shop.manager.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	//http://localhost:9002/restful/file/upload
	@PostMapping("/file/upload")
	@ResponseBody
	public Map<String,Object> uploadFile(MultipartFile file) throws Exception{
		
		//文件全路径名
		String fileName = file.getOriginalFilename();
		//文件后缀名
		String suffixName = StringUtils.substringAfterLast(fileName, ".");
		//文件的字节数组
		byte[] bytes = file.getBytes();
		
		////获取项目所在的真实路径
		String projectPath = System.getProperty("user.dir");
		ClientGlobal.init(projectPath + "/src/main/resources/properties/tracker_server.conf");
		//创建一个TrackerClient对象
		TrackerClient trackerClient = new TrackerClient();
		//通过TrackClient的 getConnection()方法 获得一个TrackerServer对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//创建一个StrorageServer的引用，可以是null
		StorageServer storageServer = null;
		//创建一个StorageClient，参数需要TrackerServer和StrorageServer
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		//使用StorageClient的 upload_file()方法 上传文件。
		String[] strings = storageClient.upload_file(bytes, suffixName, null);
		//String[] strings = storageClient.upload_file(path, "jpg", null);
		
		String filePath = "http://192.168.4.153";
		
		for (String str : strings) {
			filePath += "/" + str;
			System.out.println(str);
		}
		//http://192.168.6.155/group1/M00/00/00/wKjyl1rwx8-AUHIoAAB7SxZDah0141.jpg
		//System.out.println(str);
		System.out.println(filePath);
		
		Map<String,Object> map = new HashMap<>();
		map.put("url", filePath);
		map.put("state", "SUCCESS");
		map.put("size", file.getSize());
		map.put("original", suffixName);
		map.put("type", file.getContentType());
		
		return map;
	}
	
	
}
