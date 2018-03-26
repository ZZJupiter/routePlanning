package com.hanma56.cloud.route.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 运营线路
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-20
 */
public class Line implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 线路ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 线路名称
     */
    @TableField("lineName")
    private String lineName;
    /**
     * 始发城市
     */
    @TableField("startCityName")
    private String startCityName;
    /**
     * 终止城市
     */
    @TableField("endCityName")
    private String endCityName;
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
     * 备注
     */
    private String memo;


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
        return "Line{" +
        ", id=" + id +
        ", lineName=" + lineName +
        ", startCityName=" + startCityName +
        ", endCityName=" + endCityName +
        ", created=" + created +
        ", updated=" + updated +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", memo=" + memo +
        "}";
    }
}
