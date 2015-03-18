<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<c:forEach items="${books}" var="book">
		<li>${book}</li>
	</c:forEach>
</ul>
<%out.println("the time ending: " + new Date());
request.getAsyncContext().complete();
%>