<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>title</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" href="${path }plugins/bootstrap/css/bootstrap.min.css"
		type="text/css"></link>
	<link rel="stylesheet" href="${path }plugins/FlatUI/dist/css/flat-ui.css"
		type="text/css"></link>
	<link rel="shortcut icon" href="${path }plugins/FlatUI/dist/img/favicon.ico">
	<link rel="stylesheet" href="${path }css/style.css">
	<script type="text/javascript" src="${path }js/jquery.js"></script>
	<script type="text/javascript" src="${path }plugins/FlatUI/dist/js/flat-ui.js"></script>
	<script type="text/javascript" src="${path }plugins/bootstrap/js/messager.js"></script>
  </head>
  
<body style="padding: 5px 10px">
	
	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">企业报表详情(中国银行：2014年)</h3>
	  </div>
	  <div class="panel-body">
	  		<table class="table table-hover">
	  			<thead>
	  				<tr>
	  					<th>融资产品</th>
	  					<th>融资目标</th>
	  					<th>实际融资数</th>
	  					<th>佣金</th>
	  				</tr>
	  			</thead>
	  			<tbody>
		  			<tr> 	 	 	 	 	 
		  				<td>产品A</td>
		  				<td>800万</td>
		  				<td>400万</td>
		  				<td>12万</td>
		  			</tr>
		  			<tr> 	 	 	 	 	 
		  				<td>产品A</td>
		  				<td>800万</td>
		  				<td>400万</td>
		  				<td>12万</td>
		  			</tr>
	  			</tbody>
	  		</table>
	  </div>
	</div>
	
</body>
</html>
