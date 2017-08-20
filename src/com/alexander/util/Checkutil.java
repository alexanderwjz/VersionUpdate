package com.alexander.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checkutil {
	/**
	 * 验证文件名是否合法
	 * @param filename
	 * @return
	 */
	public static boolean checkfilename(String filename){
		Pattern p=Pattern.compile("^screen[1-9](\\.[\\d]){2}(.apk)$");
		Matcher m=p.matcher(filename);
		return m.matches();	
	}

}
