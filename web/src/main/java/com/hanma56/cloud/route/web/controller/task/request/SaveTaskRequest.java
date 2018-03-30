package com.hanma56.cloud.route.web.controller.task.request;

import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/30
 * \* Time: 下午12:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SaveTaskRequest {

    /**
     * 所属用户
     */
    private Long userId;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 分组数目
     */
    private Integer groupNumber;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 备注信息
     */
    private String memo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
