package com.hanma56.cloud.route.web.controller.line.request;

public class SaveLineForm {

    /**
     * 线路ID
     */
    private Long id;
    /**
     * 线路名称
     */
    private String lineName;
    /**
     * 始发城市
     */
    private String startCityName;
    /**
     * 终止城市
     */
    private String endCityName;
    /**
     * 车牌号
     */
    private String truckNo;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系方式
     */
    private String contactWay;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
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
}
