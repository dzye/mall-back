package com.mall.mallback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.mallback.entity.SmallType;
import com.mall.mallback.mapper.SmallTypeMapper;
import com.mall.mallback.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("smallTypeService")
public class ISmallTypeServiceImpl extends ServiceImpl<SmallTypeMapper, SmallType> implements ISmallTypeService {
    @Autowired
    private SmallTypeMapper smallTypeMapper;

}
