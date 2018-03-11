<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
 <link href="datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
 
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

<!-- 日历 -->
<script type="text/javascript" src="datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="datetimepicker/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
  
		<script language="javascript" src="sharedata.js" charset="utf-8"></script>
	</head>

	<body>
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				<li>
					<a href="#">招生管理</a>
				</li>
				<li>
					学员池
				</li>
				<li>
					添加学员
				</li>
			</ul>
		</div>

		<form action="student.do?save" class="form-horizontal" method="post">
			<div class="row">
				<div class="col-sm-3 col-sm-offset-4">
					<input type="submit" class="btn btn-success" value="保存" />
					<a class="btn btn-warning" href="student.do?findAll">返回上一级</a>
				</div>
			</div>
			<h5 class="page-header alert-info"
				style="padding: 10px; margin: 0px; margin-bottom: 5px;">
				基本信息
			</h5>
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							编号
						</label>
						<div class="col-sm-9">
							<input type="text" name="id" readonly="readonly"
								class="form-control input-sm" placeholder="请输入编号" />
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							姓名
						</label>
						<div class="col-sm-9">
							<input type="text" name="name" class="form-control input-sm"
								placeholder="请输入姓名" />
						</div>
					</div>
				</div>
			</div>
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							性别
						</label>
						<div class="col-sm-4">
							<select name="sex" class="form-control input-sm">
								<option>
									请选择
								</option>
								<option>
									保密
								</option>
								<option>
									男
								</option>
								<option>
									女
								</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							年龄
						</label>
						<div class="col-sm-5">
							<input type="text" name="age" class="form-control input-sm"
								placeholder="请输入年龄" />
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							手机号码
						</label>
						<div class="col-sm-9">
							<input type="text" name="phone" class="form-control input-sm"
								placeholder="请输入手机号码" />
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							电子邮件
						</label>
						<div class="col-sm-9">
							<input type="text" name="email" class="form-control input-sm"
								placeholder="请输入电子邮件" />
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							身份证
						</label>
						<div class="col-sm-9">
							<input type="text" name="idcard" class="form-control input-sm"
								placeholder="请输入身份证" />
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							家庭地址
						</label>
						<div class="col-sm-9">
							<input type="text" name="address" class="form-control input-sm"
								placeholder="请输入家庭地址" />
						</div>
					</div>
				</div>
			</div>
			<!--结束 -->
			<!--开始 -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							出生日期
						</label>
						<div class="col-sm-9">
							<!--<input type="date" name="birthday" class="form-control input-sm"
								placeholder="请输入出生日期" />
							-->
							<div class="form-group">

								<div class="input-group date form_date col-md-1" data-date=""
									data-date-format="yyyy-mm-dd" data-link-field="dtp_input2"
									data-link-format="yyyy-mm-dd">
									<input class="form-control" size="10" type="text" value=""
										readonly>
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-remove"></span>
									</span>
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span>
									</span>
								</div>
								<input type="hidden" id="dtp_input2" value="" />
								<br />
							</div>

							<script type="text/javascript">

	$('.form_date').datetimepicker({
        language:  'en',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
                
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">所在院校</label>
                <div class="col-sm-9">
                	<!--<input type="text" name="school" class="form-control input-sm" placeholder="请输入所在院校"/>-->
                
                <form name="select">
				省份:
				<select name="universityProvince" id="111"
				onchange=provinceUniversityChange("111","22")>
				</select>
				大学:
				<select name="school" id="22">
				</select>
				<script language="javascript">
				initProvinceUniversity("111","22");
				</script>
		</form>

		</div>
		</div>
		</div>
		</div>
		<!--结束 -->
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						QQ号码
					</label>
					<div class="col-sm-9">
						<input type="text" name="qq" class="form-control input-sm"
							placeholder="请输入QQ号码" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						家长姓名
					</label>
					<div class="col-sm-9">
						<input type="text" name="parentname" class="form-control input-sm"
							placeholder="请输入家长姓名" />
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						省份
					</label>
					<div class="col-sm-9">
						<!--<input type="text" name="province" class="form-control input-sm" placeholder="请输入省份"/>-->
						<select name="province" id="11" onchange=provinceCityChange("11","2")>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						家长电话
					</label>
					<div class="col-sm-9">
						<input type="text" name="parentphone"
							class="form-control input-sm" placeholder="请输入家长电话" />
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						城市
					</label>
					<div class="col-sm-9">
						<!--<input type="text" name="city" class="form-control input-sm" placeholder="请输入城市"/>-->

						<select name="city" id="2">
						</select>
						<script language="javascript">
			initProvincecity("11","2");
			</script>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						意向状态
					</label>
					<div class="col-sm-6">
						<select name="dictionory.id" class="form-control input-sm">
							<option>
								请选择
							</option>
							<c:forEach items="${dict_list}" var="d">
								<option value="${d.id}">
									${d.context}
								</option>
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
					<label class="col-sm-3 control-label">
						班级
					</label>
					<div class="col-sm-9">
						<select name="classes.id" class="form-control input-sm">
							<option>
								请选择
							</option>
							<c:forEach items="${class_list}" var="c">
								<option value="${c.id}">
									${c.name}
								</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						老师
					</label>
					<div class="col-sm-9">
						<select name="staff.sid" class="form-control input-sm">
							<option>
								请选择
							</option>
							<c:forEach items="${staff_list}" var="s">
								<option value="${s.sid}">
									${s.name}
								</option>
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
					<label class="col-sm-3 control-label">
						账号
					</label>
					<div class="col-sm-9">
						<input type="text" name="number" class="form-control input-sm"
							placeholder="请输入账号" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						密码
					</label>
					<div class="col-sm-9">
						<input type="text" name="password" class="form-control input-sm"
							placeholder="请输入密码" />
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->

		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						是否缴费
					</label>
					<div class="col-sm-9">
						<select name="ispay" class="form-control input-sm">
							<option>
								请选择
							</option>
							<option>
								是
							</option>
							<option>
								否
							</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						标识
					</label>
					<div class="col-sm-9">
						<select name="marke" class="form-control input-sm">
							<option selected="selected">
								2
							</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->

		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">
			描述信息
		</h5>
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						描述信息
					</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="desc"></textarea>
					</div>
				</div>

			</div>

		</div>

		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" />
				<a class="btn btn-warning" href="student.do?findAll">返回上一级</a>
			</div>
		</div>
		</form>

	</body>
</html>
