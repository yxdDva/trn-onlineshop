package com.ibm.controller;

import com.ibm.bean.User;
import com.ibm.service.OrderService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author dva
 * @create 2019-03-27 10:23
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService os;

    @PostMapping("/genji")
    public String generateOrder(HttpServletRequest request,HttpSession session){
//       获取前端购物车复选框中选中的value
        String[] arr = request.getParameterValues("checkbb");
//        session的user
        User u = (User)session.getAttribute("nowuser");
        int colnum = os.addItemsToOrder(arr, u);
        System.out.println("订单行数："+colnum);
        return "redirect:../pay/money";
//        return "redirect:../cart/all";
    }

}
