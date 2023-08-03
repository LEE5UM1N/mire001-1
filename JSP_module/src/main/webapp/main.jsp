<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<% pageContext.setAttribute("message", "맛점하셨나요?"); %>

<%@ include file="./header.jsp" %>
	<h1>${message }</h1>
	<div id="content">
		<jsp:include page="./aside.jsp" />
		<jsp:include page="./section.jsp" />
	</div>
<jsp:include page="./footer.jsp" />

