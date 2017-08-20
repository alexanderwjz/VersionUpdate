package com.alexander.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListApkFileServlet extends HttpServlet {

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

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//�õ��ϴ��ļ���·��
				String upfileloadpath=this.getServletContext().getRealPath("/ApkFile");
				//����Ҫ���ص��ļ���
				Map<String,String> fileNameMap = new HashMap<String,String>();
				//�ݹ����filepathĿ¼�µ������ļ���Ŀ¼�����ļ����ļ����洢��map������
				listfile(new File(upfileloadpath),fileNameMap);//File�ȿ��Դ���һ���ļ�Ҳ���Դ���һ��Ŀ¼
				//��Map���Ϸ��͵�listfile.jspҳ�������ʾ
				request.setAttribute("fileNameMap", fileNameMap);
				request.getRequestDispatcher("/WEB-INF/UploadApk.jsp").forward(request, response);
	}
	/**
	* @Method: listfile
	* @Description: �ݹ����ָ��Ŀ¼�µ������ļ�
	* @Anthor:wjz
	* @param file ������һ���ļ���Ҳ����һ���ļ�Ŀ¼
	* @param map �洢�ļ�����Map����
	*/
	public void listfile(File file,Map<String,String> map){
	//���file����Ĳ���һ���ļ�������һ��Ŀ¼
	if(!file.isFile()){
	//�г���Ŀ¼�µ������ļ���Ŀ¼
	File files[] = file.listFiles();
	//����files[]����
	for(File f : files){
	//�ݹ� 
	listfile(f,map);
	}
	}else{
	/**
	* �����ļ������ϴ�����ļ�����uuid_�ļ�������ʽȥ���������ģ�ȥ���ļ�����uuid_����
	file.getName().indexOf("_")�����ַ����е�һ�γ���"_"�ַ���λ�ã�����ļ��������ڣ�9349249849-88343-8344_��_��_��.avi
	��ôfile.getName().substring(file.getName().indexOf("_")+1)����֮��Ϳ��Եõ���_��_��.avi����
	*/
	//String realName = file.getName().substring(file.getName().indexOf("_")+1);
	//file.getName()�õ������ļ���ԭʼ���ƣ����������Ψһ�ģ���˿�����Ϊkey��realName�Ǵ����������ƣ��п��ܻ��ظ�
	map.put(file.getName(),file.getName() );
	}
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
