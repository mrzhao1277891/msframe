package com.ect.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaojun on 2018/1/23.
 */
@Controller//restController不行，必须controller
@RequestMapping(value = "/welcome")
public class WelcomeController {

    @RequestMapping("/index")
    public String index() throws Exception{
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception{
        return "hello";
    }

}
