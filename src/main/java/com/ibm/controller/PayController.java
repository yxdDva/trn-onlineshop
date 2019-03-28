package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dva
 * @create 2019-03-27 15:28
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @GetMapping("/money")
    public String pay(){
        return "cashier";
    }


}
