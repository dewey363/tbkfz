package com.tbk.entity.base;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.tbk.base.entity.BaseEntity;

import javax.persistence.MappedSuperclass;

/**
 * 商品小类
 * Created by TU on 2018/9/8.
 */
@MappedSuperclass
public abstract class SubdivisionEntity extends BaseEntity {
}
