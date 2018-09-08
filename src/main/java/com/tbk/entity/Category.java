package com.tbk.entity;

import com.tbk.entity.base.CategoryEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商品大类
 * Created by TU on 2018/9/8.
 */
@Entity
@Table(name = "category")
public class Category extends CategoryEntity {
}
