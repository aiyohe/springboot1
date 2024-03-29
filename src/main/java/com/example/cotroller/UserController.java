package com.example.cotroller;

import com.example.entity.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:58 2019/6/12
 * @Modified By:
 */
@Controller
public class UserController {
    private Logger _LOG = LoggerFactory.getLogger(UserController.class);
    @Resource
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:list";
    }
    @RequestMapping("/list")
    public String list(Model model){
        List<User> userList = userService.getUserList();
        model.addAttribute("users",userList);
        return "user/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }
    @RequestMapping("/add")
    public String add(User user) {
        userService.save(user);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,String id) {
        User user=userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.edit(user);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(String id) {
        userService.delete(id);
        return "redirect:/list";
    }
}
