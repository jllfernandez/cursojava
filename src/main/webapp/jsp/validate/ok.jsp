<%@ page import="com.master.beans.common.AbstractBean"%>


<%
	AbstractBean bean = (AbstractBean) request.getAttribute("bean");	
%>
<%=bean.toXmlInit()%>
<%=bean.toXmlError()%>
<%=bean.toXml()%>
<%=bean.toXmlFin()%>