package com.yyq.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yyq.demo.mapper")
public class MybatisMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisMapperApplication.class, args);
	}
}
