package com.ibm.service;

import com.ibm.bean.User;

/**
 * @author dva
 * @create 2019-03-27 11:29
 */
public interface OrderService {

    int addItemsToOrder(String[] arr, User user);
}
