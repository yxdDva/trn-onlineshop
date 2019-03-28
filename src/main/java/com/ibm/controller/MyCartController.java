package com.ibm.controller;

import com.ibm.bean.Cartitem;
import com.ibm.bean.Product;
import com.ibm.bean.User;
import com.ibm.bean.UserCart;
import com.ibm.service.ProductService;
import com.ibm.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dva
 * @create 2019-03-22 14:20
 */
@Controller
@RequestMapping("/cart")
public class MyCartController {

    @Autowired
    private ProductService ps;
    @Autowired
    private UserCartService ucs;

    List<UserCart> uclist = new ArrayList<>();


    @PostMapping(value = "/add")
    public String addCart(@ModelAttribute Cartitem cartitem, HttpSession session, Model model){
//        list need to be null
        List<Cartitem> clist = new ArrayList<>();
        int pid = cartitem.getProduct().getId();
        Product pp = ps.getProdById(pid);
        System.out.println(pp.getName());
        cartitem.setProduct(pp);
//        这里要做购物车数据持久化
        UserCart userCart = new UserCart();
//        把session里的userID取出来绑定cartitem
        User u = (User)session.getAttribute("nowuser");
        userCart.setUserid(u.getId());
        userCart.setProductid(pid);
        userCart.setAmount(cartitem.getAmount());
        int changeNum = ucs.insertToCart(userCart);
        System.out.println("插入/修改+"+changeNum);

        return showCart(u,clist,model);
    }

    @GetMapping(value = "/all")
    public String seeCart(@ModelAttribute Cartitem cartitem, HttpSession session, Model model){
        List<Cartitem> clist = new ArrayList<>();
        User u = (User)session.getAttribute("nowuser");
        return showCart(u,clist,model);
    }

    @GetMapping(value = "/del")
    public String delSingle(@RequestParam("id") int pid,HttpSession session){
        User u = (User)session.getAttribute("nowuser");
        ucs.deleteById(u.getId(),pid);

        return "redirect:../cart/all";
    }


//    提取共有方法
    private String showCart(User u,List<Cartitem> clist, Model model){
//        同时去取出该用户id下的所有cartitem
        uclist = ucs.getCartByUid(u.getId());
//        iter
        for (UserCart cart : uclist) {
            Cartitem tempC = new Cartitem();
            int productid = cart.getProductid();
            Product prod = ps.getProdById(productid);
            tempC.setProduct(prod);
            tempC.setAmount(cart.getAmount());
            clist.add(tempC);
        }
        model.addAttribute("clist",clist);
        return "mycart";
    }

}
