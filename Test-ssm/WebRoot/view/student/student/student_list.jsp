<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ds" uri="http://displaytag.sf.net" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li>学员管理</li>
        <li>查询学员</li>
    </ul>
</div>
<form class="form-inline" action="student.do?byname" method="post">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">学员姓名：</label>
        <input type="text" class="form-control" name="sname" id="activename" placeholder="请输入学员姓名">
      </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="student.do?getDictionory">添加学员</a>
</div>

<ds:table name="${stu_list}" pagesize="3" export="true" class="table  table-condensed table-striped">
	<ds:column title="编号" property="id"></ds:column>
	<ds:column title="姓名" property="name"></ds:column>
	<ds:column title="性别" property="sex"></ds:column>
	<ds:column title="年龄" property="age"></ds:column>
	<ds:column title="手机号码" property="phone"></ds:column>
	<ds:column title="电子邮件" property="email"></ds:column>
	<ds:column title="所在院校" property="school"></ds:column>
	<ds:column title="操作" href="student.do?byid&id" paramId="id" paramProperty="id">修改</ds:column>
	<ds:column title="操作" href="student.do?delete&id" paramId="id" paramProperty="id">删除</ds:column>
</ds:table>

</form>
</body>
</html>
