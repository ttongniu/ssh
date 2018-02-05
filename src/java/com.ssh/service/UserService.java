package com.ssh.service;

import com.ssh.model.User;

/**
 * @author ntt
 * @create 2018-02-02 17:37
 * @desc
 **/
public interface UserService {

    User getUser(Integer uid);

    void saveUser(User user);
}
