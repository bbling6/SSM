<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="js/jquery.min.js"></script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="js/bootstrap.min.js"></script>

	</head>
      
	<body>
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				
				<li>
					<a href="view/filework/upAndDownFile.jsp">文件的上传与下载</a> 
				</li>
			</ul>
		</div>
		
		
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;text-align: center;">
		下载文件列表
		</div>

    <br/>
    <table width="90%" border="1" align="center">
        <tr>
            <td>文件名称</td>
            <td>上传时间</td>
            <td>文件描述</td>
            <td>上传人</td>
            <td>操作</td>
        </tr>
        <c:forEach var="upfile" items="${list}">
            <tr>
                <td>${upfile.filename }</td>
                <td>${upfile.uptime }</td>
                <td>${upfile.description }</td>
                <td>${upfile.username }</td>
                <td>
                    <!--<a href="upfile.do?download&id=${upfile.id}">下载</a>-->
                    <form  action="upfile.do?download" method="post">
                    <input type="hidden" value=${upfile.id} name="id" />
                    <input type="submit" value="下载"/>
                    </form>
                    <a href="#">修改文件信息</a>
                    <a href="#">删除</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>