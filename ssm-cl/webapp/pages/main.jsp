<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>后台大布局</title>
<link rel="stylesheet" href="../layui/css/layui.css">
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"> --%>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<!--网站logo和导航栏  -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- 侧边菜单 -->
		<jsp:include page="sidebar.jsp"></jsp:include>
		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">用户列表信息</div>
		</div>
		<!-- 底部固定区域 -->
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
	<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
</body>
</html>