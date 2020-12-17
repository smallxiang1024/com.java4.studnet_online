/**
 * @ClassName CourseService
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 11:18
 * @updateDate 2020/12/2 11:18
 * @version 1.0
 **/


package com.online_stu.service;

import com.online_stu.bean.Course;

import java.util.List;

/**
 @author ljh
 @create 2020-12-02-11:18
 **/
public interface CourseService  {

    //查询全部课程
    public List<Course> selctByList();
    //按照sid 删除课程
    public void deleteBysid(int id);
    //按照sid更新
    public void updateBysid(Course c);

    public void addCourse(Course cc);
}
