<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Controller PAD</title>
<
  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/dist/css/adminlte.min.css">
  
  <style>
  	.digit{
  		font-family:ds-digital;
  		font-weight:bold;
  	}
  	.digit-h1{
  		font-size:70px;
  	}
  	.digit-h2{
  		font-size:50px;
  	}
  	.digit-h3{
  		font-size:30px;
  	}
  	.digit-red{
  		color:red;
  	}
  	.digit-green{
  		color:green;
  	}
  	.digit-yellow{
  		color:yellow;
  	}
  	.digit-white{
  		color:white;
  	}
  
  </style>
  
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
<aside class="main-sidebar sidebar-dark-primary">
    
    
    <span class="brand-link">
      <span class="brand-text font-weight-light ">Control PAD</span>
    </span>
    
     <div class="card card-outline bg-gray" >
     <div class="card-header">
       <h3 class="card-title">
         <i class="fa fa-desktop"></i>
          &nbsp;&nbsp;<span>Send DATA</span>
       </h3>
       <div class="card-tools">
       		<input type="checkbox" name="my-checkbox" controller-main device-name="send" checked data-bootstrap-switch data-off-color="danger" data-on-color="success" ">
       </div>
     </div>
   </div><!-- /.card -->
   
   <div class="card card-outline bg-gray" >
     <div class="card-header">
       <h3 class="card-title">
         <i class="far fa-lightbulb"></i>
          &nbsp;&nbsp;<span>조명</span>
       </h3>
       <div class="card-tools">
       		<input type="checkbox" name="my-checkbox" controller-item device-name="light" checked data-bootstrap-switch data-off-color="danger" data-on-color="success" ">
       </div>
     </div>
     <!-- /.card-header -->
     <div class="card-body bg-gray">
     	<div class="form-group">
     	  <div class="input-group">
          	<label for="light_slider" class="btn btn-success">설정조도</label> <input type="text" light-data class="form-control bg-gray" readonly style="font-family:ds-digital;font-size:30px;color:yellow;font-weight:bold;"/>
          </div>
          <input type="range" class="custom-range" id="light_slider"  min="0" max="100" step="5" onchange="light_slider(this);"/>
        </div>
     </div> <!-- /.card-body -->
   </div><!-- /.card -->
   
   <div class="card card-outline bg-gray" >
     <div class="card-header">
       <h3 class="card-title">
         <i class="fa fa-temperature-high"></i>
          &nbsp;&nbsp;<span>에어컨</span>
       </h3>
       <div class="card-tools">
       		<input type="checkbox" name="my-checkbox" controller-item device-name="aircon" checked data-bootstrap-switch data-off-color="danger" data-on-color="success" ">
       </div>
     </div>
     <!-- /.card-header -->
     <div class="card-body bg-gray">
     	<div class="form-group">
     	  <div class="input-group">
          	<label for="aircon_slider" class="btn btn-success">설정온도</label> <input type="text" aircon-data class="form-control bg-gray" readonly style="font-family:ds-digital;font-size:30px;color:yellow;font-weight:bold;"/>
          </div>
          <input type="range" class="custom-range" id="aircon_slider"  min="0" max="100" step="5" onchange="aircon_slider(this);"/>
        </div>
     </div> <!-- /.card-body -->
   </div><!-- /.card -->
   <div class="card card-outline bg-gray" >
     <div class="card-header">
       <h3 class="card-title">
         <i class="fa fa-fan"></i>
          &nbsp;&nbsp;<span>FAN</span>
       </h3>
       <div class="card-tools">
       		<input type="checkbox" name="my-checkbox" controller-item device-name="fan" checked data-bootstrap-switch data-off-color="danger" data-on-color="success" ">
       </div>
     </div>
     <!-- /.card-header -->
     <div class="card-body bg-gray">
     	<div class="form-group">
     	  <div class="input-group">
          	<label for="fan_slider" class="btn btn-success">설정세기</label> <input type="text" fan-data class="form-control bg-gray" readonly style="font-family:ds-digital;font-size:30px;color:yellow;font-weight:bold;"/>
          </div>
          <input type="range" class="custom-range" id="fan_slider"  min="0" max="100" step="5" onchange="fan_slider(this);"/>
        </div>
     </div> <!-- /.card-body -->
   </div><!-- /.card -->
  </aside>	
<div class="content-wrapper" style="background:#111;">
	
	<section class="content-header" style="padding:0;">
		<div class="container-fluid" style="padding:0;">
			 <nav class="navbar navbar-expand navbar-dark">
			    <!-- Left navbar links -->
			    <ul class="navbar-nav">
			      <li class="nav-item d-none d-sm-inline-block">
			        <a href="#" class="nav-link">Dash Board</a>
			      </li>
			      <li class="nav-item d-none d-sm-inline-block">
			        <a href="#" class="nav-link">조명</a>
			      </li>
			      <li class="nav-item d-none d-sm-inline-block">
			        <a href="#" class="nav-link">에어컨</a>
			      </li>
			      <li class="nav-item d-none d-sm-inline-block">
			        <a href="#" class="nav-link">FAN</a>
			      </li>
			      
			    </ul>
		    </nav>
		</div>
	</section>
	<section class="content">
		<!-- light monitor -->
		<div class="row">
			<div class="card card-primary card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-white">
					<i class="far fa-lightbulb"></i>&nbsp;&nbsp;<i class="far fa-lightbulb"></i>
					
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-warning card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-yellow">
					<span>SET : </span><span set-light-data>40</span><span class="digit-h3">LM</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-danger card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-red">
					<span>CUR : </span><span cur-light-data>40</span><span class="digit-h3">LM</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-success card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-green">
					<span>RECO : </span><span reco-light-data>30</span><span class="digit-h3">LM</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
		</div>
		
		<!-- aircon monitor -->
		<div class="row">
			<div class="card card-primary card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-white">
					<i class="fa fa-temperature-high"></i>&nbsp;<i class="fa fa-temperature-low"></i>
					
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-warning card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-yellow">
					<span>SET : </span><span set-aircon-data>40</span><span class="digit-h3">℃</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-danger card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-red">
					<span>CUR : </span><span cur-aircon-data>40</span><span class="digit-h3">℃</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-success card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-green">
					<span>RECO : </span><span reco-aircon-data>30</span><span class="digit-h3">℃</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
		</div>
		
		<!-- fan monitor -->
		<div class="row">
			<div class="card card-primary card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-white">
					<i class="fa fa-fan"></i>&nbsp;&nbsp;<i class="fa fa-fan"></i>
					
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-warning card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-yellow">
					<span>SET : </span><span set-fan-data>40</span><span class="digit-h3">m/s</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-danger card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-red">
					<span>CUR : </span><span cur-fan-data>40</span><span class="digit-h3">m/s</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
			<div class="card card-success card-outline col-sm-3 bg-black">
				<div class="card-header"></div>
				<div class="card-body text-center">
				  <div class="digit digit-h1 digit-green">
					<span>RECO : </span><span reco-fan-data>30</span><span class="digit-h3">m/s</span>
				  </div>
				</div>
				<div class="card-footer"></div>
			</div>
		</div>
	
	</section>
</div>





</div> <!-- wrapper.end -->

<!-- jQuery -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Bootstrap Switch -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/adminlte.min.js"></script>

<script>
// power date
var power={
	light:20,
	aircon:50,
	fan:60
}

$(function(){
	init();
	
	$("input[data-bootstrap-switch]").each(function(){
	    $(this).bootstrapSwitch('onSwitchChange',function(event){
	    	let device = $(this).attr("device-name");
	    	let state = $(this).is(":checked")
	    	switch(device){
	    	case "light":
	    		Controller.light(state);
	    		break;
	    	case "aircon":
	    		Controller.aircon(state);
	    		break;
	    	case "fan" :
	    		Controller.fan(state);
	    		break;
	    	case "send":
	    		Controller.send(state);
	    		break;
	    	}
	    });
	});
});

function init(){
	$('input#light_slider').val(power.light);
	$('input[light-data]').val(power.light);
	$('span[set-light-data]').text(power.light);
	
	$('input#aircon_slider').val(power.aircon);
	$('input[aircon-data]').val(power.aircon);
	$('span[set-aircon-data]').text(power.aircon);
	
	$('input#fan_slider').val(power.fan);
	$('input[fan-data]').val(power.fan);
	$('span[set-fan-data]').text(power.fan);
	
	
}

function light_slider(el){
	power.light=el.value;
	init();
}
function aircon_slider(el){
	power.aircon=el.value;
	init();
}
function fan_slider(el){
	power.fan=el.value;
	init();
}

let ligthInterv = setInterval(lightGo,3000);
let airconInterv = setInterval(airconGo,3000);
let fanInterv = setInterval(fanGo,3000);

function lightGo(){
	let cal_light =Number($('span[cur-light-data]').text());
	cal_light+=parseInt((power.light-cal_light)*0.5);
	$('span[cur-light-data]').text(cal_light);
}
function airconGo(){
	let cal_aircon = Number($('span[cur-aircon-data]').text());
	cal_aircon+=parseInt((power.aircon-cal_aircon)*0.5);
	$('span[cur-aircon-data]').text(cal_aircon);
}
function fanGo(){
	let cal_fan = Number($('span[cur-fan-data]').text());
	cal_fan+=parseInt((power.fan-cal_fan)*0.5);
	$('span[cur-fan-data]').text(cal_fan);
}

var Controller={ 
		'light':function(state){
			if(state){
				ligthInterv = setInterval(lightGo,3000);
				$('input#light_slider').prop("disabled",false);
				$('label[for="light_slider"]').removeClass("btn-danger").addClass("btn-success");
			}else{
				clearInterval(ligthInterv);
				$('input#light_slider').prop("disabled",true);
				$('label[for="light_slider"]').removeClass("btn-warnign").addClass("btn-danger");
			}
		},
		'aircon':function(state){
			if(state){
				airconInterv = setInterval(airconGo,3000);
				$('input#aircon_slider').prop("disabled",false);
				$('label[for="aircon_slider"]').removeClass("btn-danger").addClass("btn-success");
			}else{
				clearInterval(airconInterv);
				$('input#aircon_slider').prop("disabled",true);
				$('label[for="aircon_slider"]').removeClass("btn-warnign").addClass("btn-danger");
			}
			
		},
		'fan':function(state){
			if(state){
				fanInterv = setInterval(fanGo,3000);
				$('input#fan_slider').prop("disabled",false);
				$('label[for="fan_slider"]').removeClass("btn-danger").addClass("btn-success");
			}else{
				clearInterval(fanInterv);
				$('input#fan_slider').prop("disabled",true);
				$('label[for="fan_slider"]').removeClass("btn-warnign").addClass("btn-danger");
			}
		},
		'send':function(state){
			$("input[controller-item]").each(function(){
			    $(this).bootstrapSwitch('state',state);
			});
			if(state){
				
			}else{
				
			}
		}
}

function sendData(){
	console.log("light:"+power.light+", aircon:"+power.aircon+", fan:"+power.fan);
	
	
	
}

setInterval(sendData,3000);

</script>
  
</body>
</html>