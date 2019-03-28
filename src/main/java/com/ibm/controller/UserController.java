package com.ibm.controller;

import com.ibm.bean.User;
import com.ibm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author dva
 * @create 2019-03-14 15:09
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;

    @GetMapping(value = "/login")
    //login其实是不需要modelatt的，但是它起到了一个创建对象的作用
    public String login(@ModelAttribute User user,ModelMap map) {
        System.out.println("/user/login");

        return "login";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute User user, HttpSession session, Model model){
        //登陆状态？
        session.setAttribute("isLogin",false);
        User u = null;
        try {
            u = us.getUserByNameAndUpwd(user);
            session.setAttribute("nowuser", u);
            session.setAttribute("isLogin",true);
//            model.addAttribute("");
            //重定向路径问题
            return "redirect:../prod/sp";

        } catch (Exception e) {
            session.removeAttribute("uid");
            model.addAttribute("error",e.getMessage());
            return "login";
        }

    }
}
