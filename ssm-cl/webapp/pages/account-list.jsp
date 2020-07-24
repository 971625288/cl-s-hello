<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>国家信息网站</title>
<!-- 通过相对路径引入css文件 -->
<!-- <link rel="stylesheet" href="../layui/css/layui.css"> -->
<!-- 通过绝对路径引入css文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<!--网站logo和导航栏  -->
		<jsp:include page="header.jsp"></jsp:include>
		
		<!-- 侧边菜单 -->
		<jsp:include page="sidebar.jsp"></jsp:include>
		
		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">
				<table id="accountList" lay-filter="demo"></table>
			</div>
		</div>
		
		<!-- 底部固定区域 -->
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
	<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
	
	<script type="text/html" id="toolbarDemo">
		  <div class="layui-btn-container">
    		<button class="layui-btn layui-btn-normal" lay-event="add">添加数据</button>
  		</div>
	</script>
	<script type="text/html" id="barDemo">
    		
    	<a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="detail">查看</a>
    	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>


	<script>
		layui.use(['table','form','element'], function(){
  		var table = layui.table;
  		var form = layui.form;
 		var $ =layui.jquery;
  		table.render({
    	elem: '#accountList'
    	,height:520
    	,width:1100
    	,url:'${pageContext.request.contextPath}/account/findAll'//数据接口
    	,toolbar: '#toolbarDemo' 
    	,method:'post'
    	,page:true
    	,title: '用户数据表'
    	,cols:[[
      			{field:'id', title:'编号', width:80, sort: true,fixed:'left'}
      			,{field:'username', title:'姓名', width:80}
      			,{field:'money', title:'金额', width:90}
      			,{field:'statusStr', title:'状态', width:90}
      			,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:180}
    		]]
  		});
  		table.on('toolbar(demo)',function(obj){
  			if(obj.event == 'add'){
  				layer.open({
  					type:1,
  					title :"添加用户信息",
  					area:['420px','300px'],
  					content:$("#accountAdd"),
  					shade:[0.8,'#393D49']
  				});
  				submitFormValue(obj);
  			}
  		});
  		
  		function submitFormValue(obj){
  			form.on('submit(demo12)',function(message){
  				$.ajax({
  					url:'${pageContext.request.contextPath}/account/save',
  					type:'post',
  					data:message.field,
  					success:function(data){
  						layer.alert(data);
  					}
  				});
  			});
  		}

  		table.on('tool(demo)',function(obj){
  			var data = obj.data;
  			var jsonData = JSON.stringify(data);
  			if(obj.event === 'detail'){
  				layer.alert(data.username +','+data.money);
  			}else if(obj.event === 'del'){
  				layer.confirm('确定删除用户信息吗？',function(index){
  					$.ajax({
  						url:'${pageContext.request.contextPath}/account/delete',
  						type:'post',
  						data:{id:data.id},
  						success:function(){
  							layer.alert(data.username+'删除成功！');
  						}
  					});
  				});
  			}
  			else if(obj.event === 'edit'){
  				layer.open({
  					type: 1,
  					title:'修改用户信息',
  					area:['420px','330px'],
  					content:$("#updateAccount"),
  					shade:[0.8,'#393D49'],
  					success:function(){
  						$("#account_id").val(data.id);
  						$("#account_name").val(data.username);
  						$("#account_money").val(data.money);
  					}
  				});
  				setFormValue(obj,data);
  			}
  		});
  		function setFormValue(obj,data){
  			form.on('submit(demo11)',function(message){
  				$.ajax({
  					url:'${pageContext.request.contextPath}/account/update',
  					async:false,
  					type:'post',
  					data:message.field,
  					dataType:"json",
  					success:function(data) {
  						layer.msg(data);
  					}
  				});
  			});
  		}
	});
	</script>
	<div class="layui-row" id="updateAccount" style="display:none;">
		<div class="layui-col-md10">
			<form class="layui-form layui-form-pane" action="" method="post" style="margin-top:20px">
				<div class="layui-form-item">
					<label class="layui-form-label">编号</label>
					<div class="layui-input-block">
						<input type="text" name="id" id="account_id" readonly class="layui-input"/>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-block">
						<input type="text" name="username" id="account_name"  lay-verify="required" autoconplement="off" placeholder="请输入姓名" class="layui-input"/>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">金额</label>
					<div class="layui-input-block">
						<input type="text" name="money" id="account_money"  lay-verify="required" autoconplement="off" placeholder="请输入金额" class="layui-input"/>
					</div>
				</div>
				<div class="layui-form-item" style="margin-top:40px">
					<div class="layui-input-block">
						<button class="layui-btn layui-btn-submit" lay-submit="" lay-filter="demo11">确认修改</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
					
				</div>
			</form>
		</div>
		
		
	</div>
	<div class="layui-row" id="accountAdd" style="display:none;">
		<div>
			<form class="layui-form layui-form-pane" action="" method="post" style="margin-top:20px">
				<div class="layui-form-item">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-block">
						<input type="text" name="username" lay-verify="required" autoconplement="off" placeholder="请输入姓名" class="layui-input"/>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">金额</label>
					<div class="layui-input-block">
						<input type="text" name="money"  lay-verify="required" autoconplement="off" placeholder="请输入金额" class="layui-input"/>
					</div>
				</div>
				<div class="layui-form-item" style="margin-top:40px">
					<div class="layui-input-block">
						<button class="layui-btn layui-btn-submit" lay-submit="" lay-filter="demo12">提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
					
				</div>
			</form>
		</div>
		
		
	</div>

</body>
</html>