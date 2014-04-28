<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<table style="width: 50%; float: left;">
	<tr>
		<th
			style="width: 100%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="10">3区间</th>
	</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">1~11</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">12~22</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">23~33</th>

	</tr>
	<c:forEach items="${nomal3 }" var="cm">
		<tr>
			<td
				style="width: 22%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 16%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 16%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 16%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>

		</tr>
	</c:forEach>
</table>
<!-- cross 3 area -->
<table style="width: 50%; float: left;">
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="10">Cross3区间</th>
	</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余0</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余2</th>

	</tr>
	<c:forEach items="${cross3 }" var="cm" step="1" varStatus="st">
		<tr>
			<td
				style="width: 22%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 16%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 16%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 16%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>

		</tr>
		
		<c:if test="${st.index==4 }">
		<tr>
		<td>0</td>
		<td colspan="9">${cm.crossReds1 }</td>
		</tr>
			<tr>
		<td>1</td>
		<td colspan="9">${cm.crossReds2 }</td>
		</tr>
			<tr>
		<td>2</td>
		<td colspan="9">${cm.crossReds3 }</td>
		</tr>
		</c:if>
	</c:forEach>
</table>

<!-- 4area -->
<table style="width: 50%; float: left;">
	<tr>
		<th
			style="width: 100%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="11">4区间</th>
	</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">1~8</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">9~16</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">17~24</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">25~33</th>

	</tr>
	<c:forEach items="${nomal4 }" var="cm">
		<tr>
			<td
				style="width: 22%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt4 }</td>

		</tr>
	</c:forEach>
</table>

<!-- cross 4 area -->
<table style="width: 50%; float: left;">
	<tr>
		<th
			style="width: 100%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="11">Cross4区间</th>
	</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余0</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余3</th>

	</tr>
	<c:forEach items="${cross4 }" var="cm">
		<tr>
			<td
				style="width: 22%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>
			<td
				style="width: 12%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt4 }</td>

		</tr>
	</c:forEach>
</table>


<!-- 5 area -->
<table style="width: 50%; float: left;">
	<tr>
		<th
			style="width: 100%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="12">5区间</th>
	</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">1~6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">7~13</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">14~20</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">21~27</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">28~33</th>

	</tr>
	<c:forEach items="${nomal5 }" var="cm">
		<tr>
			<td
				style="width: 22%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt4 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt5 }</td>
		</tr>
	</c:forEach>
</table>
<!-- cross 5  -->
<table style="width: 50%; float: left;">
	<tr>
		<th
			style="width: 100%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="12">Cross5区间</th>
	</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left">6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余0</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="center">余4</th>

	</tr>
	<c:forEach items="${cross5 }" var="cm">
		<tr>
			<td
				style="width: 22%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 5%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt4 }</td>
			<td
				style="width: 9.6%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt5 }</td>
		</tr>
	</c:forEach>
</table>