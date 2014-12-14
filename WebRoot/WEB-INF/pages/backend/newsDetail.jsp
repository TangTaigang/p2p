<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
isELIgnored="false"
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<title>newsModify.html</title>

	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="this is my page">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${path}plugins/bootstrap/css/bootstrap.min.css"
		type="text/css"></link>
	<link rel="stylesheet" href="${path}css/style.css">
	<script type="text/javascript" src="${path}js/jquery.js"></script>
	<script src="${path}plugins/bootstrap/js/bootstrap.min.js"></script>
	
	
</head>

<body style="padding: 5px 10px">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">新闻详情</h3>
	  </div>
	  <div class="panel-body">
			<h1>${news.newsTitle }</h1>
			<img alt="" src="${path}${news.image }" class="img-thumbnail">
			<p class="lead">${news.content }</p>
	  </div>
	</div>
	
</body>
</html>
