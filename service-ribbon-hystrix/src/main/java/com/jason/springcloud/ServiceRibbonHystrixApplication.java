package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 断路器
 */
@EnableHystrix

/**
 * 既是服务注册者，也是服务发现着
 */
@EnableDiscoveryClient


/**
 * 断路器仪表盘
 */
@EnableHystrixDashboard


@SpringBootApplication
public class ServiceRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonHystrixApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
