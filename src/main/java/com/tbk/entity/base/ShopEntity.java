package com.tbk.entity.base;


import com.tbk.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class ShopEntity extends BaseEntity {

    //商店名称
    @Column(name = "name")
    private String name;

    //商店图片
    @Column(name = "shoppic")
    private String shopPic;

    //店铺链接
    @Column(name = "shopurl")
    private String shopUrl;

    //店铺排序
    @Column(name = "priority")
    private String priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopPic() {
        return shopPic;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
