<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<title>onlineApplyDetail.html</title>

	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="this is my page">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${path}plugins/bootstrap/css/bootstrap.min.css"
		type="text/css"></link>
	<link rel="stylesheet" href="${path}plugins/FlatUI/dist/css/flat-ui.css"
		type="text/css"></link>
	<link rel="shortcut icon" href="${path}plugins/FlatUI/dist/img/favicon.ico">
	<link rel="stylesheet" href="${path}css/style.css">
	<script type="text/javascript" src="${path}js/jquery.js"></script>
	<script type="text/javascript" src="${path}plugins/FlatUI/dist/js/flat-ui.js"></script>
</head>

<body style="padding: 5px 10px">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">在线申请详情</h3>
	  </div>
	  <div class="panel-body">
	  		<table class="table table-hover">
	  			<thead>
	  				<tr>
	  					<th>产品名称</th>
	  					<th>申请人</th>
	  					<th>申请数额</th>
	  					<th>申请日期</th>
	  					<th>身份证号</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach items="${applyList}" var="apply">
	  					<tr>
	  						<td>${apply.applyProductName }</td>
	  						<td>${apply.applyPerson }</td>
	  						<td>${apply.applyNum } 万</td>
	  						<td>${apply.applyDate }</td>
	  						<td>${apply.applyPersonIDCard }</td>
	  					</tr>
	  				</c:forEach>
	  			</tbody>
	  		</table>
	  </div>
	</div>
	
</body>
</html>
