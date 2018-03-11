<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    	<li><a href="#">教务管理</a></li>
        <li>班级事务</li>
    </ul>
</div>
<form class="form-inline" action="trans.do?findByTilte" method="post">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">主题</label>
        <input type="text" name="title" class="form-control" id="activename" placeholder="请输入主题">
      </div>

    <input type="submit"    class="btn btn-danger"   value="查询"/>
    <a  class="btn btn-success"  href="trans.do?getClasses">添加班级事务</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	
        <ds:table name="${transactionList}" pagesize="2" export="true" class="table  table-condensed table-striped">
        <ds:column title="编号" property="tid" sortable="true"></ds:column>
        <ds:column title="班级" property="classes.name"></ds:column>
        <ds:column title="主题" property="title"></ds:column>
        <ds:column title="内容" property="content"></ds:column>
        <ds:column title="组织人" property="organizition"></ds:column>
        <ds:column title="活动日期" property="time" format="{0,date,yyyy-MM-dd}"></ds:column>
        <ds:column title="查看"  href="trans.do?findById&id" paramId="id" paramProperty="tid">修改</ds:column>
        <ds:column title="删除"  href="trans.do?delete&id"  paramId="id" paramProperty="tid">删除</ds:column>
        
        </ds:table>
        
        
       
</div>
</form>
</body>
</html>
