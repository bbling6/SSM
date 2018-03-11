<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    	<li><a href="#">@招生管理</a></li>
        <li>学员池</li>
        <li>修改学员信息</li>
    </ul>
</div>

<form action="student.do?update&id=${stu_list.id }" class="form-horizontal" method="post">
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="修改"/>
            <a class="btn btn-warning" href="student.do?findAll">返回上一级</a>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<input type="text" name="id" value="${stu_list.id }" readonly="readonly" class="form-control input-sm" placeholder="请输入编号"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">姓名</label>
                <div class="col-sm-9">
                	<input type="text" name="name" value="${stu_list.name }" class="form-control input-sm" placeholder="请输入姓名"/>
                </div>
            </div>
        </div>
    </div>
    	<!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">性别</label>
                <div class="col-sm-4">
                	<select  name="sex" class="form-control input-sm" >
                        <option ${stu_list.sex=='男'?'selected':'' } >男</option>
                        <option ${stu_list.sex=='女'?'selected':'' } >女</option>
                        <option ${stu_list.sex=='秘密'?'selected':'' } >秘密</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">年龄</label>
                <div class="col-sm-5">
                	<input type="text" name="age" value="${stu_list.age }" class="form-control input-sm" placeholder="请输入年龄"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
       	<!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">手机号码</label>
                <div class="col-sm-9">
                	<input type="text" name="phone" value="${stu_list.phone }" class="form-control input-sm" placeholder="请输入手机号码"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">电子邮件</label>
                <div class="col-sm-9">
                	<input type="text" name="email" value="${stu_list.email }" class="form-control input-sm" placeholder="请输入电子邮件"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
    <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">身份证</label>
                <div class="col-sm-9">
                	<input type="text" name="idcard" value="${stu_list.idcard }" class="form-control input-sm" placeholder="请输入身份证"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">家庭地址</label>
                <div class="col-sm-9">
                	<input type="text" name="address" value="${stu_list.address }" class="form-control input-sm" placeholder="请输入家庭地址"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">出生日期</label>
                <div class="col-sm-9">
                	<input type="date" name="birthday" value="<fmt:formatDate value='${stu_list.birthday }' pattern='yyyy-MM-dd'/>" class="form-control input-sm" placeholder="请输入出生日期"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">所在院校</label>
                <div class="col-sm-9">
                	<input type="text" name="school" value="${stu_list.school }" class="form-control input-sm" placeholder="请输入所在院校"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
      <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">QQ号码</label>
                <div class="col-sm-9">
                	<input type="text" name="qq" value="${stu_list.qq }" class="form-control input-sm" placeholder="请输入QQ号码"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">家长姓名</label>
                <div class="col-sm-9">
                	<input type="text" name="parentname" value="${stu_list.parentname }" class="form-control input-sm" placeholder="请输入家长姓名"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   
   <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">班级</label>
                <div class="col-sm-9">
                	<select name="classes.id" class="form-control input-sm">
                	<c:forEach items="${class_list}" var="c">
                    	<option ${stu_list.classes.id==c.id?'selected':'' } value="${c.id}">${c.name}</option>
                    </c:forEach>
                    </select>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">老师</label>
                <div class="col-sm-9">
                	<select name="staff.sid" class="form-control input-sm">
                	<c:forEach items="${staff_list}" var="s">
                    	<option ${stu_list.staff.sid==s.sid ? 'selected' : '' } value="${s.sid}">${s.name}</option>
                    </c:forEach>
                    </select>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   
   <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">账号</label>
                <div class="col-sm-9">
                	<input type="text" name="number" value="${stu_list.number }" class="form-control input-sm" placeholder="请输入账号"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">密码</label>
                <div class="col-sm-9">
                	<input type="text" name="password" value="${stu_list.password }" class="form-control input-sm" placeholder="请输入密码"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   
    <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">是否缴费</label>
                <div class="col-sm-9">
                	<select  name="ispay" class="form-control input-sm" >
                        <option ${stu_list.ispay=="是"?"selected":"" }>是</option>
                        <option ${stu_list.ispay=="否"?"selected":"" }>否</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">标识</label>
                <div class="col-sm-9">
                	<select  name="marke" class="form-control input-sm" >
                        <option ${stu_list.marke=="2"?"selected":"" }>2</option>
                        <option ${stu_list.marke=="1"?"selected":"" }>1</option>
                        <option ${stu_list.marke=="0"?"selected":"" }>0</option>
                    </select>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   
   
         <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">省份</label>
                <div class="col-sm-9">
                	<input type="text" name="province" value="${stu_list.province }" class="form-control input-sm" placeholder="请输入省份"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">家长电话</label>
                <div class="col-sm-9">
                	<input type="text" name="parentphone" value="${stu_list.parentphone }" class="form-control input-sm" placeholder="请输入家长电话"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
            <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">城市</label>
                <div class="col-sm-9">
                	<input type="text" name="city" value="${stu_list.city }" class="form-control input-sm" placeholder="请输入城市"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">意向状态</label>
                <div class="col-sm-6">
                	<select name="dictionory.id" class="form-control input-sm">
                	<c:forEach items="${dict_list}" var="d">
                    	<option ${stu_list.dictionory.id==d.id?'selected':'' } value="${d.id }">${d.context }</option>
                    </c:forEach>
                    </select>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   
   
   
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">描述信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">描述信息</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name=desc>${stu_list.desc }</textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="修改"/>
            <a class="btn btn-warning" href="student.do?findAll">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
