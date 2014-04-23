<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:forEach items="${intervalList }" var="cm" step="1" varStatus="st">
	${cm }<br/>
</c:forEach>
