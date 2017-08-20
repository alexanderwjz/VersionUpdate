package com.alexander.servlet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="screen2.9.3.apk";
/*		//String a=((int)(Float.parseFloat(filename)*10))+"";
		String a[]=filename.split("\\.");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]);
		}
		
		//int b=(int)a;
		System.out.println(sb.toString());*/
		/*String filename="screen6.3.3.apk";
		
		Pattern p=Pattern.compile("^screen[1-9](\\.[\\d]){2}(.apk)$");
				//+ "[1-9]\\.[/d]\\.apk$");
		//Pattern p=Pattern.compile("[\\d]+\\.?[\\d]*");
		Matcher m=p.matcher(filename);
		if(m.matches()){
			System.out.println("验证ok"+m.find());
		}else{
			System.out.println("验证失败");
		}*/
		filename = filename.substring(0,11);
		System.out.println(filename);
	}

}
