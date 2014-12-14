<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<title>productTypeManage.html</title>

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
		function modify(name,id)
		{
			$("#productId4Modify").val(id);
			$("#productName4Modify").val(name);
			$('#proModify').modal();
		}
		
		function changeStatus(id,status)
		{
			//alert(id+status);
		}
	</script>
</head>

<body style="padding: 5px 10px;">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">产品类型管理</h3>
	  </div>
	  <div class="panel-body">
	  		<a  href="javascript:;" class="btn btn-primary btn-default" data-toggle="modal" data-target="#proAdd">
	  			添加
	  			<span class="glyphicon glyphicon-plus"></span>
	  		</a>
	  		
	  		<table class="table table-hover table-bordered">
	  			<thead>
	  				<tr>
	  					<th>产品类型ID</th>
	  					<th>产品类型名称</th>
	  					<th>状态</th>
	  					<th>操作</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  			
	  			<c:forEach items="${productTypeList}" var="productTypeList">
	  				<tr>
		  				<td>${productTypeList.productTypeId}</td>
		  				<td>${productTypeList.productTypeName}</td>
		  				<td>${productTypeList.status==0?"启用":"禁用"}</td>
		  				<td>
		  					<a class="btn btn-primary  btn-xs btn-warning" href="javascript:;" onclick="modify('${productTypeList.productTypeName}','${productTypeList.productTypeId}')">
			  						修改
			  						<span class="glyphicon glyphicon-pencil"></span>
			  					</a>
			  					<a class="btn btn-primary btn-xs btn-${productTypeList.status==0?'danger':'success'}" href="productTypeStatus.do?productTypeId=${productTypeList.productTypeId}&status=${productTypeList.status==0?'1':'0'}" onclick="changeStatus('111','0')">
			  						${productTypeList.status==0?"禁用":"启用"}
			  						<span class="glyphicon glyphicon-${productTypeList.status==0?'remove':'ok'}"></span>
			  					</a>
		  				</td>
	  				</tr>
	  			</c:forEach>
		  			
	  			</tbody>
	  		</table>
	  </div>
	</div>
	
	

	<!-- 产品修改Modal -->
	<div class="modal fade" style="margin-top: 200px;" id="proModify" tabindex="-1" role="dialog" aria-labelledby="proModifyLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	        <form class="form-horizontal" role="form" action="productTypeModify.do" method="post">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
			        <h4 class="modal-title" id="myModalLabel">产品类型修改</h4>
			      </div>
			      <div class="modal-body">
			      			<div class="form-group">
				              <label for="productId4Modify" class="col-lg-2 control-label">类型Id</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" name="productTypeId" id="productId4Modify" readonly="readonly"/>
				              </div>
				            </div>
				            <div class="form-group">
				              <label for="productName4Modify" class="col-lg-2 control-label">类型名称</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" name="productTypeName" id="productName4Modify" />
				              </div>
				            </div>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
			        <input type="submit" class="btn btn-primary" value="修改" />
			      </div>
         			</form>
	    </div>
	  </div>
	</div>
	<!-- 产品修改Modal -->
	
	<!-- 产品类型添加Modal -->
	<div class="modal fade" style="margin-top: 200px;" id="proAdd" tabindex="-1" role="dialog" aria-labelledby="proAddLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	        <form class="form-horizontal" role="form" action="productTypeAdd.do" method="post">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal">
			        	<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
			        </button>
			        <h4 class="modal-title" id="proAddLabel">产品类型添加</h4>
			      </div>
			      <div class="modal-body">
				            <div class="form-group">
				              <label for="productName4Add" class="col-lg-2 control-label">类型名称</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" id="productName4Add" name="productTypeName" placeholder="类型名称">
				              </div>
				            </div>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
			        <input type="submit" class="btn btn-primary" value="添加" />
			      </div>
           </form>
	    </div>
	  </div>
	</div>
	<!-- 产品添加Modal -->
	
</body>
</html>
