package com.ibm.controller;

import com.ibm.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dva
 * @create 2019-03-12 15:37
 */
@Controller
public class testController {

    @RequestMapping("/test")
    public String testMethod() {
        System.out.println("if come in!!!!!!!!!!!");
        return "test";
    }

    @RequestMapping(value = "/login")
    public String login(@ModelAttribute User user) {
        System.out.println("test's login");
        return "login";
    }

}
