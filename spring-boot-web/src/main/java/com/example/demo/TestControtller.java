package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: franck
 * Company: Shenggu
 * Date: 2017/9/5.
 */
@RestController
public class TestControtller {

    @RequestMapping("demo")
    public String test(){
        return "test";
    }




}
