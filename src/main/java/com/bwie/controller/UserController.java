package com.bwie.controller;

import com.bwie.entity.User;
import com.bwie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by MrWang on 2017/7/24.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }


    @RequestMapping("login")
    public String login(User user){
        User u = userService.login(user);
        if(u!=null){
            return "redirect:findAll";
        }
        return "index";
    }

    @RequestMapping("save")
    public String save(User user){
        userService.save(user);
        return "index";
    }

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("userExist")
    public void userExist(User user, HttpServletResponse httpServletResponse)
            throws Exception {
        User u = userService.userExist(user);
        if (u != null) {
            httpServletResponse.getWriter().write("1");
        }else{
            httpServletResponse.getWriter().write("2");
        }
    }



}
