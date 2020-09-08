package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
@ResponseBody 用于将数据直接返回到浏览器 或返回json对象*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    //@ResponseBody如果每个方法都用到可以直接写到类名上面
    public String hello(){
        return "hello world quick";
    }
}
