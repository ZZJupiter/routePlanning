package com.hanma56.cloud.route.dao;

import com.hanma56.cloud.route.model.LineRoute;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 运输线路途经地点 Mapper 接口
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-29
 */
public interface LineRouteMapper extends BaseMapper<LineRoute> {


    /**
     * 根据线路ID 查询点位列表
     * @param lineId
     * @return
     */
    List<LineRoute> queryByLineId(@Param("lineId") Long lineId);
}
