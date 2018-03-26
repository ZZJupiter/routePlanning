<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>按起终点经纬度规划路线</title>
    <#include '../layout/head.ftl'>
    <link href="/css/signin.css" rel="stylesheet">
</head>
<body class="text-center">
<form class="form-signin">
    <img class="mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">请登录</h1>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="tel" id="inputTel" class="form-control" placeholder="请输入电话号码" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="登录密码" required>
    <div class="checkbox mb-3">
        <#--<label>-->
            <#--<input type="checkbox" value="remember-me"> Remember me-->
        <#--</label>-->
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>
</body>
</html>


