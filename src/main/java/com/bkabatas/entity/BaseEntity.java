package com.bkabatas.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {
    private Date createdDate;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
