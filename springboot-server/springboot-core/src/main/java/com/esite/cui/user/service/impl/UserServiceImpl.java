package com.esite.cui.user.service.impl;

import com.esite.cui.user.dao.UserDao;
import com.esite.cui.user.entity.User;
import com.esite.cui.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String saveUser(User user) {
        User result=this.userDao.save(user);
        return result.getId();
    }
}
