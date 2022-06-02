/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
layui.use(['form'], function() {
	var form = layui.form,
		layer = layui.layer;

	// 登录过期的时候，跳出ifram框架
	if (top.location != self.location) top.location = self.location;

	// 粒子线条背景
	$(document).ready(function() {
		$('.layui-container').particleground({
			dotColor: '#7ec7fd',
			lineColor: '#7ec7fd'
		});
	});

	// 进行登录操作
	form.on('submit(login)', function(data) {
		data = data.field;
		if (data.username == '') {
			layer.msg('用户名不能为空');
			return false;
		}
		if (data.password == '') {
			layer.msg('密码不能为空');
			return false;
		}
		if (data.school == '') {
			layer.msg('学校不能为空');
			return false;
		}
		layer.msg('登录中！！！', function() {
			window.location = '../index.html';
		});
		return true;
	});
});
