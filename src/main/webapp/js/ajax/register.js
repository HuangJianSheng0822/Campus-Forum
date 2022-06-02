/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
$("#btnSendCode").on("click", function() {
	let email = $("#email").val();
	//判断合法性

	//请求验证码

	$.ajax({

		type: 'post',
		url: '/CampusForum/sendEmail',
		dataType: 'json',
		data: {
			id: email
		},
		success: function(data) {
			alert(data.data[0])
		},
		errors: function(XMLHttpRequest, textStatus, errorThrown) {
			alert('error')
		}
	})
})


$("#btnSubmit").on("click", function() {
	let email = $("#email").val();
	let key = $("#key").val();
	let pwd = $("#pwd").val();
	let repwd = $("#repwd").val();
	let school = $("#school").val();
	//判断合法性

	$.ajax({
		type: 'post',
		url: '/CampusForum/userRegister',
		dataType: 'json',
		data: {
			id: email,
			key: key,
			pwd: pwd,
			school: school
		},
		success: function(data) {
			alert(data.data[0])
		},
		errors: function(XMLHttpRequest, textStatus, errorThrown) {
			alert('error')
		}
	})
})
