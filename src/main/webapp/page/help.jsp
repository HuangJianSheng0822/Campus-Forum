<%--
  Created by IntelliJ IDEA.
  User: 黄建胜
  Date: 26/1/2022
  Time: 下午1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
    <script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
    <link href="../extend/cardTable/cardtable.css">
</head>
<body>
<table id="currentTableId"></table>
<script>
    layui.config({
        base: '../extend/' //配置 layui 第三方扩展组件存放的基础目录
    }).extend({
        cardTable: 'cardTable/cardTable'
    }).use(['table','layer', 'form', 'jquery', 'cardTable'], function () {
        let table = layui.table;
        let form = layui.form;
        let $ = layui.jquery;
        let layer = layui.layer;
        let cardTable = layui.cardTable;

        cardTable.render({
            elem: '#currentTableId',
            //此为动态
            url: '/CampusForum/getRewardMoneyByKind?kind=2',
        })
        // 监听搜索操作
        form.on('submit(data-search-btn)', function (data) {
            queryJson = data.field;
            cardTable.reload("currentTableId", {
                where: queryJson,
            });
            return false;
        });
        form.on('submit(data-checked-btn)', function () {
            var data = cardTable.getChecked("currentTableId");
            layer.msg(JSON.stringify(data));
            return false;
        });
        form.on('submit(data-btn)', function () {
            var data = cardTable.getAllData("currentTableId");
            layer.msg(JSON.stringify(data));
            return false;
        });
    })


</script>
</body>
</html>

