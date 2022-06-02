/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

layui.config({
	base: '../extend/' //配置 layui 第三方扩展组件存放的基础目录
}).extend({
	cardTable: 'cardTable/cardTable'
}).use(['table', 'layer', 'form', 'jquery', 'cardTable'], function() {
	let table = layui.table;
	let form = layui.form;
	let $ = layui.jquery;
	let layer = layui.layer;
	let cardTable = layui.cardTable;
	cardTable.render({
		elem: '#currentTableId',
		//此为动态
		url: '/CampusForum/getLostProperty',
	})
	// 监听搜索操作
	form.on('submit(data-search-btn)', function(data) {
		queryJson = data.field;
		cardTable.reload("currentTableId", {
			where: queryJson,
		});
		return false;
	});
	form.on('submit(data-checked-btn)', function() {
		var data = cardTable.getChecked("currentTableId");
		layer.msg(JSON.stringify(data));
		return false;
	});
	form.on('submit(data-btn)', function() {
		var data = cardTable.getAllData("currentTableId");
		layer.msg(JSON.stringify(data));
		return false;
	});
})
