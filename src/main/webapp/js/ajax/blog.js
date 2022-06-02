/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
let parse = JSON.parse(localStorage.getItem("data"));
let id = parse.conId;
$('#content').html(parse.content);
$('#author').text(parse.title);
$.ajax({
	type: 'post',
	url: '/CampusForum/getCommentById',
	dataType: 'json',
	data: {
		id: id
	},
	success: function(data, textStatus) {
		let userData = eval(data);
		let newData = userData.data;
		let li = "";
		for (let i = 0; i < newData.length; i++) {
			li += '<li class="gitment-comment">' +
				'<a class="gitment-comment-avatar"><img class="gitment-comment-avatar-img" src=""></a>' +
				'<div class="gitment-comment-main">' +
				'<div class="gitment-comment-header">' +
				'<a class="gitment-comment-name">' + newData[i].userId + '</a>' +
				'<span></span></div>' +
				'<div class="gitment-comment-body gitment-markdown"><p>' +
				newData[i].userComment + '</p></div></div></li>'
		};
		$("#demo").html(li)
		var aCol = ['../images/user1.png', '../images/user2.png',
			'../images/user3.png', '../images/user4.png',
			'../images/user5.png'
		];
		var aLI = document.getElementsByTagName('img');
		for (var i = 0, l = aLI.length; i < l; i++) {
			aLI[i].src = aCol[i % 5];
		}
	},
	error: function() {
		console.log('加载失败')
	}
})

$("#sub").on("click", function() {
	$.ajax({
		type: "get",
		url: "/CampusForum/hasLogin",
		dataType: 'json',
		success: function(data, textStatus) {
			if (data.data[0] != null) {
				$.ajax({
					type: 'post',
					url: '/CampusForum/admin/addComment',
					dataType: 'json',
					data: {
						conId: id,
						userComment: $('#userComment').val()
					},
					success: function(data, textStatus) {
						window.history.go(0)
					},
					error: function(XMLHttpRequest, textStatus, errorThrown) {
						console.log(errorThrown)
					}
				})
			} else {
				alert('请登录')
			}
		},
		errors: function(XMLHttpRequest, textStatus, errorThrown) {
			alert('失败')
		}
	})
});
