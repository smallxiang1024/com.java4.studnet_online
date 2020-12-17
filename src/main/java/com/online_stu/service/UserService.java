/**
 * @ClassName UserService
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/10 18:05
 * @updateDate 2020/12/10 18:05
 * @version 1.0
 **/


package com.online_stu.service;

import com.online_stu.bean.user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 @author ljh
 @create 2020-12-10-18:05
 **/

public interface UserService {
    //查询
    public user selectByNamePassService( String name,  String pass);

    //添加
    public void addUserService(user uu);

    //删除
    public void deleteByidService(int id);

    //修改
    public void updateByidService(user uu);
}
