package com.assistant.ruihut.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    /**
     * 本地访问内容地址 ：http://localhost:8080/hello
     * @param map
     * @return
     */
    @RequestMapping("/test")
    public String home(HashMap<String, Object> map) {
        map.put("hello", "this is a test html!");
        return "/index";
    }
}