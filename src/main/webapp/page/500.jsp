<%--
  ~ Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
  ~ Vestibulum commodo. Ut rhoncus gravida arcu.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: 32551
  Date: 2022/3/17
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true"%>
<html>
<head>
    <title>500</title>
    <link rel="stylesheet" type="text/css" href="../css/error/dmaku.css" />
</head>
<body>
<div class="missing fh wh">
    <div class="error  ">
        <div class="error_left"><img src="../images/error_red.gif" style="float: left;"></div>
        <div class="error_right">

            <h1>上传参数异常，请检查参数填写是否正确，图片是否选择！！！！</h1>
            <div class="input-container" style="font: 13px 'TeXGyreScholaRegular', Arial, sans-serif;color: #696969; text-shadow: 0 1px white;text-decoration: none;">
                <span id="totalSecond" style="color:red">5</span>秒后自动跳转到首页…
            </div>

        </div>
    </div>
</div>

</body>
<!--定义js变量及方法-->
<script language="javascript" type="text/javascript">
    var second = document.getElementById('totalSecond').textContent;


    if (navigator.appName.indexOf("Explorer") > -1)
    {
        second = document.getElementById('totalSecond').innerText;
    } else
    {
        second = document.getElementById('totalSecond').textContent;
    }
    setInterval("redirect()", 1000);
    function redirect()
    {
        if (second < 0)
        {
            <!--定义倒计时后跳转页面-->
            location.href = '../index.html';
        } else
        {
            if (navigator.appName.indexOf("Explorer") > -1)
            {
                document.getElementById('totalSecond').innerText = second--;
            } else
            {
                document.getElementById('totalSecond').textContent = second--;
            }
        }
    }
</script>
</html>