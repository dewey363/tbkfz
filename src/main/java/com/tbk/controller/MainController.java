package com.tbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by TU on 2018/8/1.
 */
@Controller
public class MainController{

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
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/men")
    public String men() {
        return "men";
    }

    @RequestMapping(value = "/products")
    public String products() {
        return "products";
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
