<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>上传新版本</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/servlet/UploadApkServlet" enctype="multipart/form-data" method="post">
      选择新版本：<input type="file" name="file"><br/>
  		  <input type="submit" value="上传新版本">
  </form>
  ${message}</br>
        <!-- 遍历Map集合 -->
        历史版本列表<br/>
		<c:forEach var="me" items="${fileNameMap}">
		<c:url value="/servlet/RemoveServlet" var="removeurl">
		<c:param name="filename" value="${me.key}"></c:param>
		</c:url>
		${me.value}<a href="${removeurl}">删除</a><br/>
</c:forEach>
	${deletemessage}
  </body>
</html>
