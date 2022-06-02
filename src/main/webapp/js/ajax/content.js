/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
$.ajax({
	type: 'post',
	url: '/CampusForum/getActionById',
	data: {
		conId: localStorage.getItem("conId")
	},
	dataType: 'json',
	success: function(data, textStatus) {
		$('#conId').text(data.data[0].conId);
		$('#beginTime').text(data.data[0].beginTime);
		$('#userId').text(data.data[0].userId);
		$('#kind').text(data.data[0].kind);
		$('#description').text(data.data[0].description);
		$('#address').text(data.data[0].userAddress);
		$('#expectedTime').text(data.data[0].expectedTime);
		$('#money').text(data.data[0].money);
	},
	error: function(XMLHttpRequest, textStatus, errorThrown) {
		console.log(errorThrown)
	}
})

$.ajax({
	type: "POST",
	url: "/CampusForum/updateAction",
	dataType: 'json',
	data: {
		conId: localStorage.getItem("conId"),
		kind: 'or'
	},
	success: function(data, textStatus) {
		layui.use('layer', function() {
			var layer = layui.layer;
			layer.msg(data.data[0]);
		});
	},
	errors: function(XMLHttpRequest, textStatus, errorThrown) {
		alert('失败')
	}
})
