<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ITing金融</title>
<link href="${path }css/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${path }js/jquery.js" ></script>
<script type="text/javascript">
$(document).ready(function(){

	$("#choices tr").each(function()
		{
			$(this).find('a').click(function(){
					$(this).parent().find('a').removeClass('cur');
					$(this).addClass('cur');
					//TODO: 异步加载数据
			});
		}
	);
	
});

</script>
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
        <li><a href="" class="cur">融资产品</a></li>
        <li><a href="" target="_blank">每日新闻</a></li>
    </ul>
</div>


<div class="wrap bank_list">
	<div class="title clear"><h1 class="fl">产品分类</h1></div>
    <div class="bank_list_tp">
      <table width="100%" border="0" cellpadding="0" cellspacing="0" id="choices">
        <tr class="bank_list_tp1">
          <td width="10%" align="right">产品类型：</td>
          <td width="12%" align="center" valign="top" class="qb"><a href="javascript:;" class="cur">全部</a></td>
          <td width="78%" class="txt clear"><a href="javascript:;">信用贷</a><a href="javascript:;">抵押贷</a><a href="javascript:;">质押贷</a><a href="javascript:;">担保贷</a><a href="javascript:;">票据贴现</a><a href="javascript:;">其他</a></td>
        </tr>
        <tr class="bank_list_tp2">
          <td align="right">贷款周期：</td>
          <td align="center" valign="top" class="qb"><a href="javascript:;" class="cur">全部</a></td>
          <td class="txt clear"><a href="javascript:;">1个月</a><a href="javascript:;">3个月</a><a href="javascript:;">6个月</a><a href="javascript:;">12个月</a><a href="javascript:;">其他</a></td>
        </tr>
        <tr class="bank_list_tp3">
          <td align="right">贷款利率：</td>
          <td align="center" valign="top" class="qb"><a href="javascript:;" class="cur">全部</a></td>
          <td class="txt clear"><a href="javascript:;">6%以下</a><a href="javascript:;">6%-8%</a><a href="javascript:;">8%-10%</a><a href="javascript:;">10%-12%</a><a href="javascript:;">12%-14%</a><a href="javascript:;">14%以上</a></td>
        </tr>
        <tr class="bank_list_tp4">
          <td align="right">贷款规模：</td>
          <td align="center" valign="top" class="qb"><a href="javascript:;" class="cur">全部</a></td>
          <td class="txt clear"><a href="javascript:;">100万以下</a><a href="javascript:;">100万-200万</a><a href="javascript:;">200万-300万</a><a href="javascript:;">300万-500万</a><a href="javascript:;">500万-1000万</a><a href="javascript:;">1000万以上</a></td>
        </tr>
      </table>
    </div>
</div>
<div class="wrap project_release">
	<div class="project_release_tp">融资产品</div>
    <div class="project_release_bt">
    	<ul>
	       <c:forEach items="${pageResult.list}" var="productList">
    		<li class="clear">
            	<div class="fl"><img src="${path }images/jsyh.png"  width="75px" height="40px" class="pr_logo" /></div>
                <div class="fl">
                	<dl>
	                   	  <dt>产品名称：<span class="king">${productList.productName}</span></dt>
	                   	  <dt>所属银行：${productList.ownedBank}</dt>                    	
	                      <dt>产品类别：${productList.productTypeName}</dt>
	                      <dt>放贷利率：${productList.primeLendingRateFrom} % - ${productList.primeLendingRateTo}%（年化利率）</dt>
	                      <dt>放贷金额：${productList.financingAmountFrom} - ${productList.financingAmountTo}万</dt>
	                      <dt>放贷期限：${productList.period}</dt>
                    </dl>
                </div>
                <div class="view_details"><a href="product.html">查看详细</a></div>
            </li>
	     </c:forEach>
    	</ul>
    </div>
    <div class="newslist_text">
	    <a href="${pageContext.request.contextPath}/index.do?pageNo=${pageResult.prePage}">上一页</a>
	    		<c:forEach  var="i" begin="1" end="${pageResult.totleNo}">
					<c:set  var="pageNo" value="${i}"></c:set>
					<c:choose>
						<c:when test="${pageResult.pageNo==pageNo}">
						   <a href="${pageContext.request.contextPath}/index.do?pageNo=${i}" class="cur">${i}&nbsp;&nbsp;&nbsp;</a>
						</c:when>
						<c:otherwise>
						   <a href="${pageContext.request.contextPath}/index.do?pageNo=${i}">${i}&nbsp;&nbsp;&nbsp;</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
	    <a href="#">...</a>
	    <a href="${pageContext.request.contextPath}/index.do?pageNo=${pageResult.nextPage}">下一页</a>
    </div>
</div>


<div class="footer">Copyright &copy; 2014 南京网博  版权所有   <a href="mailto:cuiyi@itany.com">cuiyi@itany.com</a></div>
</body>
</html>