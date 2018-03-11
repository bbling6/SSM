<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="ds" uri="http://displaytag.sf.net"%>
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
    	<li>营销管理--></li>
        <li>短信管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-horizontal" method="post" action="msg.do?findByTel">
	<div class="col-sm-2">电话号码:</div>
    <div class="col-sm-3">
    	<input type="text" name="tel"  class="form-control input-sm"/>
    </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="msg.do?getTem" >发送短信</a>
    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	
    <ds:table name="${msg_list}" export="true" pagesize="5" class="table  table-condensed table-striped">
    	<ds:column title="编号" property="id"></ds:column>
    	<ds:column title="发送人" property="staff.name"></ds:column>
    	<ds:column title="短信内容" property="msgContent"></ds:column>
    	<ds:column title="发送时间" property="postTime" format="{0,date,yyyy-MM-dd}"></ds:column>
    	<ds:column title="接收人" property="receiveMan"></ds:column>
    	<ds:column title="接收号码" property="receivePhone"></ds:column>
    	<ds:column title="操作" href="msg.do?findById&id" paramId="id" paramProperty="id">修改</ds:column>
    	<ds:column title="操作" href="msg.do?delete&id" paramId="id" paramProperty="id">删除</ds:column>
    </ds:table>
    
</div>

</body>
</html>
