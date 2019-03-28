package com.ibm.service.impl;

import com.ibm.bean.User;
//import com.ibm.dao.UserDao;
//import com.ibm.daoimpl.UserDaoImpl;
import com.ibm.mapper.UserMapper;
import com.ibm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author dva
 * @create 2019-03-14 19:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    UserDao userDao;

    public User getUserByNameAndUpwd(User user) throws Exception {

        User u =  userMapper.findByUsername(user.getUserName());
//        User u = userDao.findById();
        if(u != null){
            String upwd = user.getPassWord();
            if(u.getPassWord().equals(upwd)){
                return u;
            }else {
                throw new Exception("密码错误");
            }
        }else {
            throw new Exception("用户名不存在");
        }

    }

    @Override
    public User getUserById(int id) {

        User u = userMapper.findById(id);
        return u;
    }
}
