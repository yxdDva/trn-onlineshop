<%--
  Created by IntelliJ IDEA.
  User: dva
  Date: 2019-03-14
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="./header.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="#页面图标换一下啦">
    <title>商城首页</title>

    <!-- Custom styles for this template -->
    <link href="<spring:url value="/css/slide.css"/>" rel="stylesheet">

    <%--<script src="js/jquery.min.js"></script>--%>
    <script src="<spring:url value="/js/jquery.min.js"/>"></script>
    <script src="<spring:url value="/js/slide.js"/>"></script>
    <style>
        .ck-slide {
            width:100%;
            height:500px;
        }
        .ck-slide ul.ck-slide-wrapper {
            height:500px;
        }
        .ck-slide-wrapper li{
            width: 100%;
        }
    </style>

</head>
<body>

<%--导航栏--%>
<header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">页面图标换一下</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">商品页1 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">商品页2</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">商品页3</a>
                </li>
            </ul>
            <form class="form-inline mt-2 mt-md-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">go~</button>
            </form>
        </div>
    </nav>
</header>

<main role="main">

    <%--跑马灯--%>
    <%--<div id="myCarousel" class="carousel slide" data-ride="carousel">--%>
        <%--<ol class="carousel-indicators">--%>
            <%--<li data-target="#myCarousel" data-slide-to="0" class="active"></li>--%>
            <%--<li data-target="#myCarousel" data-slide-to="1"></li>--%>
            <%--<li data-target="#myCarousel" data-slide-to="2"></li>--%>
        <%--</ol>--%>
        <%--<div class="carousel-inner">--%>
            <%--<div class="carousel-item active">--%>
                <%--<img src="<spring:url value="/assets/slide_1.jpg"/>" alt="First slide"/>--%>
                <%--<div class="container">--%>
                    <%--<div class="carousel-caption text-left">--%>
                        <%--<h1>3年A班</h1>--%>
                        <%--<p>托比昂首挺胸</p>--%>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">走你</a></p>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="carousel-item">--%>
                <%--<img src="<spring:url value="/assets/slide_2.jpg"/>" alt="Second slide"/>--%>
                <%--<div class="container">--%>
                    <%--<div class="carousel-caption">--%>
                        <%--<h1>女神探夏洛克</h1>--%>
                        <%--<p>卢西奥妙无穷</p>--%>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Let's think</a></p>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="carousel-item">--%>
                <%--<img src="<spring:url value="/assets/slide_3.jpg"/>" alt="Third slide"/>--%>
                <%--<div class="container">--%>
                    <%--<div class="carousel-caption text-right">--%>
                        <%--<h1>非自然死亡</h1>--%>
                        <%--<p>周美灵机一动</p>--%>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">不许走</a></p>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">--%>
            <%--<span class="carousel-control-prev-icon" aria-hidden="true"></span>--%>
            <%--<span class="sr-only">Previous</span>--%>
        <%--</a>--%>
        <%--<a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">--%>
            <%--<span class="carousel-control-next-icon" aria-hidden="true"></span>--%>
            <%--<span class="sr-only">Next</span>--%>
        <%--</a>--%>
    <%--</div>--%>

    <%--轮播图--%>
        <div class="ck-slide">
            <ul class="ck-slide-wrapper" style="width: 100%;">
                <li>
                    <a href="javascript:;"><img src="<spring:url value="/assets/slide_1.jpg"/>" alt="" style="width:100%;"></a>
                </li>
                <li style="display:none">
                    <a href="javascript:;"><img src="<spring:url value="/assets/slide_2.jpg"/>" alt="" style="width:100%;"></a>
                </li>
                <li style="display:none">
                    <a href="javascript:;"><img src="<spring:url value="/assets/slide_3.jpg"/>" alt="" style="width:100%;"></a>
                </li>
                <li style="display:none">
                    <a href="javascript:;"><img src="<spring:url value="/assets/slide_1.jpg"/>" alt="" style="width:100%;"></a>
                </li>
                <li style="display:none">
                    <a href="javascript:;"><img src="<spring:url value="/assets/slide_2.jpg"/>" alt="" style="width:100%;"></a>
                </li>
            </ul>
            <a href="javascript:;" class="ctrl-slide ck-prev">上一张</a>
            <a href="javascript:;" class="ctrl-slide ck-next">下一张</a>
            <div class="ck-slidebox">
                <div class="slideWrap">
                    <ul class="dot-wrap">
                        <li class="current"><em>1</em></li>
                        <li><em>2</em></li>
                        <li><em>3</em></li>
                        <li><em>4</em></li>
                        <li><em>5</em></li>
                    </ul>
                </div>
            </div>
        </div>


    <!-- 营销信息和功能说明
    ================================================== -->
    <!-- 将页面的其余部分包装在另一个容器中，以居中显示所有内容 -->

    <div class="container marketing">

        <!-- 在旋转木马下面有三列文本 -->
        <div class="row">
            <div class="col-lg-4">
                {% include icons/placeholder.svg width="140" height="140" background="#777" color="#777" class="rounded-circle" %}
                <h2>Heading</h2>
                <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
            <div class="col-lg-4">
                {% include icons/placeholder.svg width="140" height="140" background="#777" color="#777" class="rounded-circle" %}
                <h2>Heading</h2>
                <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
            <div class="col-lg-4">
                {% include icons/placeholder.svg width="140" height="140" background="#777" color="#777" class="rounded-circle" %}
                <h2>Heading</h2>
                <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
        </div><!-- /.row -->


        <!-- 启动电影短片 -->

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It’ll blow your mind.</span></h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>
            <div class="col-md-5">
                {% include icons/placeholder.svg width="500" height="500" background="#eee" color="#aaa" class="bd-placeholder-img-lg featurette-image img-fluid mx-auto" %}
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7 order-md-2">
                <h2 class="featurette-heading">Oh yeah, it’s that good. <span class="text-muted">See for yourself.</span></h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>
            <div class="col-md-5 order-md-1">
                {% include icons/placeholder.svg width="500" height="500" background="#eee" color="#aaa" class="bd-placeholder-img-lg featurette-image img-fluid mx-auto" %}
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>
            <div class="col-md-5">
                {% include icons/placeholder.svg width="500" height="500" background="#eee" color="#aaa" class="bd-placeholder-img-lg featurette-image img-fluid mx-auto" %}
            </div>
        </div>

        <hr class="featurette-divider">

        <!-- /END THE FEATURETTES -->

    </div><!-- /.container -->


    <!-- 页脚 -->
    <footer class="container">
        <p class="float-right"><a href="#">Back to top</a></p>
        <p class="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
    </footer>
</main>

<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->


<script>
    $('.ck-slide').ckSlide({
        autoPlay:true
        /*dir:"x"*/
    });
</script>
<script src="<spring:url value="/js/bootstrap.min.js"/>"></script>

<%--<script src="<spring:url value="/js/jquery-slim.min.js"/>"></script>--%>
<!--<script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>-->
<!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
<%--<script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>--%>
<%--<script src="<spring:url value="/assets/js/vendor/popper.min.js"/>"></script>--%>

<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<%--<script src="../../../../assets/js/vendor/holder.min.js"></script>--%>
</body>
</html>
