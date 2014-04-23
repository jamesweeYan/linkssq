<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:forEach items="${cmList }" var="cm" step="1" varStatus="st">
	<table id="table_${st.index }" style="width: 755px;">

		<tr>
			<c:choose>
				<c:when test="${cm.openNum!=null }">
					<th式、、a///x/x	
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
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="center">出现个数</th>
		</tr>
		<tr>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">高频率：</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center"><c:forEach items="${cm.groups_one }"
					var="entity">
					<span>${entity}</span>&nbsp;
					</c:forEach></td>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center"><label id="table_tr_span_high_${st.index }"></label></td>
		</tr>

		<tr>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">中频率：</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center"><c:forEach items="${cm.groups_two }"
					var="entity">
					<span>${entity}</span>&nbsp;
					</c:forEach></td>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center"><label id="table_tr_span_mid_${st.index }"></label></td>
		</tr>

		<tr>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">低频率：</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center"><c:forEach items="${cm.groups_thr }"
					var="entity">
					<span>${entity}</span>&nbsp;
					</c:forEach></td>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center"><label id="table_tr_span_lowe_${st.index }"></label></td>
		</tr>
		<tfoot>
			<tr>
				<td colspan="11">频率组合：${cm.frequency} 组码：${cm.zuMaIds }</td>
			</tr>
			<tr>
				<td colspan="11">共同码：${cm.zuMaReds }</td>
			</tr>
		</tfoot>
	</table>
	<script>
		$(document).ready(function() {
			var reds = '${cm.redNum}';
			if (reds != '') {
				var sp = reds.split(" ");
				var high = 0;
				var midou = 0;
				var lowe = 0;
				var step = 0;

				$("#table_${st.index} span").each(function(index) {
					for (var i = 0; i < sp.length; i++) {
						if ($(this).text() == sp[i]) {
							$(this).css("color", "red");
							step++;
							//alert((index+1)+"===="+$(this).text()+"=="+step);
						} else {
							continue;
						}

					}
					//	alert(index+1);
					if (index + 1 == 11) {
						high = step;
						step = 0;
					} else if (index + 1 == 22) {
						midou = step;
						step = 0;
					} else if (index + 1 == 33) {
						lowe = step;
					}
				});
				$("#table_tr_span_high_${st.index }").html(high);
				$("#table_tr_span_mid_${st.index }").html(midou);
				$("#table_tr_span_lowe_${st.index }").html(lowe);
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
