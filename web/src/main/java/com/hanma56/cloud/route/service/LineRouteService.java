package com.hanma56.cloud.route.service;

import com.hanma56.cloud.route.model.LineRoute;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 运输线路途经地点 服务类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-29
 */
public interface LineRouteService extends IService<LineRoute> {

    /**
     * 批量保存线路经过的地点
     * @param lineRouteList
     */
    void batchSaveLinePoint(List<LineRoute> lineRouteList);

    /**
     * 根据线路ID
     * @param lineId
     * @return
     */
    List<LineRoute> queryByLineId(Long lineId);

}
