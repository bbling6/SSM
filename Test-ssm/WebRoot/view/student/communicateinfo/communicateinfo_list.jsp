<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="ds" uri="http://displaytag.sf.net" %>
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
    	<li><a href="#">学员管理</a></li>
        <li>学员沟通记录</li>
    </ul>
</div>
<form class="form-inline" action="communicate.do?byname" method="post">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">学员姓名：</label>
        <input type="text" name="name" class="form-control" id="activename" placeholder="请输入学员姓名">
      </div>

    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="communicate.do?getStudent">添加沟通记录</a>
    
</div>


<ds:table name="${communicate_list}" pagesize="3" export="true" class="table  table-condensed table-striped">
	<ds:column title="编号" property="id"></ds:column>
	<ds:column title="学员姓名" property="student.name"></ds:column>
	<ds:column title="负责人" property="staff.name"></ds:column>
	<ds:column title="沟通内容" property="content"></ds:column>
	<ds:column title="沟通时间" property="comtime" format="{0,date,yyyy-MM-dd}"></ds:column>
	<ds:column title="操作" href="communicate.do?byid&id" paramId="id" paramProperty="id">修改</ds:column>
	<ds:column title="操作" href="communicate.do?delete&id" paramId="id" paramProperty="id">删除</ds:column>
</ds:table>

</form>
</body>
</html>
