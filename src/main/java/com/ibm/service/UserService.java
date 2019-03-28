package com.ibm.service;

import com.ibm.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author dva
 * @create 2019-03-14 19:37
 */
public interface UserService {

    User getUserByNameAndUpwd(User user) throws Exception;

    User getUserById(int id);
}
