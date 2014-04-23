<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

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
		            min:0.01,
		            max:0.66,
		            scale:true,
		            splitNumber:24,
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
