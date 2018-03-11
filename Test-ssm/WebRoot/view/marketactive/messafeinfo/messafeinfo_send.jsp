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
<script src="nicEdit/nicEdit.js"></script>
<script type="text/javascript">
	bkLib.onDomLoaded(function(){nicEditors.allTextAreas()});
	$(function(){
			$("#modelSelect").change(function(){
				var id=$("#modelSelect").val();
				$.post("msg.do?findId",{modelId:id},function(data){
				nicEditors.findEditor("messafeContent").setContent(data);
				})
			})	
		});
</script>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li>营销管理--></li>
        <li>短信管理--></li>
        <li>发送信息</li>
    </ul>
</div>

<form action="msg.do?save" class="form-horizontal" method="post">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">模板</label>
                <div class="col-sm-9">
                	<select name="" class="form-control input-sm" id="modelSelect">
            			<option value="0" selected="">----请选择----</option>
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
            	<label class="col-sm-3 control-label">接收人</label>
                <div class="col-sm-9">
                	<input type="text" name="receiveMan" class="form-control input-sm" placeholder="请输入接收人"/>
                </div>
            </div>
        </div>
        
        </div>
    
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">电话号码</label>
                <div class="col-sm-9">
                	<input type="text" name="receivePhone" class="form-control input-sm"  placeholder="请输入电话号码"/>
                </div>
            </div>
        
        </div>


    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">短信内容信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">短信内容</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name="msgContent" id="messafeContent"></textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="发送"/>

              <a class="btn btn-warning" href="msg.do?findAll">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
