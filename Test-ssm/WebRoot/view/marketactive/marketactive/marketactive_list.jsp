<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <li>营销活动</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-inline" method="post" action="act.do?getact">
     <div class="form-group">
         <label class="" for="activename">活动名称：</label>
        <input type="text" name="cname" class="form-control" id="activename" placeholder="请输入活动名称">
      </div>
      <div class="form-group">
         <label class="" for="activstate">活动状态：</label>
		 <select  class="form-control" id="activstate" name="state">
            <option value="">活动状态</option>
            <c:forEach items="${state_list}" var="state">
            	<option value="${state.id}">${state.context }</option>
            </c:forEach>
         </select>	
      </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="act.do?getDic">添加活动</a>
    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">

    <ds:table name="${act_list }" export="true" pagesize="3" class="table  table-condensed table-striped">
    	<ds:column title="编号" property="id"></ds:column>
    	<ds:column title="活动名称" href="act.do?getShow&id" paramId="id" paramProperty="id" property="activeName"></ds:column>
    	<ds:column title="负责人" property="staff.name"></ds:column>
    	<ds:column title="开始时间" property="starDate" format="{0,date,yyyy-MM-dd}"></ds:column>
    	<ds:column title="结束时间" property="endDate" format="{0,date,yyyy-MM-dd}"></ds:column>
    	<ds:column title="活动状态" property="activeState.context"></ds:column>
    	<ds:column title="操作" href="act.do?findById&id" paramId="id" paramProperty="id">修改</ds:column>
    	<ds:column title="操作" href="act.do?delete&id" paramId="id" paramProperty="id">删除</ds:column>
    
    </ds:table>
</div>

</body>
</html>
