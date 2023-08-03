<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리다이렉트 페이지 입니다.</h1>
	
	<script>
	   if("${message}"){
			alert("${message}");
	   }
	</script>
</body>
</html>



