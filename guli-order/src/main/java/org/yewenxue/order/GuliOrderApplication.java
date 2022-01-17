package org.yewenxue.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Time : 2022/1/15 0:07
 * @Author : wenxue ye
 * @File : GuliOrderApplication
 * @Project : guli
 */
@EnableDiscoveryClient
@MapperScan("org.yewenxue.order.dao")
@SpringBootApplication
public class GuliOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuliOrderApplication.class,args);
    }
}
