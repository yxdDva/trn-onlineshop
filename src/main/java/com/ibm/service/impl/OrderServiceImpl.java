package com.ibm.service.impl;

import com.ibm.bean.Order;
import com.ibm.bean.User;
import com.ibm.bean.UserCart;
import com.ibm.mapper.OrderMapper;
import com.ibm.mapper.UserCartMapper;
import com.ibm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * @author dva
 * @create 2019-03-27 11:39
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserCartMapper userCartMapper;

    @Override
    public int addItemsToOrder(String[] arr, User user) {

//        一笔订单的uuid是唯一的
        String orderId= UUID.randomUUID().toString().replace("-","");
//        count
        int count = 0;

        for (String s : arr) {
            Order order = new Order();

            String[] split = s.split(",");
            int pid = Integer.parseInt(split[0]);
            int amount = Integer.parseInt(split[1]);
            order.setProductId(pid);
            order.setAmount(amount);
//            timestamp
            order.setTime(new Timestamp(System.currentTimeMillis()));
            int uid = user.getId();
            order.setUserId(uid);
//            UUID as orderNo
            order.setOrderId(orderId);
//            once loop is an order object
            count+= orderMapper.addOrder(order);

//            finally need to delete the product in the cart
            userCartMapper.deleteByIdAndPid(uid,pid);
        }

        return count;
    }
}
