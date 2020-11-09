package com.example.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/914:46
 */
@Configuration
@ComponentScan("com.example.demo.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
