package com.hanma56.cloud.route.web.controller.line.request;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/29
 * \* Time: 上午9:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SaveLinRouteForm {

    /**
     * 线路ID
     **/
    private Long lineId;

    /**
     * 用户ID
     **/
    private Long userId;

    /**
     * 线路经过的地点列表
     **/
    private List<LinePointVO> points;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<LinePointVO> getPoints() {
        return points;
    }

    public void setPoints(List<LinePointVO> points) {
        this.points = points;
    }
}
