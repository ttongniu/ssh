package com.ssh.service.impl;

import com.ssh.dao.UserDao;
import com.ssh.model.User;
import com.ssh.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author ntt
 * @create 2018-02-02 17:37
 * @desc
 **/
@Service("userService")
public class UserServiceImpl implements UserService{
     @Resource
     private UserDao userDao;


    // 注入事务管理
    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public User getUser(Integer uid) {
        return userDao.getUser(uid);
    }
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
