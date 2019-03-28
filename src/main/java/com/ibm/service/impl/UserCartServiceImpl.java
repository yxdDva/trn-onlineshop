package com.ibm.service.impl;

import com.ibm.bean.UserCart;
import com.ibm.mapper.UserCartMapper;
import com.ibm.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dva
 * @create 2019-03-22 14:21
 */
@Service
public class UserCartServiceImpl implements UserCartService {

    @Autowired
    private UserCartMapper userCartMapper;

    @Override
    public int insertToCart(UserCart userCart) {

        int changNum = userCartMapper.insertCart(userCart);
        return changNum;
    }

    @Override
    public List<UserCart> getCartByUid(int id) {
        List<UserCart> userCarts = userCartMapper.selectCartByUserId(id);

//        for (UserCart userCart : userCarts) {
//
//        }

        return userCarts;
    }

    @Override
    public void deleteById(int id, int pid) {
        userCartMapper.deleteByIdAndPid(id,pid);
    }

}
