package com.alexander.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONObject;

public class JsonUtil {
	public String readJsonFile(String Path) {
		BufferedReader reader = null;
		String laststr = "";
		try {
			FileInputStream fileInputStream = new FileInputStream(Path);
			InputStreamReader inputStreamReader = new InputStreamReader(
					fileInputStream, "UTF-8");
			reader = new BufferedReader(inputStreamReader);
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				laststr += tempString;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return laststr;
	}
	//重写json文件
	public void restJsonValue(String versionCode,String versionName, String url) {
		String  jsonPath=Thread.currentThread().getContextClassLoader().getResource("version.json").getPath();
		System.out.println(jsonPath);
		String JsonContext =readJsonFile(jsonPath);
		JSONObject jsonObject = new JSONObject(JsonContext);
		System.out.println("读到的"+JsonContext);
		jsonObject.put("versionCode", versionCode);
		jsonObject.put("versionName", versionName);
		jsonObject.put("url", url);
		JsonContext=jsonObject.toString();
		System.out.println(JsonContext);
		try { 
			writeFile(jsonPath, JsonContext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  //向json文件写入数据
			public  void writeFile(String path, String JsonContext) throws IOException {
				BufferedWriter writer = null;
				File file = new File(path);
		        //如果文件不存在
		        if(!file.exists()){
		            try {
		                file.createNewFile();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		      //写数据
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
	        System.out.println("文件写入成功");
		     
			}
}
