/**
 * @ClassName Course_scoreDao
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 21:49
 * @updateDate 2020/12/2 21:49
 * @version 1.0
 **/


package com.online_stu.dao;

import com.online_stu.bean.Course;
import com.online_stu.bean.Student;
import com.online_stu.bean.score;

import java.util.List;

/**
 @author ljh and smallxiang
 @create 2020-12-02-21:49
 **/
public interface Course_scoreDao {

    //查询所有
    public List<Course> SelectCourse_scoreBylist();

    //更新
    public void updateCourse_score(score s);


    //添加成绩
        public void addCourse_score(score s);

    //删除成绩
    public void deleteCourse_scoreByid(int id);
}
