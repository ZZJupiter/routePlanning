<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
    <script src="/layui/layui.js" charset="utf-8"></script>
    <script>
        //JavaScript代码区域
        layui.use('element', function(){
            var element = layui.element;
        });
    </script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <#include "head.ftl">
    <#include "left.ftl">

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <h1> 首页 </h1>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © hanma56.com - copy right
    </div>
</div>
</body>
</html>