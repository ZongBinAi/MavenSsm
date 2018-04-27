package com.test.dao;

import com.test.model.User;

/**
 * @author aizongbin
 * @date 2018/4/27 8:27
 */
public interface UserDao {
    /**
     * 根据id获取用户信息
     * @param id    用户id
     * @return  返回用户信息
     */
    public User selectUserById(Integer id);
}
