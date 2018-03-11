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
<script src="nicEdit/nicEdit.js"></script>
<script type="text/javascript">
	bkLib.onDomLoaded(function(){nicEditors.allTextAreas()});
	$(function(){
			$("#modelSelect").change(function(){
				var id=$("#modelSelect").val();
				$.post("ema.do?findId",{modelId:id},function(data){
				nicEditors.findEditor("messafeContent").setContent(data);
				})
			})
		});
		
		function se(){
		
		var a = $("#select option:selected").val();
		alert(a);
		if(a=="0"){
		   $("#reciMan").hide();
		    
		    
		}if(a=="1"){
		 $("#label-a").val("接收地址");
		$("#reciMan").show();
		$("#neibu").hide();
		}
		
		}
		
		function chan(){
		var temp_email=$("#temp_email").val();
		alert(temp_email);
		$("#receiveAddress").val(temp_email);
		
		}
	
</script>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	
        <li><a href="ema.do?findAll">邮件管理</a> </li>
        <li>发送邮件</li>
    </ul>
</div>

<form action="ema.do?send" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">模板</label>
                <div class="col-sm-9">
                	<select name="" class="form-control input-sm" id="modelSelect">
                		<option value="0" selected="">自定义</option>
                    	<c:forEach items="${tem_list}" var="t">
                        <option value="${t.id }">${t.tempTittle }</option>
                    	</c:forEach>
                    </select>
                </div>
            </div>
        
        </div>
    </div>
     	<div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">主题</label>
                <div class="col-sm-9">
                	<input type="text" id="title" name="title" class="form-control input-sm" placeholder="请输入主题"/>
                </div>
            </div>
        </div>
        
        </div>
    	<div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">接收人类型</label>
                <div class="col-sm-9">
                	<select name="" class="form-control input-sm" id="select" onChange="se()">
                		<option value="0" selected="">内部员工</option>
                		<option value="1" >其他人</option>
                    </select>
                	
                </div>
            </div>
        </div>
        
        </div>
        
        <div class="row"  id="reciMan">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">接收人</label>
                <div class="col-sm-9">
                	
                	<input  type="text"  name="receiveMan" class="form-control input-sm" placeholder="请输入接收人"/>
                </div>
                
                <label class="col-sm-3 control-label">接收邮箱</label>
                <div class="col-sm-9">
                	
                	<input type="text"  name="receiveAddress" value="" placeholder="请输入正确的邮箱" class="form-control input-sm" />
                </div>
            </div>
        </div>
        
        </div>
       
    	<div class="row" id="neibu">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label" id="label-a">接收人和邮件地址</label>
                <div class="col-sm-9">
                	<!--<input type="text" name="receiveAddress" class="form-control input-sm"  placeholder="请输入正确的邮箱"/>-->
                <select class="form-control input-sm" onChange="chan()" >
           		<c:forEach var="staff" items="${staList}">
                        	<option value="${staff.name}">
                        		<label id="temp_email" style="display:none" value="${staff.email}"/>
                        	${staff.name}</option> 
                </c:forEach>
           		</select><br/>
                <input type="text" id="receiveAddress" name="receiveAddress" value="" placeholder="请输入正确的邮箱" class="form-control input-sm" />
                </div>
            </div>
        
        </div>
          </div>

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">邮件内容信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">邮件内容</label>
                <div class="col-sm-9">
                	<textarea name="emailContent" class="form-control" id="messafeContent"></textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="发送"/>

              <a class="btn btn-warning" href="ema.do?findAll">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
