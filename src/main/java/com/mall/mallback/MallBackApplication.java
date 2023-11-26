package com.mall.mallback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mall.mallback.mapper")
public class MallBackApplication {
	public static void main(String[] args) {
		SpringApplication.run(
				MallBackApplication.class, args
		);
	}
}
