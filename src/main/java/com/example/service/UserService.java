package com.example.service;

import com.example.entity.User;

import java.util.List;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:59 2019/6/12
 * @Modified By:
 */
public interface UserService {
    List<User> getUserList();

     User findUserById(String id);

     void save(User user);

     void edit(User user);

     void delete(String id);
}
