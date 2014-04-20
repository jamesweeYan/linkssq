<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:forEach items="${cmList }" var="cm" step="1" varStatus="st">
	<table id="table_${st.index }">
		<c:if test="${cm.openNum!=null }">
			<tr>
				<th
					style="width: 40px; border-right-style: solid; border-bottom-color: AntiqueWhite; border-left-style: solid; border-left-color: AntiqueWhite; border-top-color: AntiqueWhite; border-bottom-style: solid; border-right-color: AntiqueWhite; border-top-style: solid;"
					align="left" colspan="11">日期：${cm.openNumDate }
					期号：${cm.openNumSeries } 号码：${cm.openNum }</th>
			</tr>
		</c:if>

		<tr>
			<c:forEach items="${cm.groups_one }" var="entity">
				<td
					style="width: 40px; border-right-style: solid; border-bottom-color: SlateGray; border-left-style: solid; border-left-color: SlateGray; border-top-color: SlateGray; border-bottom-style: solid; border-right-color: SlateGray; border-top-style: solid;"
					align="center">${entity}</td>
			</c:forEach>
		</tr>
		<tr>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="01"><span>01</span></span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="02">02</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="03">03</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="04">04</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="05">05</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="06">06</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="07">07</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="08">08</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="09">09</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="10">10</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="11">11</span></th>
		</tr>

		<tr>
			<c:forEach items="${ cm.groups_two }" var="entity">
				<td
					style="width: 40px; border-right-style: solid; border-bottom-color: SlateGray; border-left-style: solid; border-left-color: SlateGray; border-top-color: SlateGray; border-bottom-style: solid; border-right-color: SlateGray; border-top-style: solid;"
					align="center">${entity}</td>
			</c:forEach>
		</tr>
		<tr>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="12">12</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="13">13</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="14">14</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="15">15</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="16">16</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="17">17</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="18">18</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="19">19</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="20">20</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="21">21</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="22">22</span></th>
		</tr>

		<tr>
			<c:forEach items="${cm.groups_thr}" var="entity">
				<td
					style="width: 40px; border-right-style: solid; border-bottom-color: SlateGray; border-left-style: solid; border-left-color: SlateGray; border-top-color: SlateGray; border-bottom-style: solid; border-right-color: SlateGray; border-top-style: solid;"
					align="center">${entity}</td>
			</c:forEach>
		</tr>
		<tr>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="23">23</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="24">24</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="25">25</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="26">26</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="27">27</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="28">28</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="29">29</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="30">30</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="31">31</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="32">32</span></th>
			<th
				style="width: 40px; border-right-style: solid; border-bottom-color: Gold; border-left-style: solid; border-left-color: Gold; border-top-color: Gold; border-bottom-style: solid; border-right-color: Gold; border-top-style: solid;"
				align="center"><span id="33">33</span></th>
		</tr>
		<tfoot>
			<tr>
				<td colspan="11">频率组合：${cm.frequency}  组码：${cm.zuMaIds }</td>
			</tr>
			<tr>
				<td colspan="11">共同码：${cm.zuMaReds }</td>
			</tr>
		</tfoot>
	</table>
	<script>
	$(document).ready(function() {
		var reds = '${cm.redNum}';
		var sp = reds.split(" ");

		
			$("#table_${st.index} span").each(function() {
				for (var i = 0; i < sp.length; i++){
					if($(this).text()==sp[i])
						$(this).css("color","red");
					else
						continue;
				}
			
			});

	});
</script>
</c:forEach>
