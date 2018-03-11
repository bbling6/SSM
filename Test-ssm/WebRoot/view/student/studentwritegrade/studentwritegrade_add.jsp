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
    	<li><a href="#">学员管理</a></li>
        <li>添加学生成绩</li>
    </ul>
</div>

<form action="grade.do?save" method="post" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<input type="text" name="id" readonly="readonly" class="form-control input-sm" placeholder="编号自动生成"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">学员</label>
                <div class="col-sm-9">
                	<select name="student.id" class="form-control input-sm">
                		<option>请选择</option>
                		<c:forEach items="${student_list}" var="s">
                    	<option value="${s.id }">${s.name }</option>
                    	</c:forEach>
                    </select>
                </div>
            </div>
        </div>

    </div>
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">科目</label>
                <div class="col-sm-9">
                	<input type="text" name="subject" class="form-control input-sm" placeholder="请输入科目"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">成绩</label>
                <div class="col-sm-9">
                	<input type="text" name="grade" class="form-control input-sm" placeholder="请输入成绩"/>
                </div>
            </div>
        </div>

    </div>
    <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">考试时间</label>
                <div class="col-sm-9">
               			<input type="date" name="time" class="form-control input-sm" placeholder="请输入考试时间"/>
                </div>
            </div>
        </div>
		 <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">负责人</label>
                <div class="col-sm-9">
                	<select name="staff.sid" class="form-control input-sm">
                		<option>请选择</option>
                		<c:forEach items="${staff_list}" var="st">
                    	<option value="${st.sid }">${st.name }</option>
                    	</c:forEach>
                    </select>
                </div>
            </div>
        </div>

    </div>


 
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">沟通内容</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">沟通内容</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name="desc"></textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>

              <a class="btn btn-warning" href="grade.do?findAll">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
