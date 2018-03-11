<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>管理</title>
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
    	<li><a href="#">财务管理</a></li>
         <li>添加员工薪水信息</li>
  
    </ul>
</div>

<form action="stasal.do?saves" method="post" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">发放人</label>
                <div class="col-sm-9">
                	<input type="text" readonly="readonly" value="登录用户" class="form-control input-sm" />
                	<input type="hidden" name="stasid.sid" value="1"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">领取人</label>
                <div class="col-sm-9">
                	<select name="staid.sid" class="form-control input-sm" >
                		<c:forEach items="${staffAll}" var="s">
                    	<option value="${s.sid }" >${s.name }</option>
                    	</c:forEach>
                    </select>
                </div>
            </div>
        </div>

    </div>
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">本月薪水</label>
                <div class="col-sm-9">
               			<input type="text" name="totsal" class="form-control input-sm" placeholder="请输入本月薪水"/>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">扣除金额</label>
                <div class="col-sm-9">
               		 <input type="text" name="desal"  class="form-control input-sm" placeholder="请输入扣除金额"/>
                </div>
            </div>
        
        </div>

    </div>
        	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">实际发放薪水</label>
                <div class="col-sm-9">
               			<input type="text" name="resal" class="form-control input-sm" placeholder="请输入实际发放薪水"/>
                </div>
            </div>
        </div>
    

    </div>

 
     <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">备注信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">备注信息</label>
                <div class="col-sm-9">
                	<textarea name="remark" class="form-control"></textarea>
                </div>
            </div>
        
        </div>

    </div>
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>

              <a class="btn btn-warning" href="stasal.do?findall">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>