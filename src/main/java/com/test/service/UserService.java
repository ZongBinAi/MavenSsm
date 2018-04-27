package com.test.service;

import com.test.model.User;

/**
 * @author aizongbin
 * @date 2018/4/27 8:28
 */
public interface UserService {
    /**
     * 根据id获取用户信息
     * @param id    用户id
     * @return  返回用户信息
     */
    public User selectUserById(Integer id);
}
