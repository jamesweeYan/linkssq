<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>双色球统计!</title>
<link type="">
<script type="text/javascript" src="<%=request.getContextPath()%>/statics/js/jquery-2.1.0.min.js"></script>
<!-- <script type="text/javascript" src="http://echarts.baidu.com/doc/example/www/js/esl.js"></script> -->
<script type="text/javascript" src="<%=request.getContextPath()%>/statics/js/echarts-plain.js"></script>
<script type="text/javascript">
	function query() {
		$.ajax({
			url : "<%=request.getContextPath()%>/groupsCnt?qv="+$("#qroupsText").val()+"&qt="+$("#qroupsStep").val()+"&depth="+$("#depth").val()+"&isasc="+$("#isasc").val()+"&dt="+new Date().getTime(),
			type:"POST",
			dataType : "html",
			success : function(done) {
				$("#groupsContentDIV").html(done);
			}
		});
	}
	
	function queryLine() {
		$.ajax({
			url : "<%=request.getContextPath()%>/cntLine?dt="+new Date().getTime(),
			type:"POST",
			dataType : "html",
			success : function(done) {
				$("#groupsContentDIV").html(done);
			}
		});
	}
</script>
</head>
<body>
	<form action="" method="post">
		<div id="groupsDIV">
			样本数：<input id="qroupsText" value="29">样本步长：<input id="qroupsStep" value="0">&nbsp;样本深度：<input id="depth" value="33">
			样本排序？：<select id="isasc">
			<option selected="selected" value="N">默认</option>
			<option value="Y">升序</option>
			</select><input type="button" onclick="query()" value="查询">
			<br/>
			<input type="button" onclick="queryLine()" value="line">
			<div id="groupsContentDIV" class="redBallBox"></div>
		</div>

	</form>

</body>
</html>
