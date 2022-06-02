/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
$.ajax({
	type: 'post',
	url: '/CampusForum/getAction',
	data: {
		page: 0,
		limit: 100
	},
	dataType: 'json',
	success: function(data, textStatus) {
		let li = "";
		for (let i = 0; i < data.data.length; i++) {
			li +=
				'    <div class="am-g am-intro-bd">\n' +
				'        <a href="content.html" class="content">\n' +
				'            <div class="am-intro-left am-u-sm-3"><img src="../images/boy.png"/></div>\n' +
				'            <div class="am-intro-right am-u-sm-9">\n' +
				'                <div class="text">\n' +
				'                    <span style="float: left;color: black;font-size: 16px"><i>' + data
				.data[i].userName + '</i></span>\n' +
				'                    <span class="fr black" style="margin-right: 2%"><i>待接单</i></span>\n' +
				'                    <span class="fr green" style="margin-right: 5%">' + data.data[i]
				.kind + '</span>\n' +
				'                    <span class="fr blue conId" style="margin-right: 5%;" >' + data.data[
					i].conId + '</span>\n' +
				'                </div>\n' +
				'                <p>' + data.data[i].description + '</p>\n' +
				'                <div class="text">\n' +
				'                    <span class="fr"><i>赚</i><i class="price">' + data.data[i].money +
				'</i><i>元</i></span>\n' +
				'                </div>\n' +
				'            </div>\n' +
				'        </a>\n' +
				'    </div>'
		}
		$('#normal').html(li);

		$(".content").on("click", function() {
			var l = $(this).find(".conId").text()
			localStorage.setItem("conId", l)

		})
	},
	error: function(XMLHttpRequest, textStatus, errorThrown) {
		console.log(errorThrown)
	}
})
