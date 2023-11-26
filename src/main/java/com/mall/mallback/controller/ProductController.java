package com.mall.mallback.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.mallback.entity.Product;
import com.mall.mallback.entity.R;
import com.mall.mallback.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;


    @GetMapping("/findSwiper")
    public R findSwiper(){
        List<Product> swiperProductList = productService.list(new QueryWrapper<Product>().eq("isSwiper",true).orderByAsc("swiperSort"));
        Map<String, Object> map = new HashMap<>();
        map.put("message", swiperProductList);
        return R.ok(map);
    }
}
