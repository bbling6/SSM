<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    	<li><a href="#">系统管理</a></li>
        <li>权限变更</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-horizontal" action="anthorty.do?findRoleByName" method="post">
	<div class="col-sm-2">角色名称:</div>
    <div class="col-sm-3">
    	<input type="text" name="name" class="form-control input-sm"/>
    </div>
    <input type="submit" class="btn btn-danger" value="查询"/>

    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>角色编号</th>
            <th>角色名称</th>
            <th>角色描述</th>
             <th>操作</th>
        </tr>
        <c:forEach items="${roleList}" var="r">
       	<tr>
        	<td>${r.rid }</td>
            <td>${r.name }</td>
            <td>${r.desc }</td>
            <th><a href="anthorty_change.html">权限变更</a></th>
        </tr>       
        </c:forEach>
    </table>
</div>

</body>
</html>
