<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<title>管理</title>
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
					员工薪水
				</li>
			</ul>
		</div>
		<form action="stasal.do?findstasal" method="post" class="form-inline">
			<div class="row alert alert-info" style="margin: 0px; padding: 3px;">

				<div class="form-group">
					<label class="" for="staffName">
						员工姓名：
					</label>
					<input type="text" class="form-control" name="staffName"
						id="staffName" placeholder="请输入员工姓名">
				</div>

				<input type="submit" class="btn btn-danger" value="查询" />
				<a class="btn btn-success" href="stasal.do?savebefore">添加员工薪水记录</a>

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
								领取人
							</th>
							<th>
								财务人员
							</th>
							<th>
								本月薪水
							</th>
							<th>
								扣除
							</th>
							<th>
								实际发放薪水
							</th>
							<th>
								领取日期
							</th>
							<th>
								备注信息
							</th>
							<th>
								是否领取
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${sallist}" var="sal" varStatus="status">
						<tr class="odd">
							<td>
								${sal.staid.name}
							</td>
							<td>
								${sal.stasid.name}
							</td>
							<td>
								${sal.totsal}
							</td>
							<td>
								${sal.desal}
							</td>
							<td>
								${sal.resal}
							</td>
							<td>
								<f:formatDate value="${sal.saldate}"/>
							</td>
							<td>
								${sal.remark}
							</td>
							<td>
								<c:choose>
									<c:when test="${sal.isused=='是' }">
										已领取
									</c:when>
									<c:otherwise>
										<a href='stasal.do?receive&salid=${sal.ssid}'>领取工资</a>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<span class="pagebanner">总共_条记录.</span><span class="pagelinks">共页</span>
			</div>

		</form>




	</body>
</html>