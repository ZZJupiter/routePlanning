<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <#include "../layout/head.ftl">
    <#include "../layout/left.ftl">

    <div class="layui-body" style="padding-top: 20px">
        <!-- 内容主体区域 -->
        <form id="query-line-form" class="layui-form" action="">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">始发地</label>
                    <div class="layui-input-inline">
                        <input type="text"
                               name="startCity"
                               value="${form.startCity!''}"
                               autocomplete="off"
                               class="layui-input">
                    </div>
                </div>

                <div class="layui-inline">
                    <label class="layui-form-label">目的地</label>
                    <div class="layui-input-inline">
                        <input type="text"
                               name="endCity"
                               value="${form.endCity!''}"
                               autocomplete="off"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <button class="layui-btn" lay-submit="" lay-filter="submitBtn">查询</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>

            <input id="currentPage" name="currentPage" value="${form.currentPage}" hidden="true"/>
            <input id="pageSize" name="pageSize" value="15" hidden="true"/>
        </form>

        <table class="layui-table" lay-even="" lay-skin="line">
            <colgroup>
                <col width="200">
                <col width="100">
                <col width="100">
                <col width="200">
                <col>
            </colgroup>
            <thead>
            <tr>
                <th>线路名称</th>
                <th>始发地</th>
                <th>目的地</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

    <#list page.records as line>
    <tr>
        <td>${line.lineName}</a></td>
        <td>${line.startCityName!''}</td>
        <td>${line.endCityName!''}</td>
        <td>${(line.created?string('yyyy-MM-dd hh:mm:ss'))!''}</td>
        <td>
            <a href="/line/gdMap.htm?lineId=${line.id}" target="_blank"
               class="layui-btn layui-btn-mini">高德地图</a>
        </td>

    </tr>
    </#list>
            </tbody>
        </table>
        <div id="pageBar"></div>
    </div>
    <#include "../layout/foot.ftl">
</div>
</body>

<script src="/layui/layui.js" charset="utf-8"></script>
<script src="/js/jquery-1.11.1.min.js" charset="utf-8"></script>

<script>

    layui.use(['laypage', 'form'], function () {
        var laypage = layui.laypage;
        var form = layui.form;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageBar',
            count: ${page.total},
            jump:getNextPage,
            curr:${form.currentPage}
        });

        //监听提交
        form.on('submit(submitBtn)', function (data) {
            $('#currentPage').val(1);
            $('#query-line-form').submit();
            return false;
        });


    });
    var getNextPage = function (obj, first) {
        $('#currentPage').val(obj.curr);
        console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
        console.log(obj.limit); //得到每页显示的条数
        if (!first) {
            $('#query-line-form').submit();
        }
    }
</script>
</html>

