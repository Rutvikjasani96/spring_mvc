package com.spring_mvc.service;

import com.spring_mvc.dao.UserDao;
import com.spring_mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public int createUser(User user) {
        return userDao.saveUser(user);
    }
}
