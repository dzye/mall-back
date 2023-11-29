package com.mall.mallback.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/swiper/**").addResourceLocations("file:C:\\Users\\karlot\\WeChatProjects\\picList\\swiperImgs\\");
        registry.addResourceHandler("/image/bigType/**").addResourceLocations("file:C:\\Users\\karlot\\WeChatProjects\\picList\\bigTypeImgs\\");
        registry.addResourceHandler("/image/product/**").addResourceLocations("file:C:\\Users\\karlot\\WeChatProjects\\picList\\productImgs\\");
    }
}
