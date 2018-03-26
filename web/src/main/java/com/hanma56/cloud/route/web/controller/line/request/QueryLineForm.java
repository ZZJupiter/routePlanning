package com.hanma56.cloud.route.web.controller.line.request;

import com.hanma56.cloud.route.web.request.PageRequest;

/**
 * @author 张钟
 * @date 2018/3/20
 */
public class QueryLineForm extends PageRequest {

    /** 用户ID **/
    private Long userId;

    /** 起始城市 **/
    private String startCity;

    /** 结束城市 **/
    private String endCity;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }
}
