<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>双色球统计!</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/statics/js/jquery-2.1.0.min.js"></script>
<script type="text/javascript">
	function query() {
		$.ajax({
			url : "<%=request.getContextPath()%>/groupsCnt?qv="+$("#qroupsText").val()+"&qt="+$("#qroupsStep").val()+"&dt="+new Date().getTime(),
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
			样本数：<input id="qroupsText" value="29">样本步长：<input id="qroupsStep" value="0">&nbsp;<input type="button" onclick="query()" value="查询">
			<div id="groupsContentDIV"></div>
		</div>

	</form>

</body>
</html>
