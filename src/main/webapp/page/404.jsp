<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>404</title>
    <meta name="author" content="ukieweb" />
    <meta name="keywords" content="404 page, dinosaur, css3, template, html5 template, ukieweb" />
    <meta name="description" content="404 - Page Template" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <!--    <link type="text/css" media="all" href="css/bootstrap.min.css" rel="stylesheet" />-->
    <link type="text/css" media="all" href="../css/error/dmaku.main.css" rel="stylesheet" />
    <link type="text/css" media="all" href="../css/error/respons.css" rel="stylesheet" />
    <script src="../js/error/createjs.min.js"></script>
    <script src="../js/error/dinosaur.js"></script>
    <script>
        var canvas, stage, exportRoot;
        function init() {
            canvas = document.getElementById("canvas");
            handleComplete();
        }
        function handleComplete() {
            exportRoot = new lib.dinosaur();
            stage = new createjs.Stage(canvas);
            stage.addChild(exportRoot);
            createjs.Ticker.setFPS(lib.properties.fps);
            createjs.Ticker.addEventListener("tick", stage);
            (function(isResp, respDim, isScale, scaleType) {
                var lastW, lastH, lastS=1;
                window.addEventListener('resize', resizeCanvas);
                resizeCanvas();
                function resizeCanvas() {
                    var w = lib.properties.width, h = lib.properties.height;
                    var iw = window.innerWidth, ih=window.innerHeight;
                    var pRatio = window.devicePixelRatio, xRatio=iw/w, yRatio=ih/h, sRatio=1;
                    if(isResp) {
                        if((respDim=='width'&&lastW==iw) || (respDim=='height'&&lastH==ih)) {
                            sRatio = lastS;
                        }
                        else if(!isScale) {
                            if(iw<w || ih<h)
                                sRatio = Math.min(xRatio, yRatio);
                        }
                        else if(scaleType==1) {
                            sRatio = Math.min(xRatio, yRatio);
                        }
                        else if(scaleType==2) {
                            sRatio = Math.max(xRatio, yRatio);
                        }
                    }
                    canvas.width = w*pRatio*sRatio;
                    canvas.height = h*pRatio*sRatio;
                    canvas.style.width = w*sRatio-15+'px';
                    canvas.style.height = h*sRatio-15+'px';
                    stage.scaleX = pRatio*sRatio;
                    stage.scaleY = pRatio*sRatio;
                    lastW = iw; lastH = ih; lastS = sRatio;
                }
            })(true,'both',false,1);
        }
    </script>
</head>
<body onload="init();">

<!-- Load page -->
<div class="animationload">
    <div class="loader">
    </div>
</div>
<!-- End load page -->


<!-- Content Wrapper -->
<div id="wrapper">
    <div class="container">

        <!-- Dinosaur -->
        <div class="dinosaur">
            <canvas id="canvas" width="700" height="280" style="display: block;"></canvas>
        </div>
        <!-- end Dinosaur -->

        <!-- Info -->
        <div class="info">
            <h3>哎呀！打不开！</h3>
            <h2>正在开发中</h2>
            <a href="welcome-1.html" class="btn">返 回 首 页</a>
        </div>
        <!-- end Info -->

    </div>
    <!-- end container -->
</div>
<!-- end Content Wrapper -->

<!-- Scripts -->
<script src="../js/error/jquery-3.3.1.min.js" type="text/javascript"></script>
<!--    <script src="js/bootstrap.min.js" type="text/javascript"></script>-->
<!--    <script src="js/modernizr.custom.js" type="text/javascript"></script>-->
<script src="../js/error/scripts.js" type="text/javascript"></script>

</body>
</html>
