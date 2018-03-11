<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>缴费</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="js/bootstrap.min.js"></script>
   <script type="text/javascript">
   	function total(){
   		//应交金额
   		var shouldAmount = $("#shouldAmount").val();
   		//优惠金额
   		var discountAmount = $("#discountAmount").val();
   		//实交金额
   		var realAmount = $("#realAmount").val();
   		
   		var amount = shouldAmount-discountAmount-realAmount;
   		$("#debtAmount").val(amount);
   	}
   
   </script>
</head>
<body>

<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">财务管理</a></li>
        <li>学员缴费</li>
    </ul>
</div>

<form action="stupay.do?addstupay" method="post" class="form-horizontal">
<input type="hidden" name="staff.sid" value="1">
<input type="hidden" name="student.id" value="${thisstu.id}"/>
   	<div class="row">
    	<div class="col-sm-9">
 
            <a class="btn btn-warning" href="stupay.do?findstu">返回上一级</a>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                <p class="form-control-static">${thisstu.id}</p>
                	
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">姓名</label>
                <div class="col-sm-9">
                 <p class="form-control-static">${thisstu.name}</p>
                	
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
                 <p class="form-control-static">${thisstu.sex}</p>
                
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">年龄</label>
                <div class="col-sm-5">
                 <p class="form-control-static">${thisstu.age}</p>
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
                  <p class="form-control-static">${thisstu.phone}</p>
                     </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">电子邮件</label>
                <div class="col-sm-9">
                <p class="form-control-static">${thisstu.email}</p>
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
                  <p class="form-control-static">${thisstu.idcard}</p>
                	                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">家庭地址</label>
                <div class="col-sm-9">
                 <p class="form-control-static">${thisstu.address}</p>
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
                 <p class="form-control-static"><f:formatDate value="${thisstu.birthday}"/> </p>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">所在院校</label>
                <div class="col-sm-9">
                    <p class="form-control-static">${thisstu.school}</p>
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
                   <p class="form-control-static">${thisstu.qq}</p>
                 </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">家长姓名</label>
                <div class="col-sm-9">
                 <p class="form-control-static">${thisstu.parentname}</p>
                 </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">学员缴费信</h5>
 
       <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">缴费情况</label>
                <div class="col-sm-9">
               		<input type="text" name="situatic" class="form-control input-sm" placeholder="请输入缴费情况"/>
                 </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">缴费方式</label>
                <div class="col-sm-9">
                  <select name='method.id'class='form-control  input-sm'>
                  <option value=''>请选择</option>
                  <c:forEach items="${pay_type}" var="type">
                  <option value='${type.id}'>${type.context}</option>
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
            	<label class="col-sm-3 control-label">缴费时间</label>
                <div class="col-sm-9">
               		<input type="date" name="time" class="form-control input-sm" placeholder="请输入缴费情况"/>
                 </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">应交金额</label>
                <div class="col-sm-9">
                  <input type="text" name="should" id="shouldAmount" readonly="readonly" value="${shouldpay}" class="form-control input-sm" placeholder="请输入缴费情况"/>
                 </div>
            </div>
        </div>
    </div>
   <!--结束 -->
       <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">优惠金额</label>
                <div class="col-sm-9">
               		<input type="text" name="disamount"  id="discountAmount" class="form-control input-sm" placeholder="请输入缴费情况"/>
                 </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">实交金额</label>
                <div class="col-sm-9">
                  <input type="text" name="real" onblur="total()"  id="realAmount" class="form-control input-sm" placeholder="请输入缴费情况"/>
                 </div>
            </div>
        </div>
    </div>
   <!--结束 -->

       <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">欠款</label>
                <div class="col-sm-9">
               		<input type="text" name="debt"  id="debtAmount" class="form-control input-sm" placeholder="请输入缴费情况"/>
                 </div>
            </div>
        </div>

    </div>
   <!--结束 -->
        <!--开始 -->
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">备注</label>
                <div class="col-sm-9">
               		<textarea name="desc" class="form-control"></textarea>
                 </div>
            </div>
        </div>

    </div>
   <!--结束 -->
   	<div class="row">
    	<div class="col-sm-9 ">
    			
 			 <a class="btn btn-warning" href="stupay.do?findstu">返回上一级</a>
 			  <input type="submit" class="btn btn-success"  value="学员缴费"/>
        </div>
    </div>
</form>

</body>
</html>