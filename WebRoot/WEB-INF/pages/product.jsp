<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ITing金融-产品</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" href="${path }plugins/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<link rel="stylesheet" href="${path }plugins/FlatUI/dist/css/flat-ui.css" type="text/css"></link>
	<link rel="shortcut icon" href="${path }plugins/FlatUI/dist/img/favicon.ico">
	<link rel="stylesheet" href="${path }css/css.css">
	<script type="text/javascript" src="${path }js/jquery.js"></script>
	<script type="text/javascript" src="${path }plugins/FlatUI/dist/js/flat-ui.js"></script>
	<script type="text/javascript" src="${path }js/base.js"></script>	
		
  </head>
  
  <body>

	<div class="wrap header oauto clear">
	    <div class="fr">
	    	<a href="#" >
	    		当前时间：2014年10月10日 04:28:35
	    	</a>
	    </div>
	</div>
	<div class="logo-nav">
	    <div class="wrap oauto">
	        <div class="clear">
	            <div class="fl"><img src="${path }images/logo.png" /></div>
	        </div>
	    </div>
	</div>
	<div class="menu">
	    <ul class="clear">
	        <li><a href="index.html" class="cur">融资产品</a></li>
	        <li><a href="news.html" target="_blank">每日新闻</a></li>
	    </ul>
	</div>
	
	
	
	<div class="wrap font16">首页 >> 融资产品 >> 银投联贷</div>
	<div class="wrap clear">
		<div class="fl">
	    	<div class="detail_detail">
	        	<div class="success_tp clear">
	            	<div class="fl">银投联贷</div>
	            </div>
	            <div class="detail_detail_bt">
	            	<div class="detail_detail_bt1">
	            	  <table width="100%" border="0" cellspacing="0" cellpadding="0">
	                    <tr>
	                      <td>产品名称：银投联贷</td>
	                      <td>放贷利率：8.6%（年化利率）</td>
	                    </tr>
	                    <tr>
	                      <td>发行单位：杭州银行</td>
	                      <td>放贷金额：50-500万</td>
	                    </tr>
	                    <tr>
	                      <td>产品类型：信用贷</td>
	                      <td>放贷期限：12个月</td>
	                    </tr>
	                  </table>
	            	</div>
	                <div class="detail_detail_bt3 clear">
	                	<div class="fl"><img src="${path }images/logo.png" />经理：杨经理<br />杭州银行南京分行小微金融</div>
	                    <div class="fr">
	                    	<a href="javascript:;" data-toggle="modal" data-target="#applyModal" class="apply-btn" />
	                    		申请
	                    	</a>
	                    </div>
	                </div>
	            </div>
	        </div>
	        <div class="detail_detail_title title clear"><h1 class="fl">产品详情</h1></div>
	        <div class="detail_detail_in">
	        	<h1><span class="logo1"></span>产品描述</h1>
	            <p>银投联贷业务是指对于合作范围内的PE拟投或已投的科技型中小企业的借款申请，本行在综合考虑私募股权投资机构的投资管理能力和借款人未来发展前景等因素的基础上，以信用、股权质押、PE保证或类保证等方式，向科技型中小企业发放用于满足其日常经营资金需求的授信业务。</p>
	            <h1><span class="logo1"></span>功能特点</h1>
	            <p>利用创投机构对科技型中小企业经营状况以及发展潜力的专业判断，有效控制客户准入风险；
	            （2）股权融资和债权融资相结合，在不稀释股权的基础上有效解决企业流动资金需求；
	            （3）建立起银行、创投机构与科技型中小企业的合作平台。</p>
	            <h1><span class="logo1"></span>相关要求</h1>
	            <p>（1）贷款金额：根据借款人的实际资金需求、偿债能力及我行认可的授信方案综合确定银投联贷的贷款金额，该品种项下的最高金额不得超过创投公司实际投入到借款人的创投（风投）资金的80％。
	            （2）贷款期限：由贷款人根据借款人实际生产周期、借款用途、借款人风险承受能力、经营特点等情况具体确定，不得超过创投公司和借款人约定的退出投资期限。
	            （3）贷款利率：贷款利率按照中国人民银行利率政策及我行的贷款定价政策执行。</p>
	        </div>
	    </div>
	    <div class="fr">
	    	<div class="success">
	        	<div class="success_tp">产品成功申请人<span class="fe4800">（）</span>人</div>
	            <div class="success_bt">
	            	<ul>
	                	<li><h1>1</h1><span>将先生</span>成功申请（10万元）</li>
	                    <li><h1>2</h1><span>张先生</span>成功申请（110万元）</li>
	                    <li><h1>3</h1><span>付女士</span>成功申请（300万元）</li>
	                </ul>
	            </div>
	        </div>
	    </div>
	</div>
	
	
	<!-- 申请 -->
	<div class="modal fade" style="margin-top: 200px;" id="applyModal" tabindex="-1" role="dialog" aria-labelledby="applyModal" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	        <form class="form-horizontal" role="form" action="">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
			        <h4 class="modal-title" id="myModalLabel">申请</h4>
			      </div>
			      <div class="modal-body">
			      			<div class="form-group">
				              <label for="productId" class="col-lg-2 control-label">产品ID</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" id="productId"  readonly="readonly" value="11"/>
				              </div>
				            </div>
				            <div class="form-group">
				              <label for="productName" class="col-lg-2 control-label">产品名称</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" id="productName" readonly="readonly" value="银投联贷" />
				              </div>
				            </div>
				            <div class="form-group">
				              <label for="applyPersonIDCard" class="col-lg-2 control-label">申请人身份证号</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" id="applyPersonIDCard" placeholder="申请人身份证号" />
				              </div>
				            </div>
				            <div class="form-group">
				              <label for="applyPerson" class="col-lg-2 control-label">申请人</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" id="applyPerson" placeholder="请使用上面身份证上的姓名" />
				              </div>
				            </div>
				            
				            
				            
				            
				             <div class="form-group">
				              <label for="applyNum" class="col-lg-2 control-label">申请金额</label>
				              <div class="col-lg-10">
				                <input type="text" class="form-control" id="applyNum" placeholder="单位：万元" />
				              </div>
				            </div>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
			        <input type="submit" class="btn btn-primary" value="申请" />
			      </div>
         			</form>
	    </div>
	  </div>
	</div>
	<!-- 申请 -->
	<!--end-->
	<div class="footer">Copyright &copy; 2014 南京网博  版权所有  <a href="mailto:cuiyi@itany.com">cuiyi@itany.com</a></div>
</body>
</html>
