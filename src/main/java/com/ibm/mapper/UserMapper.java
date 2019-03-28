package com.ibm.mapper;

import com.ibm.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dva
 * @create 2019-03-14 16:49
 */
@Mapper
@Repository
public interface UserMapper{

    @Select("SELECT * FROM USER")
    List<User> findAll();


    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User findById(@Param("id") int id);

    @Select("SELECT * FROM USER WHERE EMAIL =#{email}")
    User findByEmail(@Param("email") String email);

    @Select("SELECT * FROM USER WHERE USERNAME =#{username}")
    User findByUsername(@Param("username") String username);

    @Insert({"INSERT INTO USER (USERNAME, PASSWORD)",
            " VALUES (#{userName},#{passWord})"})
    int insert(User user);

    @Update({"UPDATE USER SET PASSWORD=#{passWord} WHERE USERNAME =#{userName}"})
    int update(User user);

    @Delete("DELETE FROM USER WHERE USERNAME =#{userName}")
    void delete(User user);
}
