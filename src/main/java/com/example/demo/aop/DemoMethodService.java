package com.example.demo.aop;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/914:22
 */
@Service
public class DemoMethodService {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DemoAnnotationService.class);
    public void add() {
        logger.info("声明类:{}的执行方法:{}",this.getClass().getName(),this.getClass().getMethods()[0].getName());
    }

}
