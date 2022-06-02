/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

var num = 1;
if (num == 1) {
	change(num)
}
$('#right').on('click', function() {
	num++;
	change(num);
})
$('#left').on('click', function() {
	if (num > 1) {
		num--;
		change(num);
	}
})

function change(num) {
	$.ajax({
		type: "get",
		url: "/CampusForum/getLoveByTime",
		dataType: 'json',
		data: {
			page: num,
			limit: 20
		},
		success: function(data, textStatus) {
			var li = "";
			for (let i in data.data) {
				li = li + "<li><span> " + data.data[i].userId + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
					data.data[i].date + "</span><p>" + data.data[i].description +
					"</p><span hidden class='loveId'>" + data.data[i].loveId + "</span></li>"
			}

			$('.list').html(li);

			var aCol = ['#41a2b7', '#2a5d9a', '#e66a70', '#11a541'];
			var aLI = document.getElementsByTagName('li');
			for (var i = 0, l = aLI.length; i < l; i++) {
				aLI[i].style.backgroundColor = aCol[i % 4];
			}


			$(".con").on("click", function() {
				var l = $(this).find(".loveId").text()
				localStorage.setItem("loveId", l)
			})
		},
		errors: function(XMLHttpRequest, textStatus, errorThrown) {
			alert('失败')
		}
	})
}


window.onload = function() {
	function stopPropagation(e) {
		window.event ? window.event.cancelBubble = true : e.stopPropagation();
	}
}
