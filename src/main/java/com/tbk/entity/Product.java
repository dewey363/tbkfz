package com.tbk.entity;

import com.tbk.entity.base.ProductEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product extends ProductEntity{
}
