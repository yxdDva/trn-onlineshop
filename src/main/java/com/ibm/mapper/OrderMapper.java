package com.ibm.mapper;

import com.ibm.bean.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author dva
 * @create 2019-03-27 11:41
 */
@Mapper
@Repository
public interface OrderMapper {

//    waring:order is keyword,need to rename
    @Insert({"INSERT INTO USERORDER (ORDERID,USERID,PRODUCTID,AMOUNT,TIME)",
                " VALUES (#{orderId},#{userId},#{productId},#{amount},#{time})"})
    int addOrder(Order order);
}
