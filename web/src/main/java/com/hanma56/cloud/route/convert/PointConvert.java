package com.hanma56.cloud.route.convert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hanma56.cloud.route.model.Line;
import com.hanma56.cloud.route.model.LineRoute;
import com.hanma56.cloud.route.web.controller.line.request.LinePointVO;
import org.springframework.beans.BeanUtils;

import com.hanma56.cloud.route.core.model.PointModel;
import com.hanma56.cloud.route.model.DeliveryPoint;

/**
 * @author 张钟
 * @date 2018/3/12
 */
public class PointConvert {

    public static List<BigDecimal> convert(PointModel pointModel) {
        List<BigDecimal> position = new ArrayList<>();
        position.add(pointModel.getLongitude());
        position.add(pointModel.getLatitude());
        return position;
    }

    public static PointModel convert(DeliveryPoint deliveryPoint) {
        PointModel pointModel = new PointModel();
        BeanUtils.copyProperties(deliveryPoint, pointModel);
        return pointModel;
    }

    public static List<PointModel> convert(List<DeliveryPoint> deliveryPointList) {
        List<PointModel> pointModelList = new ArrayList<>();
        for (DeliveryPoint deliveryPoint : deliveryPointList) {
            pointModelList.add(convert(deliveryPoint));
        }
        return pointModelList;
    }

    public static List<LineRoute> convert(List<LinePointVO> linePointVOList, Long lineId, Long userId) {
        List<LineRoute> lineRouteList = new ArrayList<>();
        for(LinePointVO linePointVO:linePointVOList){
            LineRoute lineRoute = new LineRoute();
            BeanUtils.copyProperties(linePointVO,lineRoute);
            lineRoute.setLineId(lineId);
            lineRoute.setUserId(userId);
            lineRouteList.add(lineRoute);
        }
        return lineRouteList;
    }
}
