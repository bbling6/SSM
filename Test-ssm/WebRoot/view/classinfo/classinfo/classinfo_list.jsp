<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    	<li><a href="#">班级管理</a></li>
        <li>班级信息</li>
    </ul>
</div>
<form  class="form-inline" action="classes.do?byName" method="post">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">班级名称：</label>
        <input type="text" name="name" class="form-control" id="activename" placeholder="请输入班级名称">
      </div>

    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="classes.do?getContext">添加班级</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>班级名称</th>
            <th>班级人数</th>
            <th>开班日期</th>
            <th>结束日期</th>
            <th>操作</th>
        </tr>
        
        <c:forEach items="${classesList}" var="c">
       	<tr>
        	<td>${c.id }</td>
            <td>${c.name }</td>
            <td>${c.num }</td>
            <td><f:formatDate value="${c.start }"/></td>
            <td><f:formatDate value="${c.end }"/></td>
            <th>
            <a href="classes.do?byId&id=${c.id}">修改</a> 
            <a href="classes.do?delete&id=${c.id}">删除</a>
            </th>
        </tr>  
        </c:forEach>
                 
     	                   
    </table>
</div>
</form>
</body>
</html>
