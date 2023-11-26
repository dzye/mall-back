package com.mall.mallback.controller;

import com.mall.mallback.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mall")
public class TestController {

    @GetMapping("/test")
    public R test(){
        return R.ok("666");
    }
}
