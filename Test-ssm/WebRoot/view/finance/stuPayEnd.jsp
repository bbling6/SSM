<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>学生缴费信息</title>
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
					查看学员
				</li>
			</ul>
		</div>

		<form action="" class="form-horizontal">
			<div class="row">
				<div class="col-sm-9">

					<a class="btn btn-warning" href="stupay.do?findstu">返回上一级</a>
				</div>
			</div>
			<div align="center">
				<div class="alert alert-warning"
					style="margin: 0px; padding: 5px; width: 80%; display: block">
					<button type="button" class="close" data-dismiss="alert">
						<span aria-hidden="true">&times;</span>

					</button>
					<p align="center" style="color: red;">
						缴费成功
					</p>
				</div>
			</div>
			<h5 class="page-header alert-info"
				style="padding: 10px; margin: 0px; margin-bottom: 5px;">
				基本信息
			</h5>
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							编号
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.id}
							</p>

						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							姓名
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.name}
							</p>

						</div>
					</div>
				</div>
			</div>
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							性别
						</label>
						<div class="col-sm-4">
							<p class="form-control-static">
								${thisstu.sex}
							</p>

						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							年龄
						</label>
						<div class="col-sm-5">
							<p class="form-control-static">
								${thisstu.age}
							</p>
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							手机号码
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.phone}
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							电子邮件
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.email}
							</p>
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							身份证
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.idcard}
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							家庭地址
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.address}
							</p>
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							出生日期
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								<f:formatDate value="${thisstu.birthday}"/>
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							所在院校
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.school}
							</p>
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							QQ号码
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.qq}
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							家长姓名
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.parentname}
							</p>
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							省份
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.province}
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							家长电话
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.parentphone}
							</p>
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							城市
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">
								${thisstu.city}
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							意向状态
						</label>
						<div class="col-sm-6">
							<p class="form-control-static">
								${thisstu.dictionory.context}
							</p>

						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<h5 class="page-header alert-info"
				style="padding: 10px; margin: 0px; margin-bottom: 5px;">
				描述信息
			</h5>
			<div class="row">
				<div class="col-sm-10">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							缴费信息
						</label>
						<div class="col-sm-9">
							<p class="form-control-static">

								未交清费用

							</p>

						</div>
					</div>

				</div>

			</div>

			<h5 class="page-header alert-info"
				style="padding: 10px; margin: 0px; margin-bottom: 5px;">
				缴费信息
			</h5>
			<div class="row">
				<div class="col-sm-12">
					<table class="table">
						<tr>
							<th>
								学员姓名
							</th>
							<th>
								缴费情况
							</th>
							<th>
								缴费时间
							</th>
							<th>
								应交金额
							</th>
							<th>
								优惠金额
							</th>
							<th>
								实交金额
							</th>
							<th>
								欠款
							</th>
						</tr>
					<c:forEach items="${thisStupay}" var="stupay">
						<tr>
							<td>
								${stupay.student.name}
							</td>
							<td>
								${stupay.situatic}
							</td>
							<td>
								<f:formatDate value="${stupay.time}"/>
							</td>
							<td>
								${stupay.should}
							</td>
							<td>
								${stupay.disamount}
							</td>
							<td>
								${stupay.real}
							</td>
							<td>
								${stupay.debt}
							</td>
						</tr>
					</c:forEach>
					</table>

				</div>
			</div>
			<div class="row">
				<div class="col-sm-9 ">
					<a class="btn btn-warning" href="stupay.do?findstu">返回上一级</a>
				</div>
			</div>
		</form>

	</body>
</html>