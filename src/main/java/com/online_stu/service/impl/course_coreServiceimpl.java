/**
 * @ClassName course_coreServiceimpl
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 21:49
 * @updateDate 2020/12/2 21:49
 * @version 1.0
 **/
package com.online_stu.service.impl;

import com.online_stu.bean.Course;
import com.online_stu.bean.Student;
import com.online_stu.bean.score;
import com.online_stu.dao.Course_scoreDao;
import com.online_stu.service.course_coreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 @author ljh
 @create 2020-12-02-21:49
 **/
@Service
@Transactional
public class course_coreServiceimpl implements course_coreService {

    @Autowired
    private Course_scoreDao scoreDao;
    @Override
    public List<Course> SelctBylist() {
        List<Course> courses = scoreDao.SelectCourse_scoreBylist();
        return courses;
    }

    @Override
    public void insertCore(score cc) {
        scoreDao.addCourse_score(cc);
    }

    @Override
    public void updateCore(score cc) {
        scoreDao.updateCourse_score(cc);
    }

    @Override
    public void deleteCoreById(int id) {
        scoreDao.deleteCourse_scoreByid(id);
    }


}
