package com.alexander.servlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

import com.alexander.util.JsonUtil;

public class WriterJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void readJson(String versionCode,String versionName) {
		String  jsonPath=Thread.currentThread().getContextClassLoader().getResource("version.json").getPath();
		System.out.println(jsonPath);
		String JsonContext = new JsonUtil().readJsonFile(jsonPath);
		JSONObject jsonObject = new JSONObject(JsonContext);
		System.out.println("读到的"+JsonContext);
		jsonObject.put("versionCode", versionCode);
		jsonObject.put("versionName", versionName);
		JsonContext=jsonObject.toString();
		System.out.println(JsonContext);
		try {
			writeFile(jsonPath, JsonContext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	    //把json格式的字符串写到文件
		public static void writeFile(String path, String JsonContext) throws IOException {
			BufferedWriter writer = null;
			File file = new File(path);
	        //如果文件不存在，则新建一个
	        if(!file.exists()){
	            try {
	                file.createNewFile();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	      //写入
	        try {
	            writer = new BufferedWriter(new FileWriter(file));
	            writer.write(JsonContext);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                if(writer != null){
	                    writer.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
        System.out.println("文件写入成功！");
	   
		}
}
