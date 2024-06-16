package com.easypan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description 用于测试
 * @Author Powerveil
 * @Date 2024/6/15 17:50
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test01")
    public String test01() {
        return "test01";
    }
}
