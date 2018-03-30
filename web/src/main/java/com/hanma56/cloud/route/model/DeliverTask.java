package com.hanma56.cloud.route.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 配送任务
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-30
 */
@TableName("deliverTask")
public class DeliverTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 所属用户
     */
    @TableField("userId")
    private Long userId;
    /**
     * 任务名称
     */
    @TableField("taskName")
    private String taskName;
    /**
     * 分组数目
     */
    @TableField("groupNumber")
    private Integer groupNumber;
    /**
     * 开始时间
     */
    @TableField("startTime")
    private Date startTime;
    /**
     * 任务状态
     */
    private String state;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date updated;
    /**
     * 创建人
     */
    private Long creator;
    /**
     * 修改人
     */
    private Long modifier;
    /**
     * 备注信息
     */
    private String memo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "DeliverTask{" +
        "id=" + id +
        ", userId=" + userId +
        ", taskName=" + taskName +
        ", groupNumber=" + groupNumber +
        ", startTime=" + startTime +
        ", state=" + state +
        ", created=" + created +
        ", updated=" + updated +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", memo=" + memo +
        "}";
    }
}
