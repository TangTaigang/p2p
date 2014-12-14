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
	
	<script type="text/javascript">
		function doSubmit(){
			document.getElementById("content2").value=document.getElementById("content").innerHTML;
		}
	
	</script>
  </head>
  
<body style="padding: 5px 10px">

	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">企业修改</h3>
	  </div>
	  <div class="panel-body">
	  		
	  	<form class="form-horizontal" role="form" action="companyModify.do" method="post">
	  		
	  		<div class="form-group">
              <label for="companyId" class="col-lg-2 control-label">企业编号</label>
              <div class="col-lg-10">
                <input type="text" class="form-control" name="companyId" id="companyId" value="${company.companyId }" readonly="readonly">
              </div>
            </div>
	  		
            <div class="form-group">
              <label for="companyName" class="col-lg-2 control-label">企业名称</label>
              <div class="col-lg-10">
                <input type="text" class="form-control" name="companyName" id="companyName" placeholder="${company.companyName }">
              </div>
            </div>
            
            <div class="form-group">
            	<label for="productRate" class="col-lg-2 control-label">融资佣金</label>
            	<div class="col-lg-10">
			        <div class="input-group col-lg-3" style="float: left;">
			            <input type="text" class="form-control" name="financingInReturn" placeholder="${company.financingInReturn }">
			            <span class="input-group-addon">%</span>
			        </div>
			    </div>
          	</div>
            
            <div class="form-group">
              <label for="content" class="col-lg-2 control-label">内容</label>
              <div class="col-lg-10">
              	
			<div class="btn-toolbar" data-role="editor-toolbar"	data-target="#content">
				<div class="btn-group">
					<a class="btn" data-edit="indent" title="Indent (Tab)">
						Tab缩进
					</a>
				</div>
				<div class="btn-group">
					<a class="btn" data-edit="justifyleft"
						title="Align Left (Ctrl/Cmd+L)">
						左对齐
					</a> 
					<a class="btn" data-edit="justifycenter" title="Center (Ctrl/Cmd+E)">
						居中
					</a> 
					<a class="btn" data-edit="justifyright"
						title="Align Right (Ctrl/Cmd+R)">
						右对齐
					</a> 
					<a class="btn" data-edit="justifyfull" title="Justify (Ctrl/Cmd+J)">
						自动调整
					</a>
				</div>
		
		 		<div class="btn-group">
					<a class="btn" data-edit="undo" title="Undo (Ctrl/Cmd+Z)">
						撤销
					</a> 
					<a class="btn" data-edit="redo" title="Redo (Ctrl/Cmd+Y)">
						恢复
					</a>
				</div>
				
				</div>
              	
            	<div id="content" style="overflow:scroll; max-height:300px;border: 1px solid;height: 200px;"></div>
            	<input type="hidden" id="content2" name="content" value="" />
        	 </div>
    	 </div>
        
        <div class="form-group">
          <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-lg btn-info" style="padding: 15px 60px;border-radius: 0px;" onclick="doSubmit()">修改</button>
          </div>
        </div>
      </form>
	  		
	  		
	  		
	  </div>
	</div>
	
</body>
</html>
