/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
layui.use('flow', function() {
	var $ = layui.jquery; //不用额外加载jQuery，flow模块本身是有依赖jQuery的，直接用即可。
	var flow = layui.flow;
	flow.load({
		elem: '#list' //指定列表容器
			,
		done: function(page, next) { //到达临界点（默认滚动触发），触发下一页
			var lis = [];
			//以jQuery的Ajax请求为例，请求下一页数据（注意：page是从2开始返回）
			$.ajax({
				type: 'get',
				url: '/CampusForum/getCommentById',
				data: {
					id: localStorage.getItem("loveId")
				},
				dataType: 'json',
				success: function(data, textStatus) {
					for (let i = 0; i < data.data.length; i++) {
						lis.push(
							'<li>\n' +
							'<span> 匿名消息&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2017-10-09  18:58:37</span>\n' +
							'<p>表白我自己，一级棒！</p>\n' +
							'</li>'
						);
					}
					next(lis.join(''), page < data.pages);
				},
			})
		}
	});
});
