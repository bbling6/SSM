<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		<title>��ҳ</title>
		<!-- �� Bootstrap ���� CSS �ļ� -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery�ļ��������bootstrap.min.js ֮ǰ���� -->
		<script src="js/jquery.min.js"></script>
		<!-- ���µ� Bootstrap ���� JavaScript �ļ� -->
		<script src="js/bootstrap.min.js"></script>

	</head>
      
	<body>
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				
				<li>
					�û���ϸ����
				</li>
			</ul>
		</div>
		<div class="row alert alert-info" style="margin: 0px; padding: 3px;">

		</div>
		<div class="row" style="padding: 15px; padding-top: 0px;">
			<table class="table  table-bordered table-striped">
				<tr>
					<th>
						�û����
					</th>
					<th>
						�û�����
					</th>
					<th>
						�û��Ա�
					</th>
					<th>
						�û�����
					</th>
					<th>
						�绰����
					</th>
					<th>
						QQ
					</th>
					<th>
						��ְʱ��
					</th>
					<th>
						����
					</th>
				</tr>
				<c:forEach items="${staffLogin}" var="s">
				<tr>
					<td>
						<a href="staffinfo_show.html">${s.sid}</a>
					</td>
					<td>
						${s.name}
					</td>
					<td>
						${s.sex}
					</td>
					<td>
						${s.age}
					</td>
					<td>
						${s.phone}
					</td>
					<td>
						${s.qq}
					</td>
					<td>
					<f:formatDate value="${s.hiredate}"/>	
					</td>
					<td>
						<a href="staff.do?byid&id=${s.sid}">�޸�</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>

	</body>
</html>
