<%--
  Created by IntelliJ IDEA.
  User: 32551
  Date: 2022/2/17
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
    <script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/comment/pinglun.css">
    <style>
        .test{
            height: auto;
            margin: 0 15%;
        }
    </style>
</head>
<body>
<%--</div>--%>
<div class="body">
    <div class="head">
        <span>作者：<span id="user"></span></span>
        <br>
        <span>发布时间：<span id="beginDate"></span></span>
    </div>
</div>

    <div id="content"></div>

<div class="test">
    <div lang="en-US" class="gitment-container gitment-editor-container" id="c1">
        <div class="gitment-editor-main">
            <div class="gitment-editor-body">
                <div class="gitment-editor-write-field">
                    <textarea placeholder="你想说些什么" title="Login to Comment" id="userComment" name="userComment" ></textarea>
                </div>
                <div class="gitment-editor-preview-field gitment-hidden">
                    <div class="gitment-editor-preview gitment-markdown"></div>
                </div>
            </div>
        </div>
        <div class="gitment-editor-footer">
            <button class="gitment-editor-submit" id='sub'  title="Login to Comment">评论</button>
        </div>
    </div>
    <div lang="en-US" class="gitment-container gitment-comments-container" >
        <ul class="gitment-comments-list" id="demo">
        </ul>
    </div>
</div>
</body>
<script>
    <%--    <%String id=request.getParameter("id");%>--%>
    $.ajax({
        type:'post',
        url:'${pageContext.request.contextPath}/getCommentById',
        dataType:'json',
        data:{
            id:<%="\""%>${param.id}<%="\""%>
        },
        success:function (data,textStatus) {
            let userData = eval(data);
            let newData=userData.data;
            let li="";
            for (let i = 0; i < newData.length; i++) {
                li+='<li class="gitment-comment">'+
                '<a class="gitment-comment-avatar"><img class="gitment-comment-avatar-img" src=""></a>'+
                '<div class="gitment-comment-main">'+
                '<div class="gitment-comment-header">'+
                '<a class="gitment-comment-name">'+newData[i].userId+'</a>'+
                '<span></span></div>'+
                '<div class="gitment-comment-body gitment-markdown"><p>'+
                newData[i].userComment+'</p></div></div></li>'
            };
            $("#demo").html(li)
            var aCol=['${pageContext.request.contextPath}/images/user1.png','${pageContext.request.contextPath}/images/user2.png',
                '${pageContext.request.contextPath}/images/user3.png','${pageContext.request.contextPath}/images/user4.png',
                '${pageContext.request.contextPath}/images/user5.png'];
            var aLI=document.getElementsByTagName('img');
            for(var i=0,l=aLI.length;i<l;i++){
                aLI[i].src=aCol[i%5];
            }
        },
        error:function () {
            console.log('加载失败')
        }
    })

    $.ajax({
        type:'post',
        url:'${pageContext.request.contextPath}/getRewardMoneyById',
        dataType:'json',
        data:{
            id:<%="\""%>${param.id}<%="\""%>
        },
        success:function (data,textStatus) {
            let userData = eval(data);
            let newData=userData.data;
            $('#head_title').text(newData[0].title);
            $('#title').text(newData[0].title);
            $('#user').text(newData[0].userId);
            $('#beginDate').text(newData[0].beginDate);
            $('#content').html(newData[0].content);
            $('#status').text(newData[0].status);
            $('#price').text(newData[0].price);
            $('#imageurl').attr({src:newData[0].image})
        },
        error:function () {
            console.log('加载失败')
        }
    })

    $("#sub").on("click", function(){
        $.ajax({
            type: "get",
            url: "/CampusForum/hasLogin",
            dataType: 'json',
            success: function(data, textStatus) {
                if (data.data[0]!= null) {
                    $.ajax({
                        type:'post',
                        url:'${pageContext.request.contextPath}/admin/addComment',
                        dataType:'json',
                        data:{
                            conId:<%="\""%>${param.id}<%="\""%>,
                            userComment:$('#userComment').val()
                        },
                        success:function (data,textStatus) {
                            window.history.go(0)
                        },
                        error:function (XMLHttpRequest, textStatus, errorThrown) {
                            console.log(errorThrown)
                        }
                    })
                }else {
                    alert('请登录')
                }
            },
            errors: function(XMLHttpRequest, textStatus, errorThrown) {
                alert('失败')
            }
        })
    });

</script>
<script type="text/javascript">
    window.onload=function(){
        function stopPropagation(e) {
            window.event? window.event.cancelBubble = true : e.stopPropagation();
        }
    }
</script>
</html>
<style>
    .head{
        width: 80%;
        background-color: aliceblue;
        height: 20%;
    }
    .body{
        display: flex;
        justify-content: center;
        /* align-items: center; */
    }
    .en{
        -webkit-tap-highlight-color: rgba(18,18,18,0);
        font: inherit;
        outline: none;
        appearance: none;
        margin: 0;
        display: inline-block;
        padding: 0 16px;
        font-size: 14px;
        line-height: 32px;
        text-align: center;
        cursor: pointer;
        background: none;
        border: 1px solid;
        border-radius: 3px;
        border-color: #06f;
        min-width: 96px;
        color: #fff;
        background-color: #06f;
        float: right;
    }

    body{
        background:url(../images/back.png) #fff;
    }
    .head {
        border: 2px solid #614545;
        border-radius: 10px;
        width: 80%;
    }
    #content{
        margin: 0 auto;
        width: 80%;
        background-color: white;
        border: 2px solid #be9797;
        border-radius: 10px;
        margin-top: 10px;
    }
    .test{
        margin: 0 auto;
        border: 2px solid #614545;
        margin-top: 10px;
        width: 80%;

    }
    #c1{
        margin: 0 auto;
    }
</style>