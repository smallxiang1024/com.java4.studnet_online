/**
 * @ClassName course_coreService
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 21:47
 * @updateDate 2020/12/2 21:47
 * @version 1.0
 **/


package com.online_stu.service;

import com.online_stu.bean.Course;
import com.online_stu.bean.score;

import java.util.List;

/**
 @author ljh
 @create 2020-12-02-21:47
 **/
public interface course_coreService {
//查询所有
    public List<Course> SelctBylist();

    public void insertCore(score cc);

    public void updateCore(score cc);

    public void deleteCoreById(int id);

}
