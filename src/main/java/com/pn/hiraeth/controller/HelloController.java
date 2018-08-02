package com.pn.hiraeth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * <p>@author Ives.l
 * <p>@date 2018/7/7
 * <p>@time 17:16
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}
