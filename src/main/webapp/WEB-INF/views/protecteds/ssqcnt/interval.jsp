<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:forEach items="${cmList }" var="cm" step="1" varStatus="st">
	
	<table id="table_${st.index }" style="width: 755px;">
	<tr>
			<c:choose>
				<c:when test="${cm.openNum!=null }">
					<th
						style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
						align="left" colspan="2">开奖日期：${cm.openNumDate }
						开奖期号：${cm.openNumSeries } 开奖号码：${cm.openNum }</th>
				</c:when>
				<c:otherwise>
					<th
						style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
						align="left" colspan="2">开奖日期：****-**-**
						开奖期号：******* 开奖号码：￥  ￥  ￥  ￥  ￥ ￥ | ￥</th>
				</c:otherwise>


			</c:choose>
			</tr>
			
			<tr>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">荐：</td>
				
				<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">
				${cm.spanReds }
				</td>
				</tr>
				</table>
	<script>
		$(document).ready(function() {
			var reds = '${cm.redNum}';
			if (reds != '') {
				var sp = reds.split(" ");

				$("#table_${st.index} span").each(function(index) {
					for (var i = 0; i < sp.length; i++) {
						if ($(this).text() == sp[i]) {
							$(this).css("color", "red");
						} else {
							continue;
						}

					}

				});

			} else {
				var selector = $("#table_${st.index} span");
				selector.on("click", function() {
					if ($(this).css("color") == 'rgb(255, 0, 0)')
						$(this).removeAttr("style");
					else
						$(this).css("color", "red");
				});
			}

		});
	</script>
</c:forEach>
