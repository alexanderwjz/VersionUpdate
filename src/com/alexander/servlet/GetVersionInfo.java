package com.alexander.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.alexander.bean.VersionInfo;
import com.alexander.util.JsonUtil;
import com.google.gson.Gson;

public class GetVersionInfo extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		/*********************java解析json数组****************************************/
		
		/*String path=getServletContext().getRealPath("/WEB-INF/version.json");
		String JsonContext = new JsonUtil().ReadFile(path);
		JSONArray jsonArray = new JSONArray(JsonContext);
		int size = jsonArray.length();
		System.out.println("Size: " + size);
		for(int  i = 0; i < size; i++){
		JSONObject jsonObject = jsonArray.getJSONObject(i);
		System.out.println("[" + i + "]versionCode=" + jsonObject.get("versionCode"));
		System.out.println("[" + i + "]versionName=" + jsonObject.get("versionName"));
		}*/
		/*********************java解析json对象****************************************/
		String path=Thread.currentThread().getContextClassLoader().getResource("version.json").getPath();
		String JsonContext = new JsonUtil().readJsonFile(path);
		JSONObject jsonObject = new JSONObject(JsonContext);
		int size = jsonObject.length();
		System.out.println("Size: " + size);
		//JSONObject jsonObject = jsonArray.getJSONObject(i);
		System.out.println("versionCode=" + jsonObject.get("versionCode"));
		System.out.println("versionName=" + jsonObject.get("versionName"));
		System.out.println("url=" + jsonObject.get("url"));
		VersionInfo versionInfo = new VersionInfo();
		String versionCode=(String) jsonObject.get("versionCode");
		String versionName=(String) jsonObject.get("versionName");
		String url=(String) jsonObject.get("url");
		versionInfo.setVersionCode(versionCode);
		versionInfo.setVersionName(versionName);
		versionInfo.setUrl(url);
		Gson gson=new Gson();
		response.getWriter().print(gson.toJson(versionInfo));
	}   

	
	public void init() throws ServletException {
		// Put your code here
	}

}
