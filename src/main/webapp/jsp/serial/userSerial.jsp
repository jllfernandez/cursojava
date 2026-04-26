<%@ page import="com.master.beans.common.AbstractBean"%>

<%
	AbstractBean bean = (AbstractBean) request.getAttribute("bean");
%>
<%
	response.setContentType("application/x-java-serialized-object;type=com.master.beans.common.AbstractBean");
%>
<%
	response.setHeader("Cache-Control", "no-cache");
%>
<%
    
	response.getOutputStream().write(bean.toSerial());
	response.getOutputStream().flush();
	response.getOutputStream().close();
%>