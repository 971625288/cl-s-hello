<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

	<div class="layui-side layui-bg-black">
		<div class="layui-side-scroll">
			<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
			<ul class="layui-nav layui-nav-tree" lay-filter="test">
				<li class="layui-nav-item layui-nav-itemed">
				<a class="" href="javascript:;">用户列表</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="${pageContext.request.contextPath}/account/list">用户信息</a>
						</dd>
					</dl>
				</li>
				<li class="layui-nav-item layui-nav-itemed"><a href="javascript:;">用户管理</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="javascript:;">用户管理</a>
						</dd>
						<dd>
							<a href="javascript:;">角色管理</a>
						</dd>
						<dd>
							<a href="javascript:;">邮箱管理</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">云市场</a></li>
				<li class="layui-nav-item"><a href="">发布商品</a></li>
			</ul>
		</div>
	</div>
