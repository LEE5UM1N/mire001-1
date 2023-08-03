<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	div#header{
		height:200px;
		width:100%;
		background:green;
	}
	div#content{
		width:100%;
		height:500px;
		overflow:hidden;
	}
	div#aside{
		width:25%;
		height:100%;
		background:blue;
		float:left;
	}
	div#section{
		width:75%;
		height:100%;
		background:orange;
		float:left;
	}
	div#footer{
		width:100%;
		height:150px;
		background:brown;
	}
	
</style>
</head>
<body>
	<div id="header">
		<h1>header</h1>
		<h1>message : ${message }</h1>
	</div>

	
	
	
	
	