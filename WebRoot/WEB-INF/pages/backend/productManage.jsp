<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<title>productManage.html</title>

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
	<script type="text/javascript" src="${path}plugins/bootstrap/js/messager.js"></script>
	<script type="text/javascript">
		function deleteProduct(id)
		{
			 $.messager.confirm("确认删除", "确认要删除吗?删除后不能恢复", function() { 
        			alert("ok pressed");
      		 });
		}
	</script>
</head>

<body style="padding: 5px 10px">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">融资产品管理</h3>
	  </div>
	  <div class="panel-body">
	  		<a  href="productAddDetail.do" class="btn btn-primary btn-default">
	  			添加
	  			<span class="glyphicon glyphicon-plus"></span>
	  		</a>
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
					<c:forEach items="${pageResult.list}" var="productList">
	  					<tr>
	  						<td>${productList.productName}</td>
	  						<td>${productList.companyName}</td>
	  						<td>${productList.productTypeName}</td>
	  						<td>${productList.period}</td>
	  						<td>${productList.primeLendingRateFrom}% - ${productList.primeLendingRateTo}%</td>
	  						<td>${productList.financingAmountFrom}万 - ${productList.financingAmountTo}万</td>
	  						<td>有效产品</td>
	  						<td>
			  					<a class="btn btn-primary  btn-xs btn-warning" href="productModify.html">
			  						修改
			  						<span class="glyphicon glyphicon-pencil"></span>
			  					</a>
			  					<a class="btn btn-primary btn-xs btn-success" href="productDetail.html">
			  						详情
			  						<span class="glyphicon glyphicon-list-alt"></span>
			  					</a>
			  					<a class="btn btn-primary btn-xs btn-danger" href="javascript:;" onclick="deleteProduct('1')">
			  						删除
			  						<span class="glyphicon glyphicon-remove"></span>
			  					</a>
		  					</td>
	  					</tr>
	  				</c:forEach>
		  			
	  			</tbody>
	  		</table>
	  		<div class="newslist_text">
	  			<a href="${pageContext.request.contextPath}/productManage.do?pageNo=1">首页&nbsp;&nbsp;</a>
	  			<a href="${pageContext.request.contextPath}/productManage.do?pageNo=${pageResult.prePage}">上一页&nbsp;&nbsp;</a>
				<c:forEach  var="i" begin="1" end="${pageResult.totleNo}">
					<c:set  var="pageNo" value="${i}"></c:set>
					<c:choose>
						<c:when test="${pageResult.pageNo==pageNo}">
						   <a href="${pageContext.request.contextPath}/productManage.do?pageNo=${i}" class="cur">${i}&nbsp;&nbsp;&nbsp;</a>
						</c:when>
						<c:otherwise>
						 <a href="${pageContext.request.contextPath}/productManage.do?pageNo=${i}">${i}&nbsp;&nbsp;&nbsp;</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			    <a href="${pageContext.request.contextPath}/productManage.do?pageNo=${pageResult.nextPage}">&nbsp;&nbsp;下一页&nbsp;&nbsp</a>
			    <a href="${pageContext.request.contextPath}/productManage.do?pageNo=${pageResult.totleNo}">末页</a>
    		</div>		  		
	  </div>
	</div>
	
</body>
</html>
