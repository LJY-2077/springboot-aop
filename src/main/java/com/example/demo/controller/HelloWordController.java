package com.example.demo.controller;

import com.org.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/1010:03
 */
@RestController
@RequestMapping("/hello")
public class HelloWordController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/index")
    public String helloWord() {
        String msg = helloService.getMsg();
        return msg;
    }
}
