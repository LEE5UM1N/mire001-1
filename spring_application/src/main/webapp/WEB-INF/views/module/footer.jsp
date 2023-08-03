<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>


  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
    <div class="p-3">
      <h5>Title</h5>
      <p>Sidebar content</p>
    </div>
  </aside>
  <!-- /.control-sidebar -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="float-right d-none d-sm-inline">
      Anything you want
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.
  </footer>
</div>
<!-- ./wrapper -->



<!-- jQuery -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/adminlte.min.js"></script>
<!-- common.js  -->
<script src="<%=request.getContextPath() %>/resources/js/common.js"></script>

<!-- handlebars  -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>
<script type="text/x-handlebars-template"  id="subMenu-list-template" >
{{#each .}}		
<li class="nav-item subMenu" >
	<a href="javascript:goPage('<%=request.getContextPath() %>{{murl}}','{{mcode}}');"	class="nav-link">
		<i class="{{micon}}"></i>
		<p>{{mname}}</p>
	</a>
</li>
{{/each}}
</script>

<script>
	var sub_func= Handlebars.compile($("#subMenu-list-template").html());
	
</script>


<script>
function subMenu_go(mCode){
	//alert(mCode);
	if(mCode=="M000000") {
		$('.subMenuList').html("");
		return;
	}
	
	$.ajax({
		url:"<%=request.getContextPath()%>/subMenu.do?mCode="+mCode,
		method:"get",
		success:function(data){
			//zconsole.log(data);		
			$('.subMenuList').html(sub_func(data));
		}
	});
}

function goPage(url,mCode){
	$('iframe[name="ifr"]').attr("src",url);
	
	//alert(mCode);
	 var renewURL = location.href;
    //현재 주소 중 .do 뒤 부분이 있다면 날려버린다.
    renewURL = renewURL.substring(0, renewURL.indexOf(".do")+3);
    
    if (mCode != 'M000000') {
        renewURL += "?mCode="+mCode;
    }
    //페이지를 리로드하지 않고 페이지 주소만 변경할 때 사용
    history.pushState(mCode, null, renewURL);
}

goPage('<%=request.getContextPath()%>${menu.murl}','${menu.mcode}');
subMenu_go('${menu.mcode}'.substring(0,3)+"0000");
</script>
</body>
</html>

