<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<table  style="width: 755px;">
<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="10">3区间</th>
</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >1~11</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >12~22</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >23~33</th>

	</tr>
	<c:forEach items="${nomal3 }" var="cm">
		<tr>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>

		</tr>
	</c:forEach>
</table>

<table  style="width: 755px;">
<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" colspan="10">Cross3区间</th>
</tr>
	<tr>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >期号</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >1</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >2</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >3</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >4</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >5</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >6</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >1~11</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >12~22</th>
		<th
			style="width: 40px; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
			align="left" >23~33</th>

	</tr>
	<c:forEach items="${cross3 }" var="cm">
		<tr>
			<td
				style="width: 20%; border-right-style: solid; border-bottom-color: #DCE2F1; border-left-style: solid; border-left-color: #DCE2F1; border-top-color: #DCE2F1; border-bottom-style: solid; border-right-color: #DCE2F1; border-top-style: solid; background-color: #DCE2F1;"
				align="left">${cm.presentSeries }</td>

			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r1 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r2 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r3 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r4 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r5 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.r6 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt1 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt2 }</td>
			<td
				style="width: 60%; border-right-style: solid; border-bottom-color: #EAEAEF; border-left-style: solid; border-left-color: #EAEAEF; border-top-color: #EAEAEF; border-bottom-style: solid; border-right-color: #EAEAEF; border-top-style: solid; background-color: #EAEAEF;"
				align="center">${cm.crossCnt3 }</td>

		</tr>
	</c:forEach>
</table>

