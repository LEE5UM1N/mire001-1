<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<%! private String id ="mimi";
	private String pwd="mimi";
	
	public void setId(String id){
		this.id=id;
	}
	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>아이디 : <%=id %></h1>
	<h1>패스워드 : <%=pwd %></h1>

<%
	setId(request.getParameter("id"));
	setPwd(request.getParameter("pwd"));
%>

	<h1>아이디 : <%=id %></h1>
	<h1>패스워드 : <%=pwd %></h1>
</body>
</html>









