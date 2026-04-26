<?xml version='1.0' encoding='UTF-8'?>
<%@ page contentType="text/xml"%>
<%@ page import="com.master.beans.common.AbstractBean"%>
<%
	response.setHeader("Cache-Control", "no-cache");
%>
<%
	AbstractBean bean = (AbstractBean) request.getAttribute("bean");
%>
<%=bean.toXmlInit()%>
<%=bean.toXmlError()%>
<%=bean.toXml()%>
<%=bean.toXmlFin()%>