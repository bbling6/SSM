<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
$(function(){
	$("[name=starDate],[name=endDate]").click(function(){
		WdatePicker({
			highLineWeekDay:true,
			dateFmt:'yyyy-MM-dd'
		})
	})
})

</script>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li>营销管理--></li>
        <li>营销活动--></li>
        <li>修改活动</li>
    </ul>
</div>

<form action="act.do?update" method="post" class="form-horizontal">
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<input type="text" value="${byid_list.id}" name="id" class="form-control input-sm" placeholder="请输入编号"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">活动名称</label>
                <div class="col-sm-9">
                	<input type="text" value="${byid_list.activeName}" name="activeName" class="form-control input-sm" placeholder="请输入活动名称"/>
                </div>
            </div>
        </div>
    </div>
    	<!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">开始时间</label>
                <div class="col-sm-9">
                	<input type="text" value="<s:formatDate value='${byid_list.starDate }'/>" name="starDate" class="form-control input-sm" placeholder="请输入开始时间"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">活动状态</label>
                <div class="col-sm-5">
                	<select name="activeState.id" class="form-control input-sm">
                    	<c:forEach items="${state_list}" var="s">
                        <option value="${s.id}" ${s.id==byid_list.activeState.id?'selected="selected"':''}>${s.context}</option>
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
            	<label class="col-sm-3 control-label">结束时间</label>
                <div class="col-sm-9">
                	<input type="text" name="endDate" value="<s:formatDate value='${byid_list.endDate }'/>" class="form-control input-sm" placeholder="请输入结束时间"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">活动类型</label>
                <div class="col-sm-5">
                	<select name="activeType.id" class="form-control input-sm">
                    	<c:forEach items="${type_list}" var="t">
                        <option value="${t.id}"  ${t.id==byid_list.activeType.id?'selected="selected"':''} >${t.context}</option>
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
            	<label class="col-sm-3 control-label">成本预算</label>
                <div class="col-sm-6">
                	<input type="text" value="${byid_list.costEmtimente}" name="costEmtimente" class="form-control input-sm" placeholder="请输入成本预算"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">实际成本</label>
                <div class="col-sm-6">
                	<input type="text" value="${byid_list.realCost}" name="realCost" class="form-control input-sm" placeholder="请输入实际成本"/>
                </div>
            </div>
        </div>
    </div>
   <!--结束 -->
   <!--开始 -->
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">预期反应</label>
                <div class="col-sm-6">
                	<select name="reflect.id" class="form-control input-sm">
                    	<c:forEach items="${reaction_list}" var="r">
                        <option value="${r.id}"  ${r.id==byid_list.reflect.id?'selected="selected"':''} >${r.context}</option>
                    	</c:forEach>
                    </select>
                	<%--<input type="text" value="${byid_list.reflect.context}" name="reflect.id" class="form-control input-sm" placeholder="请输入预期反应"/>
                --%></div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">预期学员</label>
                <div class="col-sm-6">
                	<input type="text" value="${byid_list.expectStudent}" name="expectStudent" class="form-control input-sm" placeholder="请输入预期学员"/>
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
                	<textarea class="form-control" name="activeDescription">${byid_list.activeDescription}</textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>
            <a class="btn btn-warning" href="act.do?findAll">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
