<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><s:text name="succPage" /></title>
<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<sb:head/>
</head>
<body>
    ${requestScope.tip } <br/>
    <jsp:useBean id="d" class="java.util.Date" scope="page" />
    <s:text name="welcomeMsg" >
        <s:param><s:property value="username" /></s:param>
        <s:param>${d}</s:param>
    </s:text>
</body>
</html>