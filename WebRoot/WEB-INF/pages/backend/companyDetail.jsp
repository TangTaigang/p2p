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
	<script src="${path }plugins/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${path }plugins/FlatUI/dist/js/flat-ui.js"></script>
	<script type="text/javascript" src="${path }plugins/fwb/bootstrap-wysiwyg.js"></script>
	<script src="${path }plugins/fwb/external/jquery.hotkeys.js" type="text/javascript"></script>
	<script type="text/javascript" src="${path }js/productAdd.js"></script>
	<script type="text/javascript" src="${path }plugins/FlatUI/dist/js/application.js"></script>
  </head>
  
<body style="padding: 5px 10px">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">企业详情</h3>
	  </div>
	  <div class="panel-body">
	  		
	  		<form class="form-horizontal" role="form" action="productManage.html">
	  		
	  		<div class="form-group">
              <label for="companyId" class="col-lg-2 control-label">企业编号</label>
              <div class="col-lg-10">
                ${company.companyId }
              </div>
            </div>
	  		
            <div class="form-group">
              <label for="companyName" class="col-lg-2 control-label">企业名称</label>
              <div class="col-lg-10">
                	${company.companyName }
              </div>
            </div>
            
            <div class="form-group">
            	<label for="productRate" class="col-lg-2 control-label">融资佣金</label>
            	<div class="col-lg-10">
			        <div class="input-group col-lg-3" style="float: left;">
			            ${company.financingInReturn } &nbsp;%
			        </div>
			    </div>
          	</div>
            
            <div class="form-group">
              <label for="content" class="col-lg-2 control-label">内容</label>
              <div class="col-lg-10">
              	${company.companyDetail }
         	  </div>
     	   </div>
            
          </form>
	  		
	  </div>
	</div>
	
</body>
</html>
