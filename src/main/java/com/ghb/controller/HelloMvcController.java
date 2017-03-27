package com.ghb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ASUS on 2017/3/7.
 */
@Controller
public class HelloMvcController {
    //localHost:8080/hello/mvc
    @RequestMapping(value = "/mvc",method = RequestMethod.GET)
    public String helloMvc(){
        System.out.println(111111);

        return "hellosdf";
    }
    @RequestMapping(value = "/mvc",method = RequestMethod.GET)
    public String helloMvc111(){
        System.out.println(111111);

        return "hello";
    }
}
