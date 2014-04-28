<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
  <div>
  <ul >
<li style="float:left;width:19%;font-size: 10px;" >5期频率(0~0.6)如果连续3期以上走低到0则可能出现</font></li>
<li style="float:left;width:19%;font-size: 10px;" >10期频率(0~0.4)如果连续3期以上走低到0则可能出现</li>
<li style="float:left;width:24%;font-size: 10px;" >25期频率(0.04~0.32)如果连续3期以上走低到0.04则可能出现</li>
<li style="float:left;width:20%;font-size: 10px;" >如果5期频率从0.2平台徘徊4期以后开始上行则可能出现</li>
<li style="float:left;width:18%;font-size: 10px;" >如果5期频率上穿10期频率则进入活跃期</li>
  </ul>
  </div>
<%
for(int i=1;i<=33;i++){
%>
  <div id="main_<%=i %>" style="height:480px;width: 33.3%;float: left;"></div>
<%} %>
<script>
var option =null;
var myChart = null;
<%
Map<String, List<Double>> mapList = (Map<String, List<Double>>)request.getAttribute("redMapList");
String key = "";
for(int j=1;j<=33;j++){
	if(j<10)
		key="0"+j;
	else
		key=""+j;
%>
	 option = {
		    title : {
		        text: '<%=key%>球统计',
		        subtext: '球球必达'
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['5期','10期','25期','50期']
		    },
		    toolbox: {
		        show : false,
		        feature : {
		            mark : {show: true},
		            dataView : {show: true, readOnly: false},
		            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    calculable : true,
		    xAxis : [
		        {
		            type : 'category',
		            boundaryGap : false,
		            min:1,
		            max:10,
		            data : ['001','002','003','004','005','006','007','008','009','010']
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value',
		            min:0.00,
		            max:0.66,
		            scale:true,
		            splitNumber:10,
		            splitArea:{show:true},
		            precision:2
		        }
		    ],
		    series : [
		        {
		            name:'5期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: { lineStyle: { shadowColor : 'rgba(0,0,0,0.4)', shadowBlur: 5, shadowOffsetX: 3, shadowOffsetY: 3}}},
		            data:<%=mapList.get(key+ "_5").toString()%>
		        },
		        {
		            name:'10期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: { lineStyle: { shadowColor : 'rgba(0,0,0,0.4)', shadowBlur: 5, shadowOffsetX: 3, shadowOffsetY: 3}}},
		            data:<%=mapList.get(key+ "_10").toString()%>
		        },
		        {
		            name:'25期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: { lineStyle: { shadowColor : 'rgba(0,0,0,0.4)', shadowBlur: 5, shadowOffsetX: 3, shadowOffsetY: 3}}},
		            data:<%=mapList.get(key+ "_25").toString()%>
		        },
		        {
		            name:'50期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: { lineStyle: { shadowColor : 'rgba(0,0,0,0.4)', shadowBlur: 5, shadowOffsetX: 3, shadowOffsetY: 3}}},
		            data:<%=mapList.get(key+ "_50").toString()%>
		        }
		    ]
		};
	  myChart = echarts.init(document.getElementById('main_<%=j%>')); 
		myChart.setOption(option);  
	 <%
}
	 %>

</script>
