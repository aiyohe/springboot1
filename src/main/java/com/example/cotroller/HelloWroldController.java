package com.example.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 10:48 2019/6/11
 * @Modified By:
 */
@Controller
public class HelloWroldController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name",required = false,defaultValue ="World") String name) {
         model.addAttribute("name",name);
        return "hello";
    }
    @ResponseBody
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model, @RequestParam(value="name",required = false,defaultValue ="World") String name) {
        model.addAttribute("name",name);
        return "hello";
    }
}
