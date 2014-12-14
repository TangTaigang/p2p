<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录到Iting</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" href="${path }plugins/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<link rel="stylesheet" href="${path }plugins/FlatUI/dist/css/flat-ui.css" type="text/css"></link>
	<link rel="shortcut icon" href="${path }plugins/FlatUI/dist/img/favicon.ico">
	<link rel="stylesheet" href="${path }css/style.css">
	<script type="text/javascript" src="${path }js/jquery.js"></script>
	<script type="text/javascript" src="${path }plugins/FlatUI/dist/js/flat-ui.js"></script>
	<script type="text/javascript" src="${path }js/base.js"></script>
    <title>登录到Iting</title>
    	<style type="text/css">
    		$(function(){
    			$('#loginFrm');
    		})	
    	</style>
	<style type="text/css">
		body{
			background-color: #7784a0;
			padding-top: 40px;
		}
		.loginDiv{
			margin: auto;
			height: 300px;
			width: 600px;
			margin-top:1111pz;;
			background-color: #aaaaaa;
			color: white;
		}
		.loginFrm{
			margin: auto;
			height: 300px;
			width: 600px;
			height: 300px;
			background: #ffffff;
			margin-top:1111pz;;
		}
	</style>
	<script type="text/javascript">
		function doSubmit(){
			var obj = document.getElementById("loginForm");
			obj.submit();
		}
	</script>
  </head>
  
<body>
	<div class="loginDiv" style="height: 61px;">
		<h3 style="text-align: center;padding-top: 10px;">欢迎使用ITing融资系统</h3>
	</div>
	<div class="loginFrm">
			<form id="loginForm" class="form-horizontal" role="form" action="login.do" method="post">
			    <div class="form-group" style="padding-top: 15px;">
					<label for="userName" class="col-lg-2 control-label">用户名</label>
					<div class="col-lg-9">
						<input type="text" class="form-control" id="userName" name="userName" value="admin"/>
					</div>
				</div>
				<div class="form-group">
					  <label for="pwd" class="col-lg-2 control-label">密码</label>
					  <div class="col-lg-9">
					     <input type="password" class="form-control" id="pwd" name="pwd" value="admin" />
					  </div>
				</div>
				<div class="form-group" align="right">
					  <div class="col-lg-10">
					  <a style="border: none;" class="btn" href="javascript:doSubmit()" >
					  	<img alt="" src="${path }images/login_btn.png">
					  </a>
					  </div>
				</div>
				<div  class="form-group" align="right" >
					<hr style="width:80%"/>	
					<div class="col-lg-10" style="color:lightgrey">
					  		南京网博   designed by 
					  </div>
				</div>
	        </form>
	</div>
</body>
</html>
