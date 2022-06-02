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
		elem: '#list', //指定列表容器

		done: function(page, next) { //到达临界点（默认滚动触发），触发下一页
			var lis = [];
			//以jQuery的Ajax请求为例，请求下一页数据（注意：page是从2开始返回）
			$.ajax({
				type: 'get',
				url: '/CampusForum/getRevert',
				data: {
					page: page
				},
				dataType: 'json',
				success: function(data, textStatus) {
					for (let i = 0; i < data.data.length; i++) {
						lis.push(
							'<a href="" class="card"> <span class="num" hidden>' +
							i + '</span><div>\n' +
							'        <img style="height: 130px" src="' + data.data[
								i].image +
							'" class="images"/>\n' +
							' <div id="l1">       <div class="con">类型：' + data.data[i].type +
							'</div>\n' +
							'        <div class="con">拾取时间：' + data.data[i]
							.pickupTime + '</div>\n' +
							'        <div class="con">拾取地址：' + data.data[i]
							.address + '</div>\n' +
							'        <div class="con">联系方式：' + data.data[i]
							.contant + '</div>\n' +
							'        <div class="con">描述：' + data.data[i]
							.description + '</div></div>\n' +
							'    </div>\n' +
							'    <hr> </a>');
					}
					next(lis.join(''), page < data.pages);
				},
			})
		}
	});
});
