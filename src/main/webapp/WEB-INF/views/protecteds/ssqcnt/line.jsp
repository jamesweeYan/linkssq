<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%
List<Integer> list = new ArrayList<Integer>();
int[] is = new int[]{10, 12, 21, 54, 260, 830, 710};
for(int i : is)
	list.add(i);
%>
  <div id="main" style="height:400px"></div>
<script>
	var myChart = echarts.init(document.getElementById('main')); 
	
	var option = {
		    title : {
		        text: '某楼盘销售情况',
		        subtext: '纯属虚构'
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['5期','10期','25期','50期']
		    },
		    toolbox: {
		        show : true,
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
		            data : ['周一','周二','周三','周四','周五','周六','周日']
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'5期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: {areaStyle: {type: 'default'}}},
		            data:<%=list.toString()%>
		        },
		        {
		            name:'10期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: {areaStyle: {type: 'default'}}},
		            data:[30, 182, 434, 791, 390, 30, 10]
		        },
		        {
		            name:'25期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: {areaStyle: {type: 'default'}}},
		            data:[1320, 1132, 601, 234, 120, 90, 20]
		        },
		        {
		            name:'50期',
		            type:'line',
		            smooth:true,
		            itemStyle: {normal: {areaStyle: {type: 'default'}}},
		            data:[1420, 1332, 1601, 1234, 120, 190, 120]
		        }
		    ]
		};
		                    
	myChart.setOption(option);  



</script>
