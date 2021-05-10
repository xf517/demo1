package com.xf;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackageClasses = {MapperConfig.class, EurekaApplication.class })
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("-------------------------EurekaApplication启动了");
    }

}
