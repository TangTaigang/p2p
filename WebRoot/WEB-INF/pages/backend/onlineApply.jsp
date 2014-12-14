<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<title>onlineApply.html</title>

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
	    <h3 class="panel-title">在线申请管理</h3>
	  </div>
	  <div class="panel-body">
	  		<table class="table table-hover">
	  			<thead>
	  				<tr>
	  					<th>产品名称</th>
	  					<th>发行单位</th>
	  					<th>产品类型</th>
	  					<th>贷款周期</th>
	  					<th>贷款利率</th>
	  					<th>贷款规模</th>
	  					<th>状态</th>
	  					<th>操作</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach items="${applyList}" var="applyList">
	  					<tr>
	  						<td>${applyList.productName }</td>
	  						<td>${applyList.companyName }</td>
	  						<td>${applyList.productTypeName }</td>
	  						<td>${applyList.period }</td>
	  						<td>${applyList.primeLendingRateFrom }% - ${applyList.primeLendingRateTo }%</td>
	  						<td>${applyList.financingAmountFrom }万 - ${applyList.financingAmountTo }万</td>
	  						<td>有效产品</td>
	  						<td>
			  					<a class="btn btn-primary  btn-xs btn-success" href="onlineApplyDetail.do?productId=${applyList.productId}">
			  						在线申请详情
			  						<span class="glyphicon glyphicon-arrow-right"></span>
			  					</a>
		  					</td>
	  					</tr>
	  				</c:forEach>
	  			
	  			</tbody>
	  		</table>
	  </div>
	</div>
	
</body>
</html>
