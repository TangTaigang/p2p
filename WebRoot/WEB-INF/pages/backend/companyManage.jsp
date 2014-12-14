<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<script type="text/javascript">
		function deleteProduct(id)
		{
			 $.messager.confirm("确认删除", "确认要删除吗?删除后不能恢复", function() { 
        			//alert("ok pressed"+id);
        			location.href="companyDelete.do?companyId="+id;
      		 });
		}
	</script>
  </head>
  
<body style="padding: 5px 10px">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">企业管理</h3>
	  </div>
	  <div class="panel-body">
	  		<a  href="companyAddDetail.do" class="btn btn-primary btn-default">
	  			添加
	  			<span class="glyphicon glyphicon-plus"></span>
	  		</a>
	  		<table class="table table-hover">
	  			<thead>
	  				<tr>
	  					<th>企业名称</th>
	  					<th>佣金比例</th>
	  					<th>企业详情</th>
	  					<th>操作</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach items="${companyList}" var="companyList">
	  					<tr>
	  						<td>${companyList.companyName}</td>
	  						<td>${companyList.financingInReturn} %</td>
	  						<td>${companyList.companyDetail}</td>
	  						<td>
			  					<a class="btn btn-primary  btn-xs btn-warning" href="companyModifyDetail.do?companyId=${companyList.companyId}">
			  						修改
			  						<span class="glyphicon glyphicon-pencil"></span>
			  					</a>
			  					<a class="btn btn-primary btn-xs btn-success" href="companyDetail.do?companyId=${companyList.companyId}">
			  						详情
			  						<span class="glyphicon glyphicon-list-alt"></span>
			  					</a>
			  					<a class="btn btn-primary btn-xs btn-danger" id="delete" href="javascript:;" onclick="deleteProduct('${companyList.companyId}')">
			  						删除
			  						<span class="glyphicon glyphicon-remove"></span>
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
