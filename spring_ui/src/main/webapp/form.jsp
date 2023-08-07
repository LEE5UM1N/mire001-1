<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Starter</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome Icons -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
  <!-- iCheck for checkboxes and radio inputs -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/plugins/icheck-bootstrap/icheck-bootstrap.min.css">

<!-- Theme style -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/dist/css/adminlte.min.css">


</head>
<body>
<div class="card card-primary card-outline">
	<div class="card-header " >
		<h3 class="card-title">
			<input type="range" class="custom-range custom-range-success"  onchange="slider_change(this);"
				   min="0" max="100" step="5" data-in />
		</h3>
		<div class="card-tools">
			<input type="checkbox" name="my-checkbox" checked data-bootstrap-switch data-off-color="danger" data-on-color="success">
		</div>
	</div>
	<div class="card-body">
		<div data-output>
		</div>
		<h1>
			설정온도 : <span set-temp>0</span><br/>
			현재온도 : <span cur-temp>0</span>
		</h1>
	</div>
</div>


<!-- jQuery -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Bootstrap Switch -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/adminlte.min.js"></script>


<script>
var data = {"output" : "10"}
$('input[data-in]').val(data.output);

function slider_change(el){
	data.output=el.value;
}


let dataInterv;

$("input[data-bootstrap-switch]").each(function(){
    $(this).bootstrapSwitch({
    	"state":false,
    	"onSwitchChange":function(){
    		if($(this).is(":checked")){
    			dataInterv = setInterval(div_data_output,1000);
    		}else{
    			clearInterval(dataInterv);
    			dataInterv=null;
    			$("div[data-output]").html("에어컨이 꺼졌습니다.");
    		}
    	}
    });
});



function div_data_output(){
	
	$.ajax({
		url:"<%=request.getContextPath()%>/data/send",
		method:"post",
		data:JSON.stringify(data),
		contentType:"application/json",
		success:function(serverData){
			if(serverData == data.output){
				$("div[data-output]").html("에어컨이 켜졌습니다.");
				$("span[set-temp]").text(serverData);
			}
		}
		
	});
}

let receiveInterv = setInterval(receive_temp,1000);
function receive_temp(){
	$.ajax({
		url:"<%=request.getContextPath()%>/data/receive?key=temp",
		method:"get",
		success:function(temp){
			$('span[cur-temp]').text(temp);
		}
	});
}
</script>

</body>
</html>






