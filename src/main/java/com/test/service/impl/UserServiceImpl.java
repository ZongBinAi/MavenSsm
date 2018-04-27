package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author aizongbin
 * @date 2018/4/27 8:28
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }
}
