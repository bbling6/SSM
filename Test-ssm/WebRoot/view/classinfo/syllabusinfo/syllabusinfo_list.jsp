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
    	<li><a href="#">班级管理</a></li>
        <li>课程表</li>
    </ul>
</div>
<form action="schedule.do?byName" method="post" class="form-inline">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">课程表名称：</label>
        <input type="text" name="name" class="form-control" id="activename" placeholder="请输入课程表名称">
      </div>

    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="view/classinfo/syllabusinfo/syllabusinfo_add.jsp">添加课程表</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
${schedule_list}
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>课程表名称</th>
            <th>星期一</th>
            <th>星期二</th>
            <th>星期三</th>
            <th>星期四</th>
            <th>星期五</th>
            <th>星期六</th>
            <th>星期天</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${schedule_list}" var="s">
        
       	<tr>
        	<td>${s.id }</td>
            <td>${s.name }</td>
            <td>${s.yi }</td>
            <td>${s.er }</td>
            <td>${s.san }</td>
            <td>${s.si }</td>
            <td>${s.wu }</td>
            <td>${s.liu }</td>
            <td>${s.qi }</td>
            <th>
            <a href="schedule.do?byId&id=${s.id }">修改</a> 
            <a href="schedule.do?delete&id=${s.id }">删除</a>
            </th>
        </tr>   
        </c:forEach>             
     	                   
    </table>
</div>
</form>
</body>
</html>
