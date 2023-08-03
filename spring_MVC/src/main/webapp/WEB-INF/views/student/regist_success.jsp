<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<script>

alert("${command.id}님 가입을 환영합니다.");
location.href="<%=request.getContextPath()%>/student/regist";
	

</script>