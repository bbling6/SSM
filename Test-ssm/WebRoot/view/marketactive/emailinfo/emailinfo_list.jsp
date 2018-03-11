<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s"  uri="http://java.sun.com/jsp/jstl/fmt"%>
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
    	
        <li>邮件管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-horizontal" action="ema.do?findTitle" method="post">
	<div class="col-sm-2">主题:</div>
    <div class="col-sm-3">
    	<input type="text" name="title" class="form-control input-sm"/>
    </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="ema.do?getTem" >发送邮件</a>
    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>主题</th>
            <th>发送人</th>
            <th>发送时间</th>
            <th>接收人</th>
            <th>接收地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${email_list}" var="e">
       	<tr>
        	<td>${e.id }</td>
            <td>${e.title }</td>
            <td>${e.staff.name }</td>
            <td><s:formatDate value="${e.postTime }"/></td>
            <td>${e.receiveMan }</td>
            <td>${e.receiveAddress }</td>
            <th><a href="ema.do?findById&id=${e.id }">查看</a> <a href="ema.do?delete&id=${e.id }">删除</a></th>
        </tr>
		</c:forEach>
       	   	
    </table>
</div>

</body>
</html>
