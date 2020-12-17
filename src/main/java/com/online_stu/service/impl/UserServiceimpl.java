/**
 * @ClassName UserServiceimpl
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/10 18:09
 * @updateDate 2020/12/10 18:09
 * @version 1.0
 **/
package com.online_stu.service.impl;

import com.online_stu.bean.user;
import com.online_stu.dao.UserDao;
import com.online_stu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 @author ljh
 @create 2020-12-10-18:09
 **/
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public user selectByNamePassService(String name, String pass) {
        user user = userDao.selectByNamePass(name, pass);
        return user;
    }

    @Override
    public void addUserService(user uu) {
        userDao.addUser(uu);
    }

    @Override
    public void deleteByidService(int id) {
        userDao.deleteByid(id);
    }

    @Override
    public void updateByidService(user uu) {
        userDao.updateByid(uu);
    }
}
