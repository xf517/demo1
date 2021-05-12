package com.zuul;


import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.zuul.filter.LoggerFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@RefreshScope
@EnableZuulProxy
@SpringBootApplication(scanBasePackageClasses = {MapperConfig.class, ZuulApplication.class })
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        System.out.println("-------------------------ZuulApplication启动了");
    }

    @Bean
    public LoggerFilter logFilter() {
        return new LoggerFilter();
    }

}
