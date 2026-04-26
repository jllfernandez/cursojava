<%@ page import="com.master.beans.common.AbstractBean"%>

<%
	AbstractBean bean = (AbstractBean) request.getAttribute("bean");
%>
<%=bean.toXmlInit()%>
<%=bean.toXmlError()%>
<%=bean.toXml()%>
<%=bean.toXmlFin()%>
<%=bean.toString()%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<h1>SALIDA OK !!!</h1>
	<H3></H3>
</body>
</html>