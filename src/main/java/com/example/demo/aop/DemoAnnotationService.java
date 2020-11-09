package com.example.demo.aop;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/914:06
 */
@Service
public class DemoAnnotationService {


    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DemoAnnotationService.class);
    @Action(
            name = "DemoAnnotationServicez注解拦截add操作"
    )
    public void add() {
        logger.info("声明类:{}的执行方法:{}",this.getClass().getName(),this.getClass().getMethods()[0].getName());
    }

    ;
}
