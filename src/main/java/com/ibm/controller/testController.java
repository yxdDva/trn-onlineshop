package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dva
 * @create 2019-03-12 15:37
 */
@Controller
public class testController {

    @RequestMapping("/tt")
    public String testMethod(){
        return "text";
    }

}
