package com.tbk.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动入口，配置包根路径
 */
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class TbkfzApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbkfzApplication.class, args);
	}
}
