package com.example.dao;

import com.example.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:44 2019/6/11
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;
    @Test
    public void test(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

       /* userRepository.save(new User(UUID.randomUUID().toString().replace("-",""),"aa2", "aa", "aa@127.com", "aa123456",formattedDate));
        userRepository.save(new User(UUID.randomUUID().toString().replace("-",""),"bb3",  "bb", "bb@126.com","bb123456",formattedDate));
        userRepository.save(new User(UUID.randomUUID().toString().replace("-",""),"cc4",  "cc","cc@126.com", "cc123456",formattedDate));*/

        //Assert.assertEquals(9, userRepository.findAll().size());
        //判断是否与该值是否一致，数据仅为一条
        //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb3", "bb@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa2"));
    }
}
