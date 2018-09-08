package com.tbk.controller;

import com.tbk.entity.Product;
import com.tbk.entity.Shop;
import com.tbk.service.ProductService;
import com.tbk.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by TU on 2018/8/1.
 */
@Controller
public class MainController{

    @Autowired
    private ProductService productService;
    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/account")
    public String account() {
        return "account";
    }

    @RequestMapping(value = "/checkout")
    public String checkout() {
        return "checkout";
    }

    @RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<Shop> shops = shopService.findTopN(3).getContent();
        List<Product> products = productService.findAll();
        model.addAttribute("shops",shops);
        model.addAttribute("products",products);
        return "index";
    }

    @RequestMapping(value = "/men")
    public String men() {
        return "men";
    }

    @RequestMapping(value = "/shop")
    public String shop() {
        return "shop";
    }

    @RequestMapping(value = "/register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/single")
    public String single() {
        return "single";
    }

    @RequestMapping(value = "/women")
    public String women() {
        return "women";
    }
}
