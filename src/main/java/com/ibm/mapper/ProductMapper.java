package com.ibm.mapper;

import com.ibm.bean.Product;
import com.ibm.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author dva
 * @create 2019-03-20 16:53
 */
@Mapper
@Repository
public interface ProductMapper {


    @Select("SELECT COUNT(*) FROM PRODUCT")
    int findTotalCount();

    @Select("SELECT * FROM PRODUCT WHERE ID = #{id}")
    Product findProdById(@Param("id") int id);
}
