<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%=basePath%>">
		
		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="js/jquery.min.js"></script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="js/bootstrap.min.js"></script>

	</head>
      
	<body >
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				
				<li>
					<a href="view/filework/upAndDownFile.jsp">文件的上传与下载</a> 
				</li>
			</ul>
		</div>
		
		
<div class="row alert alert-info" style="margin: 0px; padding: 5px;text-align: center;">
上传文件
</div>
    <form action="${pageContext.request.contextPath}/upfile.do?add" method="post" enctype="multipart/form-data">
        <table width="50%" border="1" align="center"> <!-- 打开表格边框，可使用border="1"(缺点：没数据显示非常丑陋)，还可使用frame="border"  -->
            <tr>
                <td>上传用户</td>
                <td>
                    <input type="text" name="username" value=${staffList.name }>
                </td>
            </tr>

            <tr>
                <td>上传文件</td>
                <td>
                    <input type="file" name="file">
                </td>
            </tr>

            <tr>
                <td>文件描述</td>
                <td>
                    <textarea rows="6" cols="50" name="description"></textarea>
                </td>
            </tr>

            <tr>
                <td></td>
                <td>
                    <input type="submit" value="上传">
                </td>
            </tr>
        </table>
    </form> 
    操作信息：</br>
    <textarea rows="4" cols="30">
    ${fileMessage }
    </textarea>
	
	</body>
	</html>