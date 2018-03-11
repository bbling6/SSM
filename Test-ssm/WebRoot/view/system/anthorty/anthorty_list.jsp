<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>首页</title>
		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="js/jquery.min.js">
</script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="js/bootstrap.min.js">
</script>
		<link rel="stylesheet" href="css/dtree.css">
		<script src="js/dtree.js">
</script>
	</head>

	<body>
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				<li>
					<a href="#">系统管理</a>
				</li>
				<li>
					权限管理
				</li>
			</ul>
		</div>
		<div class="row">
			<div class="col-sm-2" style="padding-left: 30px;">
				<script type="text/jscript">

$.post("anthorty.do?findparent", function(data) {
	var mydata = eval("(" + data + ")");
	d = new dTree('d');
	d.add(0, -1, '根目录');
	for ( var i = 0; i < mydata.length; i++) {
		var t = mydata[i];
		d.add(t.aid, 0, t.name, '', "提示", "mainframe");
		for ( var k = 0; k < t.childrens.length; k++) {
			var ds = t.childrens[k];
			d.add(100+ds.aid,t.aid,ds.name,ds.url + '&id=' + ds.aid, "提示",
					"mainframe");
		}
	}
	  
	$("#aa").html("" + d);
});
</script>
				<div id="aa"></div>
			</div>
			<div class="col-sm-10">
				<iframe id="mainframe" name="mainiframe"
					style="width: 100%; border: 0px;"></iframe>
				<script type="text/javascript">
var height = jQuery(window).height() - 50;
jQuery("#mainframe").attr("height", height + "px");
jQuery("#mainframe").attr("src", "anthorty.do?findPre");
</script>

			</div>

		</div>


	</body>
</html>
