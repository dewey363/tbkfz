package com.tbk.entity.base;

import com.tbk.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ProductEntity extends BaseEntity {

    //商品链接
    @Column(name = "name")
    private String name;

    //商品主图
    @Column(name = "mainpic")
    private String mainPic;

    //商品购买链接
    @Column(name = "buyurl")
    private String buyUrl;

    //优惠券链接
    @Column(name = "couponurl")
    private String couponUrl;

    //商品价格
    @Column(name = "price")
    private int price;

    //优惠券面额
    @Column(name = "coupondenomination")
    private String couponDenomination;

    //商品大类
    @Column(name = "categoryid")
    private String category;

    //商品小类
    @Column(name = "subdivisionid")
    private String subDivision;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainPic() {
        return mainPic;
    }

    public void setMainPic(String mainPic) {
        this.mainPic = mainPic;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public String getCouponUrl() {
        return couponUrl;
    }

    public void setCouponUrl(String couponUrl) {
        this.couponUrl = couponUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCouponDenomination() {
        return couponDenomination;
    }

    public void setCouponDenomination(String couponDenomination) {
        this.couponDenomination = couponDenomination;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(String subDivision) {
        this.subDivision = subDivision;
    }
}
