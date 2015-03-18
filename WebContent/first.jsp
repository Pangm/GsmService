<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
Map<String, Integer> itemMap = 
    (Map<String, Integer>)session.getAttribute("itemMap");

if (itemMap == null) {
	itemMap = new HashMap<String, Integer>();
	itemMap.put("Book", 0);
	itemMap.put("Computer", 0);
	itemMap.put("Car", 0);
}

String[] buys = request.getParameterValues("item");

for (String item : buys) {
	if (item.equals("Book")) {
		int num1 = itemMap.get("Book").intValue();
		itemMap.put("Book", num1 + 1);
	} else if (item.equals("Computer")) {
		int num1 = itemMap.get("Computer").intValue();
		itemMap.put("Computer", num1 + 1);
	} else if (item.equals("Car")) {
		int num1 = itemMap.get("Car").intValue();
		itemMap.put("Car", num1 + 1);
	}}
session.setAttribute("itemMap", itemMap);
%>
</head>
<body>
	<p>Welcome</p>
	What you have bought:
	<br /> Books:
	<%= itemMap.get("Book") %><br /> Computers:
	<%= itemMap.get("Computer") %><br /> Cars :
	<%= itemMap.get("Car") %><br />
	<p>
		<a href="shop.jsp">Welcome to buy again.</a>
	</p>
</body>
</html>