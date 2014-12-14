<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
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
		function modify(name,id)
		{
			$("#loanTimeId4Modify").val(id);
			$("#loanTimeName4Modify").val(name);
			$('#proModify').modal();
		}
		
		function changeStatus(id,status)
		{
			
		}
	</script>
  </head>
  
<body style="padding: 5px 10px;">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">贷款周期管理</h3>
	  </div>
	  <div class="panel-body">
	  		<a  href="javascript:;" class="btn btn-primary btn-default" data-toggle="modal" data-target="#proAdd">
	  			添加
	  			<span class="glyphicon glyphicon-plus"></span>
	  		</a>
	  		
	  		<table class="table table-hover table-bordered">
	  			<thead>
	  				<tr>
	  					<th>贷款周期ID</th>
	  					<th>周期</th>
	  					<th>状态</th>
	  					<th>操作</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach items="${lendingPeriodList}" var="lendingPeriodList">
	  					<tr>
	  						<td>${lendingPeriodList.lendingPeriodId}</td>
	  						<td>${lendingPeriodList.period}</td>
	  						<td>${lendingPeriodList.status==0?"启用":"禁用"}</td>
	  						<td>
			  					<a class="btn btn-primary  btn-xs btn-warning" href="javascript:;" onclick="modify('${lendingPeriodList.period}','${lendingPeriodList.lendingPeriodId}')">
			  						修改
			  						<span class="glyphicon glyphicon-pencil"></span>
			  					</a>
			  					<a class="btn btn-primary btn-xs btn-${lendingPeriodList.status==0?'danger':'success'}" href="lendingPeriodStatus.do?lendingPeriodId=${lendingPeriodList.lendingPeriodId}&status=${lendingPeriodList.status==0?'1':'0'}" onclick="changeStatus('111','0')">
			  						${lendingPeriodList.status==0?"禁用":"启用"}
			  						<span class="glyphicon glyphicon-${lendingPeriodList.status==0?'remove':'ok'}"></span>
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
			        <form class="form-horizontal" role="form" action="lendingPeriodModify.do" method="post">
					      <div class="modal-header">
					        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					        <h4 class="modal-title" id="myModalLabel">周期修改</h4>
					      </div>
					      <div class="modal-body">
					      			<div class="form-group">
						              <label for="loanTimeId4Modify" class="col-lg-2 control-label">周期Id</label>
						              <div class="col-lg-10">
						                <input type="text" class="form-control" name="periodId" id="loanTimeId4Modify" readonly="readonly"/>
						              </div>
						            </div>
						            <div class="form-group">
						              <label for="loanTimeName4Modify" class="col-lg-2 control-label">周期</label>
						              <div class="col-lg-10">
						                <input type="text" class="form-control" name="periodName" id="loanTimeName4Modify"  placeholder="单位：月"/>
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
			        <form class="form-horizontal" role="form" action="lendingPeriodAdd.do" method="post">
					      <div class="modal-header">
					        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					        <h4 class="modal-title" id="proAddLabel">周期添加</h4>
					      </div>
					      <div class="modal-body">
						            <div class="form-group">
						              <label for="loanTimeName4Add" class="col-lg-2 control-label">周期</label>
						              <div class="col-lg-10">
						                <input type="text" class="form-control" name="periodName" id="loanTimeName4Add" placeholder="单位：月">
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
