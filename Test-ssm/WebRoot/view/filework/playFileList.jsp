<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="js/jquery.min.js"></script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="js/bootstrap.min.js"></script>

	</head>
      
	<body>
		<div style="padding: 0px; margin: 0px;text-align: center;">
			<ul class="breadcrumb" style="margin: 0px;">
				
				<li>
					<a href="">可播放文件列表</a>(可支持的类型是：rmvb avi mp4 flv wmv mp3.可自定义)

				</li>
			</ul>
		</div>
		
		
    <br/>
    <table width="90%" border="1" align="center">
        <tr>
            <td>文件名称</td>
            <td>上传时间</td>
            <td>文件描述</td>
            <td>上传人</td>
            <td>操作</td>
        </tr>
        <c:forEach var="upfile" items="${playFile}">
            <tr>
                <td>${upfile.filename }</td>
                <td>${upfile.uptime }</td>
                <td>${upfile.description }</td>
                <td>${upfile.username }</td>
                <td>
                    <!--<a href="upfile.do?download&id=${upfile.id}">下载</a>-->
                    <!--<form  action="upfile.do?download" method="post">
                    <input type="hidden" value=${upfile.id} name="id" />
                    <input type="submit" value="下载"/>
                    </form>
                    -->
                    <input type="hidden" id="playval" value="${upfile.savepath }+'\\'+${upfile.uuidname}"/>
                    <button onClick="play()" align="center">播放</button>
                   
                </td>
            </tr>
        </c:forEach>

    </table>
    
    <script type="text/javascript">
    function play(){
    var playval=$("#playval").val();
    alert(playval);
    
    $("#play_area").show();
     $("#play_path").text(playval);
    
    }
    
    </script>
    
    <div class="row " style="padding:10px; margin:30px; display:none" id="play_area" >
		<div class="col-sm-10">
		<div class="panel panel-default" >
          <div class="panel-heading" style=" padding:3px;height:30px;"  >
            <span class="glyphicon glyphicon-refresh"></span>视频播放区域：
          </div>
              <div class="panel-body" id="play_body">
              
              <h1 id="play_path"></h1>
               
              </div>
        </div>
		</div>
	</div>
</body>
</html>