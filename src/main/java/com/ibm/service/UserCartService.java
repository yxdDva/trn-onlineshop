package com.ibm.service;

import com.ibm.bean.UserCart;

import java.util.List;

/**
 * @author dva
 * @create 2019-03-22 14:20
 */
public interface UserCartService {

    int insertToCart(UserCart userCart);

    List<UserCart> getCartByUid(int id);

    void deleteById(int id, int pid);
}
