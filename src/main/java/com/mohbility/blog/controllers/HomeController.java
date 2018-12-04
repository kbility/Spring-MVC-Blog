package com.mohbility.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project Spring-MVC-Blog
 * @author: kbility
 * @Date: 12/3/2018
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
