<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>货车路线规划－使用经纬度</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main.css?v=1.0"/>
    <script type="text/javascript"
            src='http://webapi.amap.com/maps?v=1.4.5&key=a193b223b319b7742f1657aff8acbab0&plugin=AMap.TruckDriving'></script>
    <style type="text/css">
        #panel {
            position: fixed;
            top: 10px;
            right: 10px;
            width: 300px;
        }
    </style>
</head>
<body>
<div id="mapContainer"></div>
<div id="panel" hidden="hidden"></div>
</div>
<script type="text/javascript">
    var map = new AMap.Map("mapContainer", {});
    var truckOptions = {
        map: map,
        policy: 0,
        size: 1,
        panel: 'panel'
    };
    var driving = new AMap.TruckDriving(truckOptions);
    var path = [];
    <#list lineRouteList as lineRoute>
            path.push({lnglat: [${lineRoute.lng} ,${lineRoute.lat}]});//起点
    </#list>
    driving.search(path, function (status, result) {
        //TODO something
    });

</script>
</body>
</html>