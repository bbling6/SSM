<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>首页</title>
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
					用户详细资料
				</li>
			</ul>
		</div>
		<div class="row alert alert-info" style="margin: 0px; padding: 3px;">

		</div>
		<div class="row" style="padding: 15px; padding-top: 0px;">
			<table class="table  table-bordered table-striped">
				<tr>
					<th>
						用户编号
					</th>
					<th>
						用户姓名
					</th>
					<th>
						用户性别
					</th>
					<th>
						用户年龄
					</th>
					<th>
						电话号码
					</th>
					<th>
						QQ
					</th>
					<th>
						入职时间
					</th>
					<th>
						操作
					</th>
				</tr>
				<c:forEach items="${staffLogin}" var="s">
				<tr>
					<td>
						<a href="staffinfo_show.html">${s.sid}</a>
					</td>
					<td>
						${s.name}
					</td>
					<td>
						${s.sex}
					</td>
					<td>
						${s.age}
					</td>
					<td>
						${s.phone}
					</td>
					<td>
						${s.qq}
					</td>
					<td>
					<f:formatDate value="${s.hiredate}"/>	
					</td>
					<td>
						<a href="staff.do?byid&id=${s.sid}">修改</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>

	</body>
</html>
