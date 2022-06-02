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
		elem: '#warp' //指定列表容器
			,
		done: function(page, next) { //到达临界点（默认滚动触发），触发下一页
			var lis = [];
			//以jQuery的Ajax请求为例，请求下一页数据（注意：page是从2开始返回）
			$.ajax({
				type: 'post',
				url: '/CampusForum/getLostPropertyByStatus',
				data: {
					page: page,
					limit: 30,
					status: '-1'
				},
				dataType: 'json',
				success: function(data, textStatus) {
					for (let i = 0; i < data.data.length; i++) {
						lis.push('        <div class="card">\n' +
							'            <div class="title"><a href="discuss.html"> ' +
							data.data[i].type + 'l</a></div>\n' +
							'            <div class="content"><span style="margin-right: 3%">丢失地点：' +
							data.data[i].address + '</span><span style="margin-right: 3%">联系方式'+data.data[i].contant+'</span><span style="margin-right: 3%">描述：'+data.data[i].description+'</span>\n' +
							'</div>\n' +
							'        </div>');
					}
					// var background_color=['#8063e1','#3f58e3','#2c6fd1','#352f64','#63e1b7'];
					// var background_image=['linear-gradient(135deg, #bd7be8, #8063e1)','linear-gradient(135deg, #7f94fc, #3f58e3)',
					//   'linear-gradient(135deg, #21bbfe, #2c6fd1)','linear-gradient(135deg, #415197, #352f64)','linear-gradient(135deg, #4e9666, #63e1a6)'];
					// var box_shadow=['20px 20px 60px rgba(34,50,84,0.5), 1px 1px 0px 1px #8063e1','20px 20px 60px rgba(34,50,84,0.5), 1px 1px 0px 1px #3f58e3',
					//   'linear-gradient(135deg, #21bbfe, #2c6fd1)','linear-gradient(135deg, #415197, #352f64)','linear-gradient(135deg, #4e9666, #63e1a6)'];
					// var z_index=[5,4,3,2,1];
					// var aLI=document.getElementsByClassName('card');
					// for(var i=0,l=aLI.length;i<l;i++){
					//   aLI[i].style.backgroundColor=background_color[i%5];
					//   aLI[i].style.backgroundImage=background_image[i%5];
					//   // aLI[i].style.box-shadow=box_shadow[i%5];
					//   // aLI[i].style.z-index=z_index[i%5];
					// }
					next(lis.join(''), page < data.pages);
				},
			})
		}
	});
});
