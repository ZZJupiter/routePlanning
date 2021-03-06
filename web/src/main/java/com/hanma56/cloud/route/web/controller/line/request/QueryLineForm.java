package com.hanma56.cloud.route.web.controller.line.request;

import com.hanma56.cloud.route.web.request.PageRequest;

/**
 * @author 张钟
 * @date 2018/3/20
 */
public class QueryLineForm extends PageRequest {

    /** 用户ID **/
    private Long userId;

    /** 线路名称 **/
    private String lineName;

    /** 起始城市 **/
    private String startCityName;

    /** 结束城市 **/
    private String endCityName;

    /** 货车车牌 **/
    private String truckNo;

    /** 联系人 **/
    private String contacts;

    /** 联系方式 **/
    private String contactWay;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStartCityName() {
        return startCityName;
    }

    public void setStartCityName(String startCityName) {
        this.startCityName = startCityName;
    }

    public String getEndCityName() {
        return endCityName;
    }

    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName;
    }

    public String getTruckNo() {
        return truckNo;
    }

    public void setTruckNo(String truckNo) {
        this.truckNo = truckNo;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
}
