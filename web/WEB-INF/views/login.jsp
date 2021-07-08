<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<% request.setAttribute("basepath",request.getContextPath());%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.84.0">
    <title>登录页面国际化</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sign-in/">



    <!-- Bootstrap core CSS -->
    <link href="${basepath}/assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>


    <!-- Custom styles for this template -->
    <link href="${basepath}/assets/dist/css/signin.css" rel="stylesheet">
</head>
<body class="text-center">

<main class="form-signin">
    <form:form action="${basepath}/login" method="post" modelAttribute="user">
        <img class="mb-4" src="${basepath}/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
        <h1 class="h3 mb-3 fw-normal"><spring:message code="txt.welcome"></spring:message> </h1>
        <div class="row">

            <a class="col-md-6" href="${basepath}/i18n/zh_CN">中文</a>
            <a class="col-md-6" href="${basepath}/i18n/en_US">英文</a>
        </div>

        <div class="row">

            <a class="col-md-6" href="?locale=zh_CN">中文拦截器</a>
            <a class="col-md-6" href="?locale=en_US">英文拦截器</a>
        </div>
        <div class="form-floating">
            <input type="email" class="form-control" name="email" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput"><spring:message code="txt.email"></spring:message></label>
            <form:errors path="email"></form:errors>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" name="password" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword"><spring:message code="txt.Login"></spring:message></label>
            <form:errors path="password"></form:errors>
        </div>

        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> <spring:message code="txt.remember"></spring:message>
            </label>
        </div>
        ${errorMsg}
        <button class="w-100 btn btn-lg btn-primary" type="submit"><spring:message code="txt.Login"></spring:message> </button>
        <p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
    </form:form>
</main>



</body>
</html>
