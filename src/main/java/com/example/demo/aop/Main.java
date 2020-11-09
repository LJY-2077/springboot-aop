package com.example.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/914:47
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        annotationService.add();
        methodService.add();
        context.close();
    }
}
