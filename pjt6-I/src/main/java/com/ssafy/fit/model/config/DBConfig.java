package com.ssafy.fit.model.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ssafy.fit.model.dao")
public class DBConfig {
	
}
