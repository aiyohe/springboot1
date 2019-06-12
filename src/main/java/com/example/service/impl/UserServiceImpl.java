package com.example.service.impl;

import com.example.dao.UserRepository;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:59 2019/6/12
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString().replace("-",""));
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(String id) {
            userRepository.deleteById(id);
    }
}
