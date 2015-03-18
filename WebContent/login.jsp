<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage"/></title>

<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<sb:head/>
</head>
<body>
    <s:actionerror theme="bootstrap"/> 
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    
	<s:form action="login" theme="bootstrap" cssClass="well form-vertical">
		<s:textfield 
			name="username"
			placeholder="Username"
			tooltip="Enter your Name here"
			key="user" />
		<s:password
			name="password"
			placeholder="Password"
			tooltip="Enter your password"
			key="pass" />
		<s:submit 
			cssClass="btn btn-success"
			key="login" />
	</s:form>
</body>
</html>