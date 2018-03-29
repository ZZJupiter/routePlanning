package com.hanma56.cloud.route.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hanma56.cloud.route.model.Line;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 运营线路 Mapper 接口
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-20
 */
public interface LineMapper extends BaseMapper<Line> {

    /**
     * 通过创建人查询线路列表
     *
     * @param page
     * @param creator
     * @return
     */
    List<Line> selectByCreator(@Param("page") Pagination page, @Param("creator") Long creator, @Param("lineName") String lineName, @Param("startCityName") String startCityName, @Param("endCityName") String endCityName);

}
