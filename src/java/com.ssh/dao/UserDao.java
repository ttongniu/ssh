package com.ssh.dao;

import com.ssh.model.User;

/**
 * @author ntt
 * @create 2018-02-02 16:32
 * @desc
 **/
public interface UserDao {

    User getUser(Integer uid);

    void saveUser(User user);

}
