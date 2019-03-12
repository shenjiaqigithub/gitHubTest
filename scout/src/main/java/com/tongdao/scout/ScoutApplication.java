package com.tongdao.scout;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement // 如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@SpringBootApplication

@EnableScheduling
@MapperScan("com.tongdao.scout.dao")
public class ScoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoutApplication.class, args);
	}

}

