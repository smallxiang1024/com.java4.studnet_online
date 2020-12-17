/**
 * @ClassName CourseDao
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 10:57
 * @updateDate 2020/12/2 10:57
 * @version 1.0
 **/


package com.online_stu.dao;

import com.online_stu.bean.Course;

import java.util.List;

/**
 @author ljh
 @create 2020-12-02-10:57
 **/
public interface CourseDao {
    //查询所有课程
    public List<Course> selectByList();

    //按照课程号查询

    //按照课程号修改
    public void updateByCid(Course cc);
    //按照课程号删除
    public void deleteByid(int id);

    //添加课程
    public void addCourse(Course cc);

}
