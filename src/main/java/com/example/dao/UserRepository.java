package com.example.dao;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:24 2019/6/11
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);
}
