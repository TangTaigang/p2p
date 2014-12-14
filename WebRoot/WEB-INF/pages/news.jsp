<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ITing金融-每日新闻</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${path }css/css.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="${path }js/jquery-1.4.2.min.js"></script>
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
        <li><a href="index.html">融资产品</a></li>
        <li><a href="news.html" target="_blank"  class="cur">每日新闻</a></li>
    </ul>
</div>


<div class="wrap font16">首页 >> 每日新闻</div>
<div class="wrap">
<div class="title clear"><h1 class="fl">今日头条</h1></div>
	<div class="salon_top clear">
    	<div class="fl">
        	<ul id="foo1">
            	<li><img src="${path }images/3(31).jpg" width="613" height="459" /></li>
            </ul>
            <div id="pager1" class="pager"></div>
        </div>
        <div class="fr">
        	<div class="bt"><h1><a href="" title="助推小微企业发展融资模式专场推介会">助推小微企业发展融资模式专场推介会助推小微企业发展融资模式专场推介会</a></h1>
            	<div class="hudongsalon_success">
            		<span class="fe4800">（成功举办）</span>
                </div>
            </div>
            <div class="in clear">
                <div class="time">时间：2014年7月</div>
            </div>
            <div class="txt">
            7月23日上午，由市金融办、南京金融发展促进会联合主办、南京联交所协办的“创新金融服务，落实普惠金融”助推小微企业发展融资模式推介会在联交所一楼交易大厅召开。市政协主席沈健、市委常委、常务副市长刘以安、省银监局副局长丁灿、市金融促进会会长白世春、紫金投资集团董事长王海涛、副总经理管毅等领导出席会议，市金融办主任刘永彪主持会议...</div>
        </div>
    </div>
</div>
<div class="wrap">
	<div class="title clear"><h1 class="fl">其他新闻</h1></div>
    <div class="salon">
    	<ul>
        	<li class="clear">
            	<div class="fl"><img src="${path }images/3.png" /></div>
                <div class="fl">
                	<div class="salon_title clear"><div class="fl"><a href="" title="投贷保联盟•融动紫金•麒麟科技创新园专场投融资对接会">联交所成功承办投贷保联盟•融动紫金•麒麟科....</a><span class="fe4800">（已结束）</span></div><div class="fr">日期：2014年05月26日</div></div>
                    <div class="salon_in">2014年5月23日下午，“投贷保联盟•融动紫金•麒麟科技创新园专场投融资对接会”在南京联交所成功举行。本次活动由南京市金融办、南京市麒麟科技创新园管委会主办，南京联交所承办。南京市金融办副主任范慧娟、南京麒麟科技创新园管委会副主任李振楚出席活动，赛富投资基金、九鼎投资、毅达资本、苏商资本等知名创投机构和市投贷保联盟二十多家成员企业参会。</div>
                </div>
            </li>
        	<li class="clear">
            	<div class="fl"><img src="${path }images/2.png" /></div>
                <div class="fl">
                	<div class="salon_title clear"><div class="fl"><a href="" title="联交所成功承办中国（南京）软件谷 321人才暨投融资对接会">联交所成功承办中国（南京）软件谷 321人才....</a><span class="fe4800">（已结束）</span></div><div class="fr">日期：2014年04月20日</div></div>
                    <div class="salon_in">2014年4月19日下午，“中国（南京）软件谷321人才暨投融资对接会”在联交所312会议室成功举行。本次活动由中国（南京）软件谷管委会主办，南京联交所、软件谷科技人才局承办，紫金科创、市创投协会协办。市科技创业家联合会、红杉资本、达晨创投、深创投、九鼎投资、苏商投资、苏豪投资、紫金科创、市高风投等十余家创投机构投资专家及三十余家企业代表参加了本次对接活动。</div>
                </div>
            </li>
            <li class="clear">
            	<div class="fl"><img src="${path }images/4.jpg" /></div>
                <div class="fl">
                	<div class="salon_title clear"><div class="fl"><a href="" title="融动紫金大创E社区启动暨首次创业公开课活动成功举办">融动紫金大创E社区启动暨首次创业公开....</a><span class="fe4800">（已结束）</span></div><div class="fr">日期：2014年01月10日</div></div>
                    <div class="salon_in">融动紫金网大创E社区首次创业公开课成功举办，南京市金融办、人社局、财政局相关领导出席会议，大学生创业企业家参会并且参与互动讨论。</div>
                </div>
            </li>
        </ul>
        <div class="newslist_text"><a href="#">上一页</a><a href="#" class="cur">1</a><a href="#">2</a><a href="#">3</a><a href="#">4</a><a href="#">5</a><a href="#">6</a><a href="#">7</a><a href="#">...</a><a href="#">下一页</a></div>
    </div>
</div>
<div class="footer">Copyright &copy; 2014 南京网博  版权所有   <a href="mailto:cuiyi@itany.com">cuiyi@itany.com</a></div>
  </body>
</html>
