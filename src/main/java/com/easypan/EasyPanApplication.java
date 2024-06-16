package com.easypan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName EasyPanApplication
 * @Description 项目启动类
 * @Author Powerveil
 * @Date 2024/6/15 17:42
 * @Version 1.0
 */

@EnableAsync
@SpringBootApplication(scanBasePackages = {"com.easypan"})
@EnableTransactionManagement
@EnableScheduling
public class EasyPanApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyPanApplication.class, args);
    }
}
