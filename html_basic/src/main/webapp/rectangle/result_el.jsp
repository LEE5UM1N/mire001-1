<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div#rectangle{
		width:${width}px;
		height:${height}px;
		margin:${margin.top}px ${margin.right}px ${margin.bottom}px ${margin.left}px;
		padding:${padding.top}px ${padding.right}px ${padding.bottom}px ${padding.left}px;
		background:green;
	}
</style>

</head>
<body>
	<h1>EL</h1>
	<div id="rectangle">${content }</div>
</body>
</html>



