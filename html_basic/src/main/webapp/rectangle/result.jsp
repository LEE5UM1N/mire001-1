<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<%
	String width=(String)request.getAttribute("width");
	String height=(String)request.getAttribute("height");
	Map<String,String> margin 
			= (Map<String,String>)request.getAttribute("margin");
	Map<String,String> padding
			= (Map<String,String>)request.getAttribute("padding");
	String content = (String)request.getAttribute("content");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div#rectangle{
		width:<%=width %>px;
		height:<%=height %>px;
		margin:<%=margin.get("top")%>px <%=" "+margin.get("right")%>px 
			   <%=" "+margin.get("bottom")%>px <%=" "+margin.get("left")%>px;
		padding:<%=" "+padding.get("top")%>px <%=" "+padding.get("right")%>px 
			   <%=" "+padding.get("bottom")%>px <%=" "+padding.get("left")%>px;
		background:green;
	}
</style>

</head>
<body>
	<div id="rectangle"><%=content %></div>
</body>
</html>



