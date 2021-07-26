package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dt
 * @date: 2021/7/26 21:50
 */

@RestController
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        return "Spring boot hello world";
    }
}
