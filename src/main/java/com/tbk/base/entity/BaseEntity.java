package com.tbk.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * Created by TU on 2018/8/24.
 * 所有实体都继承的基类
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
        this.deleted = false;
        this.insertTime = new Date();
        this.updateTime = this.insertTime;
    }

    /**
     * 主键
     */
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    protected String id;

    /**
     * 插入时间
     */
    @Column(name = "inserttime")
    protected Date insertTime;

    /**
     * 最后一次修改时间
     */
    @Column(name = "updatetime")
    protected Date updateTime;

    /**
     * 插入人
     */
    @Column(name = "insertuserid")
    protected String insertUserId;

    /**
     * 修改人
     */
    @Column(name = "updateuserid")
    protected String updateUserId;

    /**
     * 删除标志位
     */
    @Column(name = "deleted")
    protected boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
