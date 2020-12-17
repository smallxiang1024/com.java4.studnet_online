/**
 * @ClassName UserDao
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/10 17:18
 * @updateDate 2020/12/10 17:18
 * @version 1.0
 **/


package com.online_stu.dao;

import com.online_stu.bean.user;
import org.apache.ibatis.annotations.Param;

/**
 @author ljh
 @create 2020-12-10-17:18
 **/
public interface UserDao {

    //查询
   public user selectByNamePass(@Param("name") String name,@Param("pawd") String pass);

   //添加
    public void addUser(user uu);

    //删除
    public void deleteByid(int id);

    //修改
    public void updateByid(user uu);
}
