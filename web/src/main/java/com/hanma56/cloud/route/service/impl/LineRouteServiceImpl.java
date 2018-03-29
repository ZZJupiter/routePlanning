package com.hanma56.cloud.route.service.impl;

import com.hanma56.cloud.route.model.LineRoute;
import com.hanma56.cloud.route.dao.LineRouteMapper;
import com.hanma56.cloud.route.service.LineRouteService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 运输线路途经地点 服务实现类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-29
 */
@Service
public class LineRouteServiceImpl extends ServiceImpl<LineRouteMapper, LineRoute> implements LineRouteService {

    @Autowired
    private LineRouteMapper lineRouteMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void batchSaveLinePoint(List<LineRoute> lineRouteList) {
        initBatch(lineRouteList);
        insertOrUpdateBatch(lineRouteList);
    }

    @Override
    public List<LineRoute> queryByLineId(Long lineId) {
        List<LineRoute> lineRouteList = lineRouteMapper.queryByLineId(lineId);
        Collections.sort(lineRouteList, Comparator.comparing(LineRoute::getSeq));
        return lineRouteList;
    }

    private LineRoute initForSave(LineRoute lineRoute){
        Date currentDate = new Date();
        lineRoute.setUpdated(currentDate);
        if(lineRoute.getId()==null){
            lineRoute.setCreated(currentDate);
        }
        return lineRoute;
    }

    private List<LineRoute> initBatch(List<LineRoute> lineRoutes){
        for(LineRoute lineRoute:lineRoutes){
            initForSave(lineRoute);
        }
        return lineRoutes;
    }
}
