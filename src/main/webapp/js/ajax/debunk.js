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
				url: '/CampusForum/getBlog',
				data: {
					page: page
				},
				dataType: 'json',
				success: function(data, textStatus) {
					for (let i = 0; i < data.data.length; i++) {
						lis.push(
							'<a href="blog.html" class="card"> <span class="num" hidden>' +
							i + '</span><div>\n' +
							'        <img src="' + data.data[i].image +
							'" class="images"/>\n' +
							'        <div class="con" id="t1"><h2>作者：' + data.data[i].userId +
							'</h2></div>\n' +
							'        <div class="con" id="t2" <h1>时间：' + data.data[i].date +
							'</h1></div>\n' +
							'    </div>\n' +
							'    <hr> </a>');
					}
					next(lis.join(''), page < data.pages);
					$(".card").on("click", function() {
						let val = $(this).find(".num").text();
						localStorage.setItem("data", JSON.stringify(data.data[
							val]));
					})
				},
			})
		}
	});
});
