<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
        <ul class="layui-nav layui-nav-tree">
            <li class="layui-nav-item layui-nav-itemed">
                <a>线路</a>
                <dl class="layui-nav-child">
                    <dd<#if Session.path=="/line/list.htm"> class="layui-this"</#if>>
                        <a href="/line/list.htm">线路列表</a>
                    </dd>
                    <dd<#if Session.path=="/deliveryPoint/getMap.htm"> class="layui-this"</#if>>
                        <a href="/deliveryPoint/getMap.htm?lineId=1">线路列表</a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item layui-nav-itemed">
                <a>解决方案</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;">列表一</a></dd>
                    <dd><a href="javascript:;">列表三</a></dd>
                </dl>
            </li>
        <#--<li class="layui-nav-item"><a href="">云市场</a></li>-->
        <#--<li class="layui-nav-item"><a href="">发布商品</a></li>-->
        </ul>
    </div>
</div>
