<%--
  Created by IntelliJ IDEA.
  User: dva
  Date: 2019-03-13
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="./header.jsp" %>

<html>
<head>

    <spring:url value="/assets/style.css" var="styleCss" />
    <spring:url value="/js/bootstrap.min.js" var="mainJs" />

    <title>首页</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="${styleCss}" rel="stylesheet" />
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="${mainJs}"></script>


</head>

<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">IBM商城</a>
        </div>

        <ul class="nav navbar-nav">
            <li class="active"><a href="">首页</a></li>
            <li><a href="">关于</a></li>
            <li><a href="">登录</a></li>
        </ul>
    </div>
</nav>


<%--<button type="button" class="btn btn-primary">按钮</button>--%>

<!--轮播图-->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <div class="carousel-caption" style="<spring:url value="/assets/slide_1.jpg"/>">
                <h1>轮播1的标题</h1>
                <p>这里是轮播图1的说明</p>
            </div>
        </div>
        <div class="item">
            <div class="carousel-caption" style="<spring:url value="/assets/slide_2.jpg"/>">
                <h1>轮播2的标题</h1>
                <p>这里是轮播图2的说明</p>
            </div>
        </div>
        <div class="item">
            <div class="carousel-caption" style="<spring:url value="/assets/slide_3.jpg"/>">
                <h1>轮播3的标题</h1>
                <p>这里是轮播图3的说明</p>
            </div>
        </div>
    </div>
    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<%--<div class="slide">--%>
    <%--<div style="background-image: url('../assets/slide_1.jpg')">--%>
        <%--<img src="../assets/slide_1.jpg"/>--%>
        <%--<h1>轮播图1</h1></div>--%>
    <%--<div style="background: url(../assets/slide_2.jpg);width: 100px;height: 100px">--%>
        <%--<h1>轮播图2</h1></div>--%>
    <%--<div style="background-image: url(../assets/slide_3.jpg)">--%>
        <%--<h1>轮播图3</h1></div>--%>
<%--</div>--%>

<!--案例-->
<div class="case container">
    <div class="row">
        <div class="col-md-4" style="<spring:url value="/assets/case_1.jpg"/>">
            <h2>案例1</h2>
            <p>非常不错的产品，我很喜欢</p>
        </div>
        <div class="col-md-4" style="background: <spring:url value="/assets/case_2.jpg"/>">
            <h2>案例2</h2>
            <p>非常不错的产品，我很喜欢</p>
        </div>
        <div class="col-md-4" style="background: <spring:url value="/assets/case_3.jpg"/>">
            <h2>案例3</h2>
            <p>非常不错的产品，我很喜欢</p>
        </div>
    </div>
</div>

<!--产品功能截图-->
<div class="container screenshot">
    <div class="row item">
        <div class="col-md-5"><img src="<spring:url value="/assets/screenshot_1.jpg"/>"></div>
        <div class="col-md-7">
            <h2>截图1</h2>
            <p>截图说明1，截图说明1，截图说明1，截图说明1，截图说明1，</p>
        </div>
    </div>
    <div class="row item">
        <div class="col-md-7">
            <h2>截图2</h2>
            <p>截图说明2，截图说明2，截图说明2，截图说明2，截图说明2，</p>
        </div>
        <div class="col-md-5"><img src="<spring:url value="/assets/screenshot_2.jpg"/>"></div>
    </div>
    <div class="row item">
        <div class="col-md-5"><img src="<spring:url value="/assets/screenshot_3.jpg"/>"></div>
        <div class="col-md-7">
            <h2>截图3</h2>
            <p>截图说明3，截图说明3，截图说明3，截图说明3，截图说明3，</p>
        </div>
    </div>
</div>


<div class="footer">
    版权所有 2019
    <a href="https://www.ibm.com/hk-en/?ar=1">IBM</a>
</div>

</body>
</html>
