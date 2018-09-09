package com.tbk.controller;

import com.tbk.entity.Product;
import com.tbk.entity.Shop;
import com.tbk.service.ProductService;
import com.tbk.util.JacksonUtil;
import com.tbk.util.ResponseUtil;
import com.tbk.util.ResultPackage;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by TU on 2018/9/9.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/reloadproduct")//点击加载更多时响应
    public void reloadproduct(HttpServletRequest request , HttpServletResponse response) throws IOException {
        String pageNum = StringUtils.isEmpty(request.getParameter("pageNum"))?"1":request.getParameter("pageNum");
        String pageSize = StringUtils.isEmpty(request.getParameter("pageNum"))?"20":request.getParameter("pageSize");
        Pageable pageable = new PageRequest(Integer.valueOf(pageNum)-1,20);
        List<Product> products = productService.findPage(pageable).getContent();//首次展示20种商品
        ResponseUtil.responseUtils(response, ResultPackage.resultPackage("000000", JSONArray.fromObject(products),"加载成功"));
    }
}
