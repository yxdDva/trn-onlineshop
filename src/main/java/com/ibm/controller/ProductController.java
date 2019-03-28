package com.ibm.controller;

import com.ibm.bean.Cartitem;
import com.ibm.bean.Product;
import com.ibm.bean.User;
import com.ibm.bean.UserCart;
import com.ibm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dva
 * @create 2019-03-19 15:28
 */
@Controller
@RequestMapping("/prod")
public class ProductController {

    @Autowired
    private ProductService ps;


    @GetMapping(value = "/sp")
    public String searchProd(Model model){

        int totalCount = ps.getMaxId();
        List<Product> prodlist = new ArrayList<>();
        for(int i = 1 ; i <= totalCount ; i++){
            Product prod = ps.getProdById(i);
            prodlist.add(prod);
        }
        model.addAttribute("prodlist",prodlist);

        return "home";
    }

    @GetMapping(value = "/detail")
    public String detail(@RequestParam("id") int id, Model model){
        Product pp = ps.getProdById(id);
        System.out.println("id:"+pp.getId());
        model.addAttribute("pp",pp);
//        非常重要，要先有一个对象，可以通过@ModelAttribute的方式加载出来
        Cartitem cartitem = new Cartitem();
        cartitem.setProduct(new Product());
        model.addAttribute("cartitem",cartitem);
//        model.addAttribute("product",new Product());
        return "product-detail";
    }


}
