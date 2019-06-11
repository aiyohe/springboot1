package com.example.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 10:48 2019/6/11
 * @Modified By:
 */
@RestController
public class HelloWroldController {
    @RequestMapping("hello")
    public String helloWorld(){
        return "Hello World !";
    }
}
