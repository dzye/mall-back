package com.mall.mallback.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName("smallType")
@Data
public class SmallType implements Serializable {
    private Integer id;
    private String name;
    private String remark;
    private Integer bigTypeId;
    @TableField(select = false)
    private BigType bigType;
    @TableField(select = false)
    private List<Product> productList;
}
