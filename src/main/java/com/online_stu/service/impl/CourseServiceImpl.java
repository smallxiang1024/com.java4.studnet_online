/**
 * @ClassName CourseServiceImpl
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 16:51
 * @updateDate 2020/12/2 16:51
 * @version 1.0
 **/
package com.online_stu.service.impl;

import com.online_stu.bean.Course;
import com.online_stu.dao.CourseDao;
import com.online_stu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 @author ljh
 @create 2020-12-02-16:51
 **/
@Service("courseServiceImpl")
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;
    @Override
    public List<Course> selctByList() {
        List<Course> courses = courseDao.selectByList();
        return courses;
    }

    @Override
    public void deleteBysid(int id) {
        courseDao.deleteByid(id);
    }

    @Override
    public void updateBysid(Course c) {
        courseDao.updateByCid(c);
    }

    @Override
    public void addCourse(Course cc) {
        courseDao.addCourse(cc);
    }
}
