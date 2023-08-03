<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rectangle Data Sheet</title>
<style>
	body > h1 {
		text-align:center;
	}
	form > table {
		width:70%;
		min-width:500px;
		max-width:700px;
		
		margin : 0 auto;
		 
		border:1px solid #555;
		border-collapse:collapse;
	}
	form > table th, form > table td{
		border:1px solid #555;
		text-align:center;
		padding:5px;
	}
	
	
	form > table th:nth-child(1){
		background:#eee;
	}
	form > table th:nth-child(2){
		width:15%;
	}
	form > table th:nth-child(3){
		width:15%;
	}
	form > table th:nth-child(4){
		width:15%;
	}
	form > table th:nth-child(5){
		width:15%;
	}
	
	form > table tr:last-child{
		height:50px;
	}
	
	input{
		width: 70%;
	}
	textarea{
		width:90%;
		height:100%;
	}
	
	input[type="submit"]{
		display:block;
	
		width:70%;
		min-width:500px;
		max-width:700px;
		
		margin:0 auto;
	}
</style>

</head>
<body>
	<h1 id="title">Rectangle Data Sheet</h1>
	<hr />
	<form action="rectangle" method="post">

		<table>
			<tr>
				<th rowspan="2">크 기</th>
				<th colspan="2">너 비</th>
				<th colspan="2">높 이</th>
			</tr>
			<tr>
				<td colspan="2">
					<input type="text" name="width" />
				</td>
				<td colspan="2">
					<input type="text" name="height" />
				</td>
			</tr>
			<tr>
				<th rowspan="2" >여 백</th>
				<th style="width:15% ;">위</th>
				<th style="width:15% ;">아래</th>
				<th style="width:15% ;">좌</th>
				<th style="width:15% ;">우</th>
			</tr>
			<tr>
				<td>
					<input type="text" name="margin.top" />
				</td>
				<td>
					<input type="text" name="margin.bottom" />
				</td>
				<td>
					<input type="text" name="margin.left" />
				</td>
				<td>
					<input type="text" name="margin.right" />
				</td>
			</tr>
			<tr>
				<th rowspan="2">패 딩</th>
				<th >위</th>
				<th >아래</th>
				<th >좌</th>
				<th >우</th>
			</tr>
			<tr>
				<td>
					<input type="text" name="padding.top" />
				</td>
				<td>
					<input type="text" name="padding.bottom" />
				</td>
				<td>
					<input type="text" name="padding.left" />
				</td>
				<td>
					<input type="text" name="padding.right" />
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="4">
					<textArea name="content"></textArea>
				</td>
			</tr>
			
		</table>
		<br/>
		<input type="submit" value="전송" />
	</form>
</body>
</html>





