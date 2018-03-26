package com.hanma56.cloud.route.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.hanma56.cloud.route.model.Line;

/**
 * <p>
 * 运营线路 服务类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-20
 */
public interface LineService extends IService<Line> {

    /**
     * 保存线路
     * @param line
     */
    void saveLine(Line line);

    /**
     * 通过用户ID查询线路
     * @param userId
     * @param currentPage
     * @param pageSize
     * @return
     */
    Page<Line> queryOnePageByUserId(Long userId,int currentPage,int pageSize);

}
