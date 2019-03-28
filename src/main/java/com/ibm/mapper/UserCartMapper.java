package com.ibm.mapper;

import com.ibm.bean.UserCart;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dva
 * @create 2019-03-26 10:41
 */
@Mapper
@Repository
public interface UserCartMapper {

//    nb!!!
    @Insert({"INSERT INTO USERCART (USERID,PRODUCTID,AMOUNT)",
                " VALUES (#{userid},#{productid},#{amount})",
                " ON DUPLICATE KEY UPDATE AMOUNT = AMOUNT + #{amount}"})
    int insertCart(UserCart userCart);

    @Select({"SELECT * FROM USERCART WHERE USERID =#{id}"})
    List<UserCart> selectCartByUserId(@Param("id")int id);

    @Delete("DELETE FROM USERCART WHERE USERID = #{id} AND PRODUCTID = #{pid}")
    void deleteByIdAndPid(@Param("id")int id, @Param("pid")int pid);
}
