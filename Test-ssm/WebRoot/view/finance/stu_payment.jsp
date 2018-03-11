<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<title>营销活动</title>
		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="js/jquery.min.js">
</script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="js/bootstrap.min.js">
</script>
	</head>
	<body>
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				<li>
					<a href="#">财务管理</a>
				</li>
				<li>
					查询学员
				</li>
			</ul>
		</div>
		<form action="stupay.do?getByCon" method="post"
			class="form-inline">
			<div class="row alert alert-info" style="margin: 0px; padding: 3px;">

				<div class="form-group">
					<label class="" for="activename">
						学员姓名：
					</label>
					<input type="text" name="studentName" class="form-control"
						id="activename" placeholder="请输入学员姓名">
				</div>
				<div class="form-group">
					<label class="" for="activename">
						学员意向状态：
					</label>
					<select name='studentSate' class='form-control  input-sm'>
						<option value=''>
							请选择
						</option>
						<c:forEach items="${intention}" var="in">
							<option value='${in.id}'>
								${in.context}
							</option>
						</c:forEach>
					</select>
				</div>
				<input type="submit" class="btn btn-danger" value="查询" />

			</div>
			<div align="center">
				<div class="alert alert-warning"
					style="margin: 0px; padding: 5px; width: 80%; display: none">
					<button type="button" class="close" data-dismiss="alert">
						<span aria-hidden="true">&times;</span>

					</button>
					<p align="center" style="color: red;"></p>
				</div>
			</div>
			<div class="row" style="padding: 15px; padding-top: 0px;"
				align="right">

				<table class="table table-condensed table-striped">
					<thead>
						<tr>
							<th>
								编号
							</th>
							<th>
								姓名
							</th>
							<th>
								性别
							</th>
							<th>
								年龄
							</th>
							<th>
								手机号码
							</th>
							<th>
								电子邮件
							</th>
							<th>
								所在院校
							</th>
							<th>
								学员缴费
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${stulist}" var="stu">
						<tr class="odd">
							<td>
								${stu.id}
							</td>
							<td>
								<a href="stupay.do?getstuinfo&sid=${stu.id}">${stu.name}</a>
							</td>
							<td>
								${stu.sex}
							</td>
							<td>
								${stu.age}
							</td>
							<td>
								${stu.phone}
							</td>
							<td>
								${stu.email}
							</td>
							<td>
								${stu.school}
							</td>
							<td>
								<c:choose>
									<c:when test="${stu.ispay=='否'}">
										<a href="stupay.do?getstu&sid=${stu.id}">学员缴费</a>
									</c:when>
									<c:otherwise>
										<a href="stupay.do?getstuinfo&sid=${stu.id}">查看记录</a>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<span class="pagebanner">总共_条记录.</span><span class="pagelinks">共_页</span>
			</div>
		</form>
	</body>
</html>
