package com.example.demo.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by emi on 2016/11/1.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseDomain implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date lastUpdateTime;

//    @Column(nullable = true, columnDefinition = "int(1) default 0 Comment '是否删除，未删除：0， 删除：1'")
//    private boolean deleted;


    public BaseDomain() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }




//    public void checkDelete() {
//        if (DomainDelete.Deleted.equals(this.deleted)) {
//            throw new RecordHasDeleteException(this.id, this.getClass().getSimpleName());
//        }
//    }


}
