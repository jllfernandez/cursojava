<?xml version='1.0' encoding='UTF-8'?>
<%@ page contentType="text/xml"%>
<%@ page import="com.master.beans.RolesVO"%>
<%
	response.setHeader("Cache-Control", "no-cache");
%>
<%
	RolesVO bean = (RolesVO) request.getAttribute("bean");
%>
<%=bean.toXmlInit()%>
<%=bean.toXmlError()%>
<%=bean.toXml()%>
<%=bean.toXmlFin()%>