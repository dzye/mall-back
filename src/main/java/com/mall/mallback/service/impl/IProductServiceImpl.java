package com.mall.mallback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.mallback.entity.Product;
import com.mall.mallback.mapper.ProductMapper;
import com.mall.mallback.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class IProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
    @Autowired
    private ProductMapper productMapper;

}
