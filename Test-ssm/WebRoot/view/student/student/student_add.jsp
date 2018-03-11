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
		<title>��ҳ</title>
		<!-- �� Bootstrap ���� CSS �ļ� -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- jQuery�ļ��������bootstrap.min.js ֮ǰ���� -->
		<script src="js/jquery.min.js"></script>
		<!-- ���µ� Bootstrap ���� JavaScript �ļ� -->
		<script src="js/bootstrap.min.js"></script>

<!-- ���� -->
<script type="text/javascript" src="datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="datetimepicker/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
  
		<script language="javascript" src="sharedata.js" charset="utf-8"></script>
	</head>

	<body>
		<div style="padding: 0px; margin: 0px;">
			<ul class="breadcrumb" style="margin: 0px;">
				<li>
					<a href="#">��������</a>
				</li>
				<li>
					ѧԱ��
				</li>
				<li>
					���ѧԱ
				</li>
			</ul>
		</div>

		<form action="student.do?save" class="form-horizontal" method="post">
			<div class="row">
				<div class="col-sm-3 col-sm-offset-4">
					<input type="submit" class="btn btn-success" value="����" />
					<a class="btn btn-warning" href="student.do?findAll">������һ��</a>
				</div>
			</div>
			<h5 class="page-header alert-info"
				style="padding: 10px; margin: 0px; margin-bottom: 5px;">
				������Ϣ
			</h5>
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							���
						</label>
						<div class="col-sm-9">
							<input type="text" name="id" readonly="readonly"
								class="form-control input-sm" placeholder="��������" />
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							����
						</label>
						<div class="col-sm-9">
							<input type="text" name="name" class="form-control input-sm"
								placeholder="����������" />
						</div>
					</div>
				</div>
			</div>
			<!--��ʼ -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							�Ա�
						</label>
						<div class="col-sm-4">
							<select name="sex" class="form-control input-sm">
								<option>
									��ѡ��
								</option>
								<option>
									����
								</option>
								<option>
									��
								</option>
								<option>
									Ů
								</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							����
						</label>
						<div class="col-sm-5">
							<input type="text" name="age" class="form-control input-sm"
								placeholder="����������" />
						</div>
					</div>
				</div>
			</div>
			<!--���� -->
			<!--��ʼ -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							�ֻ�����
						</label>
						<div class="col-sm-9">
							<input type="text" name="phone" class="form-control input-sm"
								placeholder="�������ֻ�����" />
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							�����ʼ�
						</label>
						<div class="col-sm-9">
							<input type="text" name="email" class="form-control input-sm"
								placeholder="����������ʼ�" />
						</div>
					</div>
				</div>
			</div>
			<!--���� -->
			<!--��ʼ -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							���֤
						</label>
						<div class="col-sm-9">
							<input type="text" name="idcard" class="form-control input-sm"
								placeholder="���������֤" />
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							��ͥ��ַ
						</label>
						<div class="col-sm-9">
							<input type="text" name="address" class="form-control input-sm"
								placeholder="�������ͥ��ַ" />
						</div>
					</div>
				</div>
			</div>
			<!--���� -->
			<!--��ʼ -->
			<div class="row">
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-3 control-label">
							��������
						</label>
						<div class="col-sm-9">
							<!--<input type="date" name="birthday" class="form-control input-sm"
								placeholder="�������������" />
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
            	<label class="col-sm-3 control-label">����ԺУ</label>
                <div class="col-sm-9">
                	<!--<input type="text" name="school" class="form-control input-sm" placeholder="����������ԺУ"/>-->
                
                <form name="select">
				ʡ��:
				<select name="universityProvince" id="111"
				onchange=provinceUniversityChange("111","22")>
				</select>
				��ѧ:
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
		<!--���� -->
		<!--��ʼ -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						QQ����
					</label>
					<div class="col-sm-9">
						<input type="text" name="qq" class="form-control input-sm"
							placeholder="������QQ����" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						�ҳ�����
					</label>
					<div class="col-sm-9">
						<input type="text" name="parentname" class="form-control input-sm"
							placeholder="������ҳ�����" />
					</div>
				</div>
			</div>
		</div>
		<!--���� -->
		<!--��ʼ -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						ʡ��
					</label>
					<div class="col-sm-9">
						<!--<input type="text" name="province" class="form-control input-sm" placeholder="������ʡ��"/>-->
						<select name="province" id="11" onchange=provinceCityChange("11","2")>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						�ҳ��绰
					</label>
					<div class="col-sm-9">
						<input type="text" name="parentphone"
							class="form-control input-sm" placeholder="������ҳ��绰" />
					</div>
				</div>
			</div>
		</div>
		<!--���� -->
		<!--��ʼ -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						����
					</label>
					<div class="col-sm-9">
						<!--<input type="text" name="city" class="form-control input-sm" placeholder="���������"/>-->

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
						����״̬
					</label>
					<div class="col-sm-6">
						<select name="dictionory.id" class="form-control input-sm">
							<option>
								��ѡ��
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
		<!--���� -->

		<!--��ʼ -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						�༶
					</label>
					<div class="col-sm-9">
						<select name="classes.id" class="form-control input-sm">
							<option>
								��ѡ��
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
						��ʦ
					</label>
					<div class="col-sm-9">
						<select name="staff.sid" class="form-control input-sm">
							<option>
								��ѡ��
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
		<!--���� -->

		<!--��ʼ -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						�˺�
					</label>
					<div class="col-sm-9">
						<input type="text" name="number" class="form-control input-sm"
							placeholder="�������˺�" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						����
					</label>
					<div class="col-sm-9">
						<input type="text" name="password" class="form-control input-sm"
							placeholder="����������" />
					</div>
				</div>
			</div>
		</div>
		<!--���� -->

		<!--��ʼ -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						�Ƿ�ɷ�
					</label>
					<div class="col-sm-9">
						<select name="ispay" class="form-control input-sm">
							<option>
								��ѡ��
							</option>
							<option>
								��
							</option>
							<option>
								��
							</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						��ʶ
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
		<!--���� -->

		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">
			������Ϣ
		</h5>
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">
						������Ϣ
					</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="desc"></textarea>
					</div>
				</div>

			</div>

		</div>

		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="����" />
				<a class="btn btn-warning" href="student.do?findAll">������һ��</a>
			</div>
		</div>
		</form>

	</body>
</html>
