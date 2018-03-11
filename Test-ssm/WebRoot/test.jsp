<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>test测试</title>
    </head>
    <script type="text/javascript">
    
    
    }
    
    </script>
<body>			
 <form action="${pageContext.request.contextPath}/servlet/RegisterServlet" method="post">
         发送人：<input type="text" value="自己" ><br/>
         标题：<input type="text" name="title"><br/>
         正文：<input type="text" name="emailContent"><br/>
         接收人邮箱：
           <select class="form-control input-sm"  >
           		<c:forEach var="staff" items=${staffList}>
                        	<option value=${staff.name}>${staff.name }</option> 
                        	<input type="text" name="receiveAddress" value=${staff.email}  /> 
                </c:forEach>
           </select>
           
         <input type="submit" value="发送"/>
     </form>
</body>
</html>
