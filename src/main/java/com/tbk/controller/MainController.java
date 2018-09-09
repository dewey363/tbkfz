package com.tbk.controller;

import com.tbk.entity.Product;
import com.tbk.entity.Shop;
import com.tbk.service.ProductService;
import com.tbk.service.ShopService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Strings;

import javax.servlet.http.HttpServletRequest;
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
    public String index(HttpServletRequest request ,Model model) {
        String pageNum = StringUtils.isEmpty(request.getParameter("pageNum"))?"1":request.getParameter("pageNum");
       /* String pageSize = StringUtils.isEmpty(request.getParameter("pageNum"))?"20":request.getParameter("pageSize");*/
        Pageable pageable = new PageRequest(Integer.valueOf(pageNum)-1,20);
        List<Shop> shops = shopService.findTopN(3).getContent();//查询前3的商店
        List<Product> products = productService.findPage(pageable).getContent();//首次展示20种商品
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
